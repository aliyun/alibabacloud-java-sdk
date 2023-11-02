// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSourceRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Level")
    public java.util.List<String> level;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAlertSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSourceRequest self = new DescribeAlertSourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSourceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertSourceRequest setLevel(java.util.List<String> level) {
        this.level = level;
        return this;
    }
    public java.util.List<String> getLevel() {
        return this.level;
    }

    public DescribeAlertSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertSourceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
