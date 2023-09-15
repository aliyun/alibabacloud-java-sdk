// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Product")
    public String product;

    @NameInMap("QueryDurationMs")
    public String queryDurationMs;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSlowLogTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendRequest self = new DescribeSlowLogTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowLogTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogTrendRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSlowLogTrendRequest setQueryDurationMs(String queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public String getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeSlowLogTrendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSlowLogTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
