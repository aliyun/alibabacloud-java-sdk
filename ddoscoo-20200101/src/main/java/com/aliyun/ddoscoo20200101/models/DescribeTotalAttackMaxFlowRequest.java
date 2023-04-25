// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTotalAttackMaxFlowRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeTotalAttackMaxFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalAttackMaxFlowRequest self = new DescribeTotalAttackMaxFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTotalAttackMaxFlowRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeTotalAttackMaxFlowRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeTotalAttackMaxFlowRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTotalAttackMaxFlowRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
