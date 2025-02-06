// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp100p4q1g9z3****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>2023-06-07 10:03:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The code of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>clickhouse</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("QueryDurationMs")
    public String queryDurationMs;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>2023-04-13 17:48:00</p>
     */
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
