// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    /**
     * <p>The adjustment method of the scaling rule. This is required when the ScalingRuleType parameter is set to SimpleScalingRule or StepScalingRule. Valid values:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</li>
     * <li>PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</li>
     * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to the specified number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The target value specified in the scaling rule. This parameter is required when the ScalingRuleType parameter is set to SimpleScalingRule or StepScalingRule. The number of ECS instances that are scaled in a single scaling activity cannot exceed 1,000.</p>
     * <ul>
     * <li>Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</li>
     * <li>Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</li>
     * <li>Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The dimensions. This parameter is applicable to target tracking scaling rules. You can specify this parameter if your predefined metric requires extra dimensions. For example, if you predefine the LoadBalancerRealServerAverageQps metric, you must use this parameter to specify the rulePool dimension.</p>
     */
    @NameInMap("AlarmDimensions")
    public java.util.List<ModifyScalingRuleRequestAlarmDimensions> alarmDimensions;

    /**
     * <p>The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule.</p>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Cooldown")
    public Integer cooldown;

    /**
     * <p>Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableScaleIn")
    public Boolean disableScaleIn;

    /**
     * <p>The warmup period of an instance. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. Auto Scaling adds ECS instances that are in the warmup state to a scaling group but does not report monitoring data to CloudMonitor during the warmup period.</p>
     * <blockquote>
     * <p>Auto Scaling calculates the number of ECS instances that need to be scaled. ECS instances in the warmup state are not counted towards the current capacity of the scaling group.</p>
     * </blockquote>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("EstimatedInstanceWarmup")
    public Integer estimatedInstanceWarmup;

    /**
     * <p>The maximum number of ECS instances that can be contained in the scaling group. If you specify InitialMaxSize, you must specify <code>PredictiveValueBehavior</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InitialMaxSize")
    public Integer initialMaxSize;

    /**
     * <p>The predefined metric. This parameter is required only if you create a target tracking scaling rule or predictive scaling rule.</p>
     * <p>Valid values if you create a target tracking scaling rule:</p>
     * <ul>
     * <li>CpuUtilization: the average CPU utilization.</li>
     * <li>IntranetTx: the outbound traffic over an internal network.</li>
     * <li>IntranetRx: the inbound traffic over an internal network.</li>
     * <li>VpcInternetTx: the outbound traffic from a virtual private cloud (VPC) to the Internet.</li>
     * <li>VpcInternetRx: the inbound traffic from the Internet to a VPC.</li>
     * <li>MemoryUtilization: the memory usage.</li>
     * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) per Application Load Balancer (ALB) server group.</li>
     * </ul>
     * <p>Valid values if you create a predictive scaling rule:</p>
     * <ul>
     * <li>CpuUtilization: the average CPU utilization.</li>
     * <li>IntranetRx: the inbound traffic over an internal network.</li>
     * <li>IntranetTx: the outbound traffic over an internal network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CpuUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The minimum number of instances to scale. This parameter takes effect only if you create a simple scaling rule or step scaling rule and set <code>AdjustmentType</code> to <code>PercentChangeInCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The mode of the predictive scaling rule. Valid values:</p>
     * <ul>
     * <li>PredictAndScale: produces predictions and creates prediction tasks.</li>
     * <li>PredictOnly: produces predictions but does not create prediction tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PredictAndScale</p>
     */
    @NameInMap("PredictiveScalingMode")
    public String predictiveScalingMode;

    /**
     * <p>The amount of buffer time before the prediction task is executed. By default, all prediction tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify an amount of buffer time for resource preparation before the prediction tasks are executed. Valid values: 0 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PredictiveTaskBufferTime")
    public Integer predictiveTaskBufferTime;

    /**
     * <p>Specifies which one of the initial maximum capacity and the predicted value can be used as the maximum value for prediction tasks. Valid values:</p>
     * <ul>
     * <li>MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.</li>
     * <li>PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks when the predicted value is greater than the initial maximum capacity.</li>
     * <li>PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a percentage that is specified by the PredictiveValueBuffer parameter. If the predicted value that is increased by the percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxOverridePredictiveValue</p>
     */
    @NameInMap("PredictiveValueBehavior")
    public String predictiveValueBehavior;

    /**
     * <p>The ratio based on which the predicted value is increased when <code>PredictiveValueBehavior</code> is set to <code>PredictiveValueOverrideMaxWithBuffer</code>. If the predicted value increased by this ratio is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PredictiveValueBuffer")
    public Integer predictiveValueBuffer;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ScaleInEvaluationCount")
    public Integer scaleInEvaluationCount;

    /**
     * <p>The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScaleOutEvaluationCount")
    public Integer scaleOutEvaluationCount;

    /**
     * <p>The ID of the scaling rule that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-bp1dvirgwkoowxk7****</p>
     */
    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    /**
     * <p>The name of the scaling rule. The name must be 2 to 64 letters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or digit.</p>
     * <p>The name of each scaling rule must be unique under the same account within the same region.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingrule****</p>
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
     * 
     * <strong>example:</strong>
     * <p>0.125</p>
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
         * <p>The dimension key of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>rulePool</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The dimension value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-l1cbirz451yxu2dxxx</p>
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
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        /**
         * <p>The upper limit specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

        /**
         * <p>The number of ECS instances that you want to scale in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
