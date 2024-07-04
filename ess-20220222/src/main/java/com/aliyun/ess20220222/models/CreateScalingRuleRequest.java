// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingRuleRequest extends TeaModel {
    /**
     * <p>The scaling method of the scaling rule. This parameter is required only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule. Valid values:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</li>
     * <li>PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</li>
     * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The number of instances that must be scaled based on the scaling rule. This parameter is required only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule. The number of ECS instances that are scaled in a single scaling activity cannot exceed 1,000.</p>
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
     * <p>The metric dimensions. This parameter is applicable to target tracking scaling rules. If your predefined metric requires extra dimensions, you must specify this parameter. For example, if you use LoadBalancerRealServerAverageQps as your predefined metric, you must use this parameter to specify the rulePool dimension.</p>
     */
    @NameInMap("AlarmDimensions")
    public java.util.List<CreateScalingRuleRequestAlarmDimensions> alarmDimensions;

    /**
     * <p>The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Cooldown")
    public Integer cooldown;

    /**
     * <p>Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableScaleIn")
    public Boolean disableScaleIn;

    /**
     * <p>The warmup period of an instance. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. Auto Scaling adds ECS instances that are in the warmup state to a scaling group but does not report monitoring data to CloudMonitor during the warmup period.</p>
     * <blockquote>
     * <p>Auto Scaling calculates the number of ECS instances that must be scaled. ECS instances in the warmup state are not counted towards the current capacity of the scaling group.</p>
     * </blockquote>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EstimatedInstanceWarmup")
    public Integer estimatedInstanceWarmup;

    /**
     * <p>The maximum number of ECS instances that can be contained in the scaling group. If you specify InitialMaxSize, you must specify <code>PredictiveValueBehavior</code>.</p>
     * <p>The default value of this parameter is the value of MaxSize.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InitialMaxSize")
    public Integer initialMaxSize;

    /**
     * <p>The predefined metric of the scaling rule. If you set ScalingRuleType to TargetTrackingScalingRule or PredictiveScalingRule, you must specify this parameter.</p>
     * <p>Valid values if you set ScalingRuleType to TargetTrackingScalingRule:</p>
     * <ul>
     * <li>CpuUtilization: the average CPU utilization.</li>
     * <li>IntranetTx: the outbound traffic over an internal network.</li>
     * <li>IntranetRx: the inbound traffic over an internal network.</li>
     * <li>VpcInternetTx: the outbound traffic from a virtual private cloud (VPC) to the Internet.</li>
     * <li>VpcInternetRx: the inbound traffic from the Internet to a VPC.</li>
     * <li>MemoryUtilization: the memory usage.</li>
     * <li>LoadBalancerRealServerAverageQps:the queries per second (QPS) per Application Load Balancer (ALB) server group.</li>
     * </ul>
     * <p>Valid values if you set ScalingRuleType to PredictiveScalingRule:</p>
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
     * <p>The minimum number of instances that must be scaled when the AdjustmentType parameter is set to PercentChangeInCapacity. This parameter takes effect only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule.</p>
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
     * <p>Default value: PredictAndScale.</p>
     * 
     * <strong>example:</strong>
     * <p>PredictAndScale</p>
     */
    @NameInMap("PredictiveScalingMode")
    public String predictiveScalingMode;

    /**
     * <p>The amount of buffer time before the prediction task is executed. By default, all prediction tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify an amount of buffer time for resource preparation before the prediction tasks are executed. Valid values: 0 to 60. Unit: minutes.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PredictiveTaskBufferTime")
    public Integer predictiveTaskBufferTime;

    /**
     * <p>The maximum value for predication tasks. Valid values:</p>
     * <ul>
     * <li>MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.</li>
     * <li>PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.</li>
     * <li>PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a percentage that is specified by the PredictiveValueBuffer parameter. If the predicted value that is increased by the percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks.</li>
     * </ul>
     * <p>Default value: MaxOverridePredictiveValue.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxOverridePredictiveValue</p>
     */
    @NameInMap("PredictiveValueBehavior")
    public String predictiveValueBehavior;

    /**
     * <p>The ratio based on which the predicted value is increased when you set <code>PredictiveValueBehavior</code> to <code>PredictiveValueOverrideMaxWithBuffer</code>. If the predicted value increased by this ratio is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PredictiveValueBuffer")
    public Integer predictiveValueBuffer;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
     * <p>Default value: 15.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ScaleInEvaluationCount")
    public Integer scaleInEvaluationCount;

    /**
     * <p>The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
     * <p>Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScaleOutEvaluationCount")
    public Integer scaleOutEvaluationCount;

    /**
     * <p>The ID of the scaling group to which the scaling rule belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1ffogfdauy0jw0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The name of the scaling rule. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <p>The name of each scaling rule must be unique under the same account within a region.</p>
     * <p>If you leave this parameter empty, the scaling rule ID is used.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingrule****</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The type of the scaling rule. Valid values:</p>
     * <ul>
     * <li>SimpleScalingRule: a simple scaling rule. Once a simple scaling rule is executed, Auto Scaling adjusts the number of ECS instances or elastic container instances in the scaling group based on the values of AdjustmentType and AdjustmentValue.</li>
     * <li>TargetTrackingScalingRule: a target tracking scaling rule. Once a target tracking scaling rule is executed, Auto Scaling dynamically calculates the number of ECS instances or elastic container instances to scale based on the predefined metric (MetricName) and attempts to maintain the metric value close to the specified target value (TargetValue).</li>
     * <li>StepScalingRule: a step scaling rule. Once a step scaling rule is executed, Auto Scaling scales instances step by step based on the predefined thresholds and metric values.</li>
     * <li>PredictiveScalingRule: a predictive scaling rule. Once a predictive scaling rule is executed, Auto Scaling analyzes the historical monitoring data based on the machine learning technology and predicts the trends of metric data. Auto Scaling also creates scheduled tasks to enable dynamic adjustment of the boundary values for the scaling group.</li>
     * </ul>
     * <p>Default value: SimpleScalingRule.</p>
     * 
     * <strong>example:</strong>
     * <p>SimpleScalingRule</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    /**
     * <p>Details of the step adjustments.</p>
     */
    @NameInMap("StepAdjustments")
    public java.util.List<CreateScalingRuleRequestStepAdjustments> stepAdjustments;

    /**
     * <p>The target value. This parameter is required only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can have up to three decimal places.</p>
     * 
     * <strong>example:</strong>
     * <p>0.125</p>
     */
    @NameInMap("TargetValue")
    public Float targetValue;

    public static CreateScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingRuleRequest self = new CreateScalingRuleRequest();
        return TeaModel.build(map, self);
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

    public CreateScalingRuleRequest setAlarmDimensions(java.util.List<CreateScalingRuleRequestAlarmDimensions> alarmDimensions) {
        this.alarmDimensions = alarmDimensions;
        return this;
    }
    public java.util.List<CreateScalingRuleRequestAlarmDimensions> getAlarmDimensions() {
        return this.alarmDimensions;
    }

    public CreateScalingRuleRequest setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public CreateScalingRuleRequest setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }
    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    public CreateScalingRuleRequest setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }
    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    public CreateScalingRuleRequest setInitialMaxSize(Integer initialMaxSize) {
        this.initialMaxSize = initialMaxSize;
        return this;
    }
    public Integer getInitialMaxSize() {
        return this.initialMaxSize;
    }

    public CreateScalingRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CreateScalingRuleRequest setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    public CreateScalingRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingRuleRequest setPredictiveScalingMode(String predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode;
        return this;
    }
    public String getPredictiveScalingMode() {
        return this.predictiveScalingMode;
    }

    public CreateScalingRuleRequest setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
        this.predictiveTaskBufferTime = predictiveTaskBufferTime;
        return this;
    }
    public Integer getPredictiveTaskBufferTime() {
        return this.predictiveTaskBufferTime;
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

    public CreateScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScalingRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
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

    public CreateScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public CreateScalingRuleRequest setStepAdjustments(java.util.List<CreateScalingRuleRequestStepAdjustments> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
        return this;
    }
    public java.util.List<CreateScalingRuleRequestStepAdjustments> getStepAdjustments() {
        return this.stepAdjustments;
    }

    public CreateScalingRuleRequest setTargetValue(Float targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Float getTargetValue() {
        return this.targetValue;
    }

    public static class CreateScalingRuleRequestAlarmDimensions extends TeaModel {
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
         * <p>sgp-l1cbirz451yxuxxx</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static CreateScalingRuleRequestAlarmDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestAlarmDimensions self = new CreateScalingRuleRequestAlarmDimensions();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestAlarmDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public CreateScalingRuleRequestAlarmDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class CreateScalingRuleRequestStepAdjustments extends TeaModel {
        /**
         * <p>The lower limit specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        /**
         * <p>The upper limit that is specified in a step adjustment. Valid values: -9.999999E18 to 9.999999E18.</p>
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

        public static CreateScalingRuleRequestStepAdjustments build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestStepAdjustments self = new CreateScalingRuleRequestStepAdjustments();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestStepAdjustments setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        public Float getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

        public CreateScalingRuleRequestStepAdjustments setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        public Float getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        public CreateScalingRuleRequestStepAdjustments setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }
        public Integer getScalingAdjustment() {
            return this.scalingAdjustment;
        }

    }

}
