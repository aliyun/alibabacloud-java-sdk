// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceCountriesRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribePortViewSourceCountriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceCountriesRequest self = new DescribePortViewSourceCountriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceCountriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribePortViewSourceCountriesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribePortViewSourceCountriesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePortViewSourceCountriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
