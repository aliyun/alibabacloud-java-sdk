// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeRunningQueryRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 分页码 从1开始 默认值1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小 默认值30
    @NameInMap("PageSize")
    public Integer pageSize;

    // 指定查询最小持续时间 毫秒 最小值1000 默认值1000
    @NameInMap("QueryDurationMs")
    public Long queryDurationMs;

    // 指定查询ID
    @NameInMap("QueryId")
    public String queryId;

    // 指定查询关键字
    @NameInMap("QueryKeyWord")
    public String queryKeyWord;

    // 指定查询用户
    @NameInMap("QueryUser")
    public String queryUser;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static DescribeRunningQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningQueryRequest self = new DescribeRunningQueryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRunningQueryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeRunningQueryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunningQueryRequest setQueryDurationMs(Long queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Long getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeRunningQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeRunningQueryRequest setQueryKeyWord(String queryKeyWord) {
        this.queryKeyWord = queryKeyWord;
        return this;
    }
    public String getQueryKeyWord() {
        return this.queryKeyWord;
    }

    public DescribeRunningQueryRequest setQueryUser(String queryUser) {
        this.queryUser = queryUser;
        return this;
    }
    public String getQueryUser() {
        return this.queryUser;
    }

    public DescribeRunningQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRunningQueryRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
