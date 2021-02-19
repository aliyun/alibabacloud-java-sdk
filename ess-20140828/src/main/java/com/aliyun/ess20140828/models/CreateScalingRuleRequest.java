// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScalingRuleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("Cooldown")
    public Integer cooldown;

    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    @NameInMap("AdjustmentType")
    public String adjustmentType;

    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    @NameInMap("EstimatedInstanceWarmup")
    public Integer estimatedInstanceWarmup;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("TargetValue")
    public Float targetValue;

    @NameInMap("DisableScaleIn")
    public Boolean disableScaleIn;

    @NameInMap("ScaleInEvaluationCount")
    public Integer scaleInEvaluationCount;

    @NameInMap("ScaleOutEvaluationCount")
    public Integer scaleOutEvaluationCount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("PredictiveScalingMode")
    public String predictiveScalingMode;

    @NameInMap("PredictiveValueBehavior")
    public String predictiveValueBehavior;

    @NameInMap("PredictiveValueBuffer")
    public Integer predictiveValueBuffer;

    @NameInMap("PredictiveTaskBufferTime")
    public Integer predictiveTaskBufferTime;

    @NameInMap("InitialMaxSize")
    public Integer initialMaxSize;

    @NameInMap("StepAdjustment")
    public java.util.List<CreateScalingRuleRequestStepAdjustment> stepAdjustment;

    public static CreateScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingRuleRequest self = new CreateScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScalingRuleRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public CreateScalingRuleRequest setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public CreateScalingRuleRequest setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    public CreateScalingRuleRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public CreateScalingRuleRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public CreateScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public CreateScalingRuleRequest setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }
    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    public CreateScalingRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CreateScalingRuleRequest setTargetValue(Float targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Float getTargetValue() {
        return this.targetValue;
    }

    public CreateScalingRuleRequest setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }
    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    public CreateScalingRuleRequest setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
        this.scaleInEvaluationCount = scaleInEvaluationCount;
        return this;
    }
    public Integer getScaleInEvaluationCount() {
        return this.scaleInEvaluationCount;
    }

    public CreateScalingRuleRequest setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
        this.scaleOutEvaluationCount = scaleOutEvaluationCount;
        return this;
    }
    public Integer getScaleOutEvaluationCount() {
        return this.scaleOutEvaluationCount;
    }

    public CreateScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingRuleRequest setPredictiveScalingMode(String predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode;
        return this;
    }
    public String getPredictiveScalingMode() {
        return this.predictiveScalingMode;
    }

    public CreateScalingRuleRequest setPredictiveValueBehavior(String predictiveValueBehavior) {
        this.predictiveValueBehavior = predictiveValueBehavior;
        return this;
    }
    public String getPredictiveValueBehavior() {
        return this.predictiveValueBehavior;
    }

    public CreateScalingRuleRequest setPredictiveValueBuffer(Integer predictiveValueBuffer) {
        this.predictiveValueBuffer = predictiveValueBuffer;
        return this;
    }
    public Integer getPredictiveValueBuffer() {
        return this.predictiveValueBuffer;
    }

    public CreateScalingRuleRequest setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
        this.predictiveTaskBufferTime = predictiveTaskBufferTime;
        return this;
    }
    public Integer getPredictiveTaskBufferTime() {
        return this.predictiveTaskBufferTime;
    }

    public CreateScalingRuleRequest setInitialMaxSize(Integer initialMaxSize) {
        this.initialMaxSize = initialMaxSize;
        return this;
    }
    public Integer getInitialMaxSize() {
        return this.initialMaxSize;
    }

    public CreateScalingRuleRequest setStepAdjustment(java.util.List<CreateScalingRuleRequestStepAdjustment> stepAdjustment) {
        this.stepAdjustment = stepAdjustment;
        return this;
    }
    public java.util.List<CreateScalingRuleRequestStepAdjustment> getStepAdjustment() {
        return this.stepAdjustment;
    }

    public static class CreateScalingRuleRequestStepAdjustment extends TeaModel {
        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

        @NameInMap("ScalingAdjustment")
        public Integer scalingAdjustment;

        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        public static CreateScalingRuleRequestStepAdjustment build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestStepAdjustment self = new CreateScalingRuleRequestStepAdjustment();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestStepAdjustment setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        public Float getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        public CreateScalingRuleRequestStepAdjustment setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }
        public Integer getScalingAdjustment() {
            return this.scalingAdjustment;
        }

        public CreateScalingRuleRequestStepAdjustment setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        public Float getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

    }

}
