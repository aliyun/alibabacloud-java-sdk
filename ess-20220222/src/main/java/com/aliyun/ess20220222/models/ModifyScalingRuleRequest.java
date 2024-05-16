// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    /**
     * <p>The adjustment method of the scaling rule. This is required when the ScalingRuleType parameter is set to SimpleScalingRule or StepScalingRule. Valid values:</p>
     * <br>
     * <p>*   QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</p>
     * <p>*   PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</p>
     * <p>*   TotalCapacity: adjusts the number of ECS instances in the scaling group to the specified number.</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The target value specified in the scaling rule. This parameter is required when the ScalingRuleType parameter is set to SimpleScalingRule or StepScalingRule. The number of ECS instances that are scaled in a single scaling activity cannot exceed 1,000.</p>
     * <br>
     * <p>*   Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</p>
     * <p>*   Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</p>
     * <p>*   Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>监控项维度信息值，适用于目标追踪规则，当监控项需额外维度信息时设置，例如LoadBalancerRealServerAverageQps监控项需指定rulePool维度信息。</p>
     */
    @NameInMap("AlarmDimensions")
    public java.util.List<ModifyScalingRuleRequestAlarmDimensions> alarmDimensions;

    /**
     * <p>The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule.</p>
     * <br>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     */
    @NameInMap("Cooldown")
    public Integer cooldown;

    /**
     * <p>Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.</p>
     */
    @NameInMap("DisableScaleIn")
    public Boolean disableScaleIn;

    /**
     * <p>The warmup period of an instance. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. Auto Scaling adds ECS instances that are in the warmup state to a scaling group but does not report monitoring data to CloudMonitor during the warmup period.</p>
     * <br>
     * <p>> Auto Scaling calculates the number of ECS instances that need to be scaled. ECS instances in the warmup state are not counted towards the current capacity of the scaling group.</p>
     * <br>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     */
    @NameInMap("EstimatedInstanceWarmup")
    public Integer estimatedInstanceWarmup;

    /**
     * <p>The maximum number of ECS instances in the scaling group. If you specify this parameter, you must also specify the PredictiveValueBehavior parameter.</p>
     */
    @NameInMap("InitialMaxSize")
    public Integer initialMaxSize;

    /**
     * <p>The predefined metric that you want to monitor. This parameter is required only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule.</p>
     * <br>
     * <p>Valid values if you set the ScalingRuleType parameter to TargetTrackingScalingRule:</p>
     * <br>
     * <p>*   CpuUtilization: the average CPU utilization</p>
     * <p>*   ClassicInternetRx: the average inbound Internet traffic over the classic network</p>
     * <p>*   ClassicInternetTx: the average outbound Internet traffic over the classic network</p>
     * <p>*   VpcInternetRx: the average inbound Internet traffic over the virtual private cloud (VPC)</p>
     * <p>*   VpcInternetTx: the average outbound Internet traffic over the VPC</p>
     * <p>*   IntranetRx: the average inbound traffic over the internal network</p>
     * <p>*   IntranetTx: the average outbound traffic over the internal network</p>
     * <br>
     * <p>Valid values if you set the ScalingRuleType parameter to PredictiveScalingRule:</p>
     * <br>
     * <p>*   CpuUtilization: the average CPU utilization</p>
     * <p>*   IntranetRx: the average inbound traffic over the internal network</p>
     * <p>*   IntranetTx: the average outbound traffic over the internal network</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The minimum number of instances that must be scaled when the AdjustmentType parameter is set to PercentChangeInCapacity. This parameter takes effect only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule.</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The mode of the predictive scaling rule. Valid values:</p>
     * <br>
     * <p>*   PredictAndScale: produces predictions and creates prediction tasks.</p>
     * <p>*   PredictOnly: produces predictions but does not create prediction tasks.</p>
     */
    @NameInMap("PredictiveScalingMode")
    public String predictiveScalingMode;

    /**
     * <p>The amount of buffer time before the prediction task is executed. By default, all prediction tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify an amount of buffer time for resource preparation before the prediction tasks are executed. Valid values: 0 to 60.</p>
     */
    @NameInMap("PredictiveTaskBufferTime")
    public Integer predictiveTaskBufferTime;

    /**
     * <p>Specifies which one of the initial maximum capacity and the predicted value can be used as the maximum value for prediction tasks. Valid values:</p>
     * <br>
     * <p>*   MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.</p>
     * <p>*   PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks when the predicted value is greater than the initial maximum capacity.</p>
     * <p>*   PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a percentage that is specified by the PredictiveValueBuffer parameter. If the predicted value that is increased by the percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks.</p>
     */
    @NameInMap("PredictiveValueBehavior")
    public String predictiveValueBehavior;

    /**
     * <p>The percentage of the increment to the predicted value when the PredictiveValueBehavior parameter is set to PredictiveValueOverrideMaxWithBuffer. If the predicted value increased by this percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.</p>
     */
    @NameInMap("PredictiveValueBuffer")
    public Integer predictiveValueBuffer;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
     */
    @NameInMap("ScaleInEvaluationCount")
    public Integer scaleInEvaluationCount;

    /**
     * <p>The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
     */
    @NameInMap("ScaleOutEvaluationCount")
    public Integer scaleOutEvaluationCount;

    /**
     * <p>The ID of the scaling rule that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    /**
     * <p>The name of the scaling rule. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit. The name of a scaling rule must be unique in the scaling group to which the scaling rule belongs and within an Alibaba Cloud account.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>Details of the step adjustments.</p>
     */
    @NameInMap("StepAdjustments")
    public java.util.List<ModifyScalingRuleRequestStepAdjustments> stepAdjustments;

    /**
     * <p>The target value. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can have up to three decimal places.</p>
     */
    @NameInMap("TargetValue")
    public Float targetValue;

    public static ModifyScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleRequest self = new ModifyScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ModifyScalingRuleRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ModifyScalingRuleRequest setAlarmDimensions(java.util.List<ModifyScalingRuleRequestAlarmDimensions> alarmDimensions) {
        this.alarmDimensions = alarmDimensions;
        return this;
    }
    public java.util.List<ModifyScalingRuleRequestAlarmDimensions> getAlarmDimensions() {
        return this.alarmDimensions;
    }

    public ModifyScalingRuleRequest setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public ModifyScalingRuleRequest setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }
    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    public ModifyScalingRuleRequest setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }
    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    public ModifyScalingRuleRequest setInitialMaxSize(Integer initialMaxSize) {
        this.initialMaxSize = initialMaxSize;
        return this;
    }
    public Integer getInitialMaxSize() {
        return this.initialMaxSize;
    }

    public ModifyScalingRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ModifyScalingRuleRequest setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    public ModifyScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingRuleRequest setPredictiveScalingMode(String predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode;
        return this;
    }
    public String getPredictiveScalingMode() {
        return this.predictiveScalingMode;
    }

    public ModifyScalingRuleRequest setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
        this.predictiveTaskBufferTime = predictiveTaskBufferTime;
        return this;
    }
    public Integer getPredictiveTaskBufferTime() {
        return this.predictiveTaskBufferTime;
    }

    public ModifyScalingRuleRequest setPredictiveValueBehavior(String predictiveValueBehavior) {
        this.predictiveValueBehavior = predictiveValueBehavior;
        return this;
    }
    public String getPredictiveValueBehavior() {
        return this.predictiveValueBehavior;
    }

    public ModifyScalingRuleRequest setPredictiveValueBuffer(Integer predictiveValueBuffer) {
        this.predictiveValueBuffer = predictiveValueBuffer;
        return this;
    }
    public Integer getPredictiveValueBuffer() {
        return this.predictiveValueBuffer;
    }

    public ModifyScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingRuleRequest setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
        this.scaleInEvaluationCount = scaleInEvaluationCount;
        return this;
    }
    public Integer getScaleInEvaluationCount() {
        return this.scaleInEvaluationCount;
    }

    public ModifyScalingRuleRequest setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
        this.scaleOutEvaluationCount = scaleOutEvaluationCount;
        return this;
    }
    public Integer getScaleOutEvaluationCount() {
        return this.scaleOutEvaluationCount;
    }

    public ModifyScalingRuleRequest setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public ModifyScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ModifyScalingRuleRequest setStepAdjustments(java.util.List<ModifyScalingRuleRequestStepAdjustments> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
        return this;
    }
    public java.util.List<ModifyScalingRuleRequestStepAdjustments> getStepAdjustments() {
        return this.stepAdjustments;
    }

    public ModifyScalingRuleRequest setTargetValue(Float targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Float getTargetValue() {
        return this.targetValue;
    }

    public static class ModifyScalingRuleRequestAlarmDimensions extends TeaModel {
        /**
         * <p>监控项关联的维度信息键。</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>监控项关联的维度信息值。</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static ModifyScalingRuleRequestAlarmDimensions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestAlarmDimensions self = new ModifyScalingRuleRequestAlarmDimensions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestAlarmDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ModifyScalingRuleRequestAlarmDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class ModifyScalingRuleRequestStepAdjustments extends TeaModel {
        /**
         * <p>The lower limit that is specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.</p>
         */
        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        /**
         * <p>The upper limit specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.</p>
         */
        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

        /**
         * <p>The number of ECS instances that you want to scale in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule.</p>
         */
        @NameInMap("ScalingAdjustment")
        public Integer scalingAdjustment;

        public static ModifyScalingRuleRequestStepAdjustments build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestStepAdjustments self = new ModifyScalingRuleRequestStepAdjustments();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestStepAdjustments setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        public Float getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

        public ModifyScalingRuleRequestStepAdjustments setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        public Float getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        public ModifyScalingRuleRequestStepAdjustments setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }
        public Integer getScalingAdjustment() {
            return this.scalingAdjustment;
        }

    }

}
