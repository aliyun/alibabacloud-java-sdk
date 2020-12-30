// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpectNum")
    public Integer expectNum;

    @NameInMap("Cause")
    public String cause;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    @NameInMap("Transition")
    public String transition;

    @NameInMap("TotalCapacity")
    public Integer totalCapacity;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("BizId")
    public String bizId;

    public static DescribeScalingActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityResponseBody self = new DescribeScalingActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeScalingActivityResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeScalingActivityResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeScalingActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingActivityResponseBody setExpectNum(Integer expectNum) {
        this.expectNum = expectNum;
        return this;
    }
    public Integer getExpectNum() {
        return this.expectNum;
    }

    public DescribeScalingActivityResponseBody setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public DescribeScalingActivityResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeScalingActivityResponseBody setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public DescribeScalingActivityResponseBody setTransition(String transition) {
        this.transition = transition;
        return this;
    }
    public String getTransition() {
        return this.transition;
    }

    public DescribeScalingActivityResponseBody setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }
    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    public DescribeScalingActivityResponseBody setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeScalingActivityResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
