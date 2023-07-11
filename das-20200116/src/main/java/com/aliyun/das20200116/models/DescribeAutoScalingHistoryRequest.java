// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryRequest extends TeaModel {
    @NameInMap("AutoScalingTaskType")
    public String autoScalingTaskType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAutoScalingHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingHistoryRequest self = new DescribeAutoScalingHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingHistoryRequest setAutoScalingTaskType(String autoScalingTaskType) {
        this.autoScalingTaskType = autoScalingTaskType;
        return this;
    }
    public String getAutoScalingTaskType() {
        return this.autoScalingTaskType;
    }

    public DescribeAutoScalingHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAutoScalingHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAutoScalingHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
