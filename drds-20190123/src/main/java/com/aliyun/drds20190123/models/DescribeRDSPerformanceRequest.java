// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRDSPerformanceRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("RdsInstanceId")
    @Validation(required = true)
    public String rdsInstanceId;

    @NameInMap("Keys")
    @Validation(required = true)
    public String keys;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("DbInstType")
    public String dbInstType;

    public static DescribeRDSPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSPerformanceRequest self = new DescribeRDSPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRDSPerformanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRDSPerformanceRequest setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }
    public String getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    public DescribeRDSPerformanceRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

    public DescribeRDSPerformanceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRDSPerformanceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRDSPerformanceRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

}
