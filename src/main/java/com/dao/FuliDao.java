package com.dao;

import com.entity.FuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FuliView;

/**
 * 福利信息 Dao 接口
 *
 * @author 
 */
public interface FuliDao extends BaseMapper<FuliEntity> {

   List<FuliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
