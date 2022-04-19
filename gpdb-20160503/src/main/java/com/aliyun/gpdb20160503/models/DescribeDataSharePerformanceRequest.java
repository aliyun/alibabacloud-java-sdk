// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataSharePerformanceRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Key")
    public String key;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDataSharePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSharePerformanceRequest self = new DescribeDataSharePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSharePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDataSharePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDataSharePerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDataSharePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
