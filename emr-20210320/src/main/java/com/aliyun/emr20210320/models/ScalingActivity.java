// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingActivity extends TeaModel {
    @NameInMap("Cause")
    public String cause;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EssScalingRuleId")
    public String essScalingRuleId;

    @NameInMap("ExpectNum")
    public Integer expectNum;

    @NameInMap("HostGroupName")
    public String hostGroupName;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TotalCapacity")
    public Integer totalCapacity;

    @NameInMap("Transition")
    public String transition;

    public static ScalingActivity build(java.util.Map<String, ?> map) throws Exception {
        ScalingActivity self = new ScalingActivity();
        return TeaModel.build(map, self);
    }

    public ScalingActivity setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public ScalingActivity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ScalingActivity setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ScalingActivity setEssScalingRuleId(String essScalingRuleId) {
        this.essScalingRuleId = essScalingRuleId;
        return this;
    }
    public String getEssScalingRuleId() {
        return this.essScalingRuleId;
    }

    public ScalingActivity setExpectNum(Integer expectNum) {
        this.expectNum = expectNum;
        return this;
    }
    public Integer getExpectNum() {
        return this.expectNum;
    }

    public ScalingActivity setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    public ScalingActivity setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ScalingActivity setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ScalingActivity setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ScalingActivity setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingActivity setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ScalingActivity setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ScalingActivity setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }
    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    public ScalingActivity setTransition(String transition) {
        this.transition = transition;
        return this;
    }
    public String getTransition() {
        return this.transition;
    }

}
