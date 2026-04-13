// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ScalingActivity extends TeaModel {
    @NameInMap("componentTypes")
    public String componentTypes;

    @NameInMap("description")
    public String description;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("policyType")
    public String policyType;

    @NameInMap("scalingActivityId")
    public String scalingActivityId;

    @NameInMap("scalingActivityState")
    public String scalingActivityState;

    @NameInMap("scalingPolicyId")
    public String scalingPolicyId;

    @NameInMap("scalingRuleDetail")
    public String scalingRuleDetail;

    @NameInMap("scalingRuleId")
    public String scalingRuleId;

    @NameInMap("scalingRuleName")
    public String scalingRuleName;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("timeZone")
    public String timeZone;

    public static ScalingActivity build(java.util.Map<String, ?> map) throws Exception {
        ScalingActivity self = new ScalingActivity();
        return TeaModel.build(map, self);
    }

    public ScalingActivity setComponentTypes(String componentTypes) {
        this.componentTypes = componentTypes;
        return this;
    }
    public String getComponentTypes() {
        return this.componentTypes;
    }

    public ScalingActivity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ScalingActivity setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ScalingActivity setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ScalingActivity setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ScalingActivity setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public ScalingActivity setScalingActivityState(String scalingActivityState) {
        this.scalingActivityState = scalingActivityState;
        return this;
    }
    public String getScalingActivityState() {
        return this.scalingActivityState;
    }

    public ScalingActivity setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    public ScalingActivity setScalingRuleDetail(String scalingRuleDetail) {
        this.scalingRuleDetail = scalingRuleDetail;
        return this;
    }
    public String getScalingRuleDetail() {
        return this.scalingRuleDetail;
    }

    public ScalingActivity setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public ScalingActivity setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingActivity setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ScalingActivity setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
