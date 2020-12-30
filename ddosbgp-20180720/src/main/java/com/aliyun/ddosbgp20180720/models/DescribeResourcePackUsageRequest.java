// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeResourcePackUsageRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeResourcePackUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackUsageRequest self = new DescribeResourcePackUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackUsageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeResourcePackUsageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeResourcePackUsageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeResourcePackUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeResourcePackUsageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
