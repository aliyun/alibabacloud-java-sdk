// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryTrendRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 时间窗口终点 UTC时间 默认值当前时间
    @NameInMap("EndTime")
    public String endTime;

    // 查询最小持续时间 毫秒 最小值1000 默认值1000
    @NameInMap("QueryDurationMs")
    public Long queryDurationMs;

    @NameInMap("RegionId")
    public String regionId;

    // 时间窗口起点 UTC时间 默认值当前时间减1小时
    @NameInMap("StartTime")
    public String startTime;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static DescribeSlowQueryTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryTrendRequest self = new DescribeSlowQueryTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryTrendRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowQueryTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowQueryTrendRequest setQueryDurationMs(Long queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Long getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeSlowQueryTrendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSlowQueryTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowQueryTrendRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
