// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingRuleRequest extends TeaModel {
    /**
     * <p>The adjustment method of the scaling rule. This parameter is required for simple scaling rules and step scaling rules. Valid values:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: adds or removes a specified number of ECS instances.</li>
     * <li>PercentChangeInCapacity: adds or removes a specified percentage of ECS instances.</li>
     * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The adjustment value of the scaling rule. This parameter is required for simple scaling rules and step scaling rules. The number of ECS instances adjusted in a single operation cannot exceed 1,000. Valid values vary based on the adjustment method:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: -1000 to 1000.</li>
     * <li>PercentChangeInCapacity: -100 to 10000.</li>
     * <li>TotalCapacity: 0 to 2000.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The dimension information of the metric. This parameter is applicable to target tracking scaling rules and is configured when the metric requires additional dimension information. For example, the LoadBalancerRealServerAverageQps metric requires the dimension key-value information of rulePool.</p>
     */
    @NameInMap("AlarmDimensions")
    public java.util.List<CreateScalingRuleRequestAlarmDimensions> alarmDimensions;

    /**
     * <p>The definition of alert attributes.</p>
     */
    @NameInMap("AlarmOptions")
    public CreateScalingRuleRequestAlarmOptions alarmOptions;

    /**
     * <p>The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Cooldown")
    public Integer cooldown;

    /**
     * <p>Specifies whether to disable scale-in. This parameter is applicable only to target tracking scaling rules.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableScaleIn")
    public Boolean disableScaleIn;

    /**
     * <p>The warmup time of instances. This parameter is applicable to target tracking scaling rules and step scaling rules. ECS instances in the warmup state are added to the scaling group normally, but they do not report monitoring data to CloudMonitor during the warmup period.</p>
     * <blockquote>
     * <p>When dynamically calculating the number of ECS instances to be scaled, instances in the warmup state are not counted in the current number of instances.</p>
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
     * <p>The metric settings for Hybrid Cloud Monitoring. For more information about how to configure the settings, see <a href="https://help.aliyun.com/document_detail/2852162.html">Customize target tracking scaling rules by using formula operations</a>.</p>
     */
    @NameInMap("HybridMetrics")
    public java.util.List<CreateScalingRuleRequestHybridMetrics> hybridMetrics;

    /**
     * <p>The ID of the monitoring metrics repository for Hybrid Cloud Monitoring.</p>
     * <p>For more information about managing monitoring metrics repositories, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage monitoring metrics repositories</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test</p>
     */
    @NameInMap("HybridMonitorNamespace")
    public String hybridMonitorNamespace;

    /**
     * <p>The maximum number of instances in the scaling group. This parameter is used in combination with <code>PredictiveValueBehavior</code>.</p>
     * <p>Default value: the maximum number of instances in the scaling group (the value of MaxSize).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InitialMaxSize")
    public Integer initialMaxSize;

    /**
     * <p>The predefined metric. This parameter is required for target tracking scaling rules and predictive scaling rules.</p>
     * <p>Valid values for target tracking scaling rules: </p>
     * <ul>
     * <li>CpuUtilizationAgent: (Agent) CPU utilization (recommended).</li>
     * <li>MemoryUtilization: (Agent) memory usage (recommended).</li>
     * <li>CpuUtilization: (ECS) average CPU utilization.</li>
     * <li>IntranetTx: (ECS) average outbound traffic over the internal network.</li>
     * <li>IntranetRx: (ECS) average inbound traffic over the internal network.</li>
     * <li>VpcInternetTx: (ECS) average outbound traffic over the Internet.</li>
     * <li>VpcInternetRx: (ECS) average inbound traffic over the Internet.</li>
     * <li>LoadBalancerRealServerAverageQps: (ALB) average QPS per backend server in a server group.</li>
     * </ul>
     * <p>Valid values for predictive scaling rules: </p>
     * <ul>
     * <li>CpuUtilization: (ECS) average CPU utilization.</li>
     * <li>IntranetRx: (ECS) average inbound traffic over the internal network.</li>
     * <li>IntranetTx: (ECS) average outbound traffic over the internal network.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The type of the metric. Valid values:</p>
     * <ul>
     * <li>system: uses system metrics of CloudMonitor.</li>
     * <li>custom: uses custom metrics reported to CloudMonitor.</li>
     * <li>hybrid: uses metrics of Hybrid Cloud Monitoring.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The minimum number of instances to be adjusted. This parameter takes effect only when the scaling rule type is SimpleScalingRule or StepScalingRule and AdjustmentType is set to PercentChangeInCapacity.</p>
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
     * <li>PredictAndScale: generates prediction results and creates predictive tasks.</li>
     * <li>PredictOnly: generates prediction results but does not create predictive tasks.</li>
     * </ul>
     * <p>Default value: PredictAndScale.</p>
     * 
     * <strong>example:</strong>
     * <p>PredictAndScale</p>
     */
    @NameInMap("PredictiveScalingMode")
    public String predictiveScalingMode;

    /**
     * <p>The predictive tasks automatically created by predictive scaling rules are executed on the hour by default. You can set the pre-startup time to execute the predictive tasks in advance and prepare resources beforehand. Valid values: 0 to 60. Unit: minutes.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PredictiveTaskBufferTime")
    public Integer predictiveTaskBufferTime;

    /**
     * <p>The processing method for the maximum value of the predictive scaling rule. Valid values:</p>
     * <ul>
     * <li>MaxOverridePredictiveValue: The initial maximum value overrides the predicted value. If the predicted value is greater than the initial maximum value, the maximum value of the predictive task uses the initial maximum value.</li>
     * <li>PredictiveValueOverrideMax: The predicted value overrides the initial maximum value. If the predicted value is greater than the initial maximum value, the maximum value of the predictive task uses the predicted value.</li>
     * <li>PredictiveValueOverrideMaxWithBuffer: A buffer ratio is added to the predicted value. The predicted value is increased by the ratio specified by PredictiveValueBuffer. If the increased value is greater than the initial maximum value, the increased value is used.</li>
     * </ul>
     * <p>Default value: MaxOverridePredictiveValue.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxOverridePredictiveValue</p>
     */
    @NameInMap("PredictiveValueBehavior")
    public String predictiveValueBehavior;

    /**
     * <p>This parameter takes effect only when <code>PredictiveValueBehavior</code> is set to <code>PredictiveValueOverrideMaxWithBuffer</code>. The predicted value is increased by this ratio. If the increased value is greater than the initial maximum value, the increased value is used. Valid values: 0 to 100.</p>
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
     * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times the threshold condition must be met before the corresponding scale-in event-triggered task triggers an alert.</p>
     * <p>Default value: 15.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ScaleInEvaluationCount")
    public Integer scaleInEvaluationCount;

    /**
     * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times the threshold condition must be met before the corresponding scale-out event-triggered task triggers an alert.</p>
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
     * <p>The name of the scaling rule. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter, digit, or Chinese character.</p>
     * <p>The name of a scaling rule must be unique within a scaling group in a region for an Alibaba Cloud account.</p>
     * <p>If this parameter is not specified, the value of ScalingRuleId is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingrule****</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The type of the scaling rule. Valid values:</p>
     * <ul>
     * <li>SimpleScalingRule: simple scaling rule. Adjusts the number of ECS or ECI instances based on the adjustment method (AdjustmentType) and adjustment value (AdjustmentValue).</li>
     * <li>TargetTrackingScalingRule: target tracking scaling rule. Dynamically calculates the number of ECS or ECI instances for scale-out or scale-in based on a predefined metric (MetricName) to keep the metric value close to the target value (TargetValue).</li>
     * <li>StepScalingRule: step scaling rule. Provides a step-by-step scaling method based on thresholds and metric values.</li>
     * <li>PredictiveScalingRule: predictive scaling rule. Analyzes historical monitoring data of the scaling group based on machine learning capabilities to predict future metric values, and supports the automatic creation of scheduled tasks to configure the boundary values of the scaling group.</li>
     * </ul>
     * <p>Default value: SimpleScalingRule.</p>
     * 
     * <strong>example:</strong>
     * <p>SimpleScalingRule</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    /**
     * <p>The collection of instance scaling information corresponding to step adjustments.</p>
     */
    @NameInMap("StepAdjustments")
    public java.util.List<CreateScalingRuleRequestStepAdjustments> stepAdjustments;

    /**
     * <p>The target value. This parameter is required for target tracking scaling rules and predictive scaling rules. The value of TargetValue can be rounded to three decimal places and must be greater than 0.</p>
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

    public CreateScalingRuleRequest setAlarmOptions(CreateScalingRuleRequestAlarmOptions alarmOptions) {
        this.alarmOptions = alarmOptions;
        return this;
    }
    public CreateScalingRuleRequestAlarmOptions getAlarmOptions() {
        return this.alarmOptions;
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

    public CreateScalingRuleRequest setHybridMetrics(java.util.List<CreateScalingRuleRequestHybridMetrics> hybridMetrics) {
        this.hybridMetrics = hybridMetrics;
        return this;
    }
    public java.util.List<CreateScalingRuleRequestHybridMetrics> getHybridMetrics() {
        return this.hybridMetrics;
    }

    public CreateScalingRuleRequest setHybridMonitorNamespace(String hybridMonitorNamespace) {
        this.hybridMonitorNamespace = hybridMonitorNamespace;
        return this;
    }
    public String getHybridMonitorNamespace() {
        return this.hybridMonitorNamespace;
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

    public CreateScalingRuleRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
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
         * <p>The dimension key associated with the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>rulePool</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The dimension value associated with the metric.</p>
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

    public static class CreateScalingRuleRequestAlarmOptions extends TeaModel {
        /**
         * <p>The period for collecting metric data in the target tracking scaling rule. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p>Default value: 60.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Integer period;

        public static CreateScalingRuleRequestAlarmOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestAlarmOptions self = new CreateScalingRuleRequestAlarmOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestAlarmOptions setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

    }

    public static class CreateScalingRuleRequestHybridMetricsDimensions extends TeaModel {
        /**
         * <p>The dimension key of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The dimension value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>testQueue</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static CreateScalingRuleRequestHybridMetricsDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestHybridMetricsDimensions self = new CreateScalingRuleRequestHybridMetricsDimensions();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestHybridMetricsDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public CreateScalingRuleRequestHybridMetricsDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class CreateScalingRuleRequestHybridMetrics extends TeaModel {
        /**
         * <p>The dimensions of the metric. Used to specify the resources monitored by the metric.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<CreateScalingRuleRequestHybridMetricsDimensions> dimensions;

        /**
         * <p>The metric operation expression for multiple Hybrid Cloud Monitoring metrics. The calculation result of the expression is used to trigger scaling.</p>
         * <p>The operation expression must comply with the Reverse Polish Notation (RPN) specification, and only the <code>+</code>, <code>-</code>, <code>*</code>, and <code>/</code> operators are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>(a+b)/2</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The reference ID of the metric in the metric operation expression.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the monitoring metrics in the monitoring metrics repository for Hybrid Cloud Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunSmq_NumberOfMessagesVisible</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical method of the metric. Valid values:</p>
         * <ul>
         * <li>Average: the average value of all data points within the specified period.</li>
         * <li>Minimum: the minimum value of all data points within the specified period.</li>
         * <li>Maximum: the maximum value of all data points within the specified period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistic")
        public String statistic;

        public static CreateScalingRuleRequestHybridMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestHybridMetrics self = new CreateScalingRuleRequestHybridMetrics();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestHybridMetrics setDimensions(java.util.List<CreateScalingRuleRequestHybridMetricsDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<CreateScalingRuleRequestHybridMetricsDimensions> getDimensions() {
            return this.dimensions;
        }

        public CreateScalingRuleRequestHybridMetrics setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateScalingRuleRequestHybridMetrics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScalingRuleRequestHybridMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateScalingRuleRequestHybridMetrics setStatistic(String statistic) {
            this.statistic = statistic;
            return this;
        }
        public String getStatistic() {
            return this.statistic;
        }

    }

    public static class CreateScalingRuleRequestStepAdjustments extends TeaModel {
        /**
         * <p>The lower boundary of the step adjustment. This parameter is applicable only to step scaling rules. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        /**
         * <p>The upper boundary of the step adjustment. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

        /**
         * <p>The number of instances to be scaled for the step adjustment. This parameter is applicable only to step scaling rules.</p>
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
