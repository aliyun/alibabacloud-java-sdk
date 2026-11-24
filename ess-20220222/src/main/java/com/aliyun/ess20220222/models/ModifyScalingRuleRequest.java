// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    /**
     * <p>The adjustment method of the scaling rule. This parameter is required and applicable only to simple scaling rules and step scaling rules. Valid values: </p>
     * <ul>
     * <li>QuantityChangeInCapacity: adds or removes a specified number of ECS instances. </li>
     * <li>PercentChangeInCapacity: adds or removes a specified percentage of ECS instances. </li>
     * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The adjustment value of the scaling rule. This parameter is required and applicable only to simple scaling rules and step scaling rules. The number of ECS instances adjusted in a single operation cannot exceed 1,000. Valid values vary based on the adjustment method:</p>
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
     * <p>The dimension values of the monitoring metric. This parameter is applicable to target tracking scaling rules and is configured when the monitoring metric requires additional dimension information. For example, the LoadBalancerRealServerAverageQps metric requires the rulePool dimension.</p>
     */
    @NameInMap("AlarmDimensions")
    public java.util.List<ModifyScalingRuleRequestAlarmDimensions> alarmDimensions;

    /**
     * <p>The alert attributes.</p>
     */
    @NameInMap("AlarmOptions")
    public ModifyScalingRuleRequestAlarmOptions alarmOptions;

    /**
     * <p>The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules.</p>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Cooldown")
    public Integer cooldown;

    /**
     * <p>Specifies whether to disable scale-in. This parameter is applicable only to target tracking scaling rules.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableScaleIn")
    public Boolean disableScaleIn;

    /**
     * <p>The warmup period of instances. This parameter is applicable to target tracking scaling rules and step scaling rules. ECS instances in the warmup state are added to the scaling group as usual, but they do not report monitoring data to CloudMonitor during the warmup period.</p>
     * <blockquote>
     * <p>When the system dynamically calculates the number of ECS instances to scale out or scale in, instances in the warmup state are not counted as existing instances.</p>
     * </blockquote>
     * <p>Valid values: 0 to 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("EstimatedInstanceWarmup")
    public Integer estimatedInstanceWarmup;

    /**
     * <p>The Hybrid Cloud Monitoring monitoring metrics settings. For more information about how to configure the settings, see <a href="https://help.aliyun.com/document_detail/2852162.html">Use formula operations to customize target tracking scaling rules</a>.</p>
     */
    @NameInMap("HybridMetrics")
    public java.util.List<ModifyScalingRuleRequestHybridMetrics> hybridMetrics;

    /**
     * <p>The ID of the Hybrid Cloud Monitoring monitoring metrics repository.</p>
     * <p>For more information about how to manage monitoring metrics repositories, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage monitoring metrics repositories</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test</p>
     */
    @NameInMap("HybridMonitorNamespace")
    public String hybridMonitorNamespace;

    /**
     * <p>The maximum number of instances in the scaling group. This parameter is used together with <code>PredictiveValueBehavior</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InitialMaxSize")
    public Integer initialMaxSize;

    /**
     * <p>The predefined monitoring metric. This parameter is required and applicable to target tracking scaling rules and predictive scaling rules.</p>
     * <p>Valid values for target tracking scaling rules:</p>
     * <ul>
     * <li>CpuUtilizationAgent: the CPU utilization collected by the CloudMonitor agent (recommended).</li>
     * <li>MemoryUtilization: the memory usage collected by the CloudMonitor agent (recommended).</li>
     * <li>CpuUtilization: the average CPU utilization of ECS instances.</li>
     * <li>IntranetTx: the average outbound internal traffic of ECS instances.</li>
     * <li>IntranetRx: the average inbound internal traffic of ECS instances.</li>
     * <li>VpcInternetTx: the average outbound Internet traffic of ECS instances.</li>
     * <li>VpcInternetRx: the average inbound Internet traffic of ECS instances.</li>
     * <li>LoadBalancerRealServerAverageQps: the average queries per second (QPS) per backend server in an Application Load Balancer (ALB) server group.</li>
     * </ul>
     * <p>Valid values for predictive scaling rules:</p>
     * <ul>
     * <li>CpuUtilization: the average CPU utilization of ECS instances.</li>
     * <li>IntranetRx: the average inbound internal traffic of ECS instances.</li>
     * <li>IntranetTx: the average outbound internal traffic of ECS instances.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The type of the monitoring metric. Valid values:</p>
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
     * <p>The minimum number of instances to adjust. This parameter takes effect only when the scaling rule type is SimpleScalingRule or StepScalingRule and <code>AdjustmentType</code> is set to <code>PercentChangeInCapacity</code>.</p>
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
     * 
     * <strong>example:</strong>
     * <p>PredictAndScale</p>
     */
    @NameInMap("PredictiveScalingMode")
    public String predictiveScalingMode;

    /**
     * <p>By default, predictive tasks automatically created by predictive scaling rules are executed on the hour. You can set a pre-start time to execute the predictive tasks in advance and prepare resources. Valid values: 0 to 60. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PredictiveTaskBufferTime")
    public Integer predictiveTaskBufferTime;

    /**
     * <p>The method to handle the maximum value for the predictive scaling rule. Valid values:</p>
     * <ul>
     * <li>MaxOverridePredictiveValue: the initial maximum value overrides the predicted value. If the predicted value is greater than the initial maximum value, the initial maximum value is used as the maximum value for the predictive task.</li>
     * <li>PredictiveValueOverrideMax: the predicted value overrides the initial maximum value. If the predicted value is greater than the initial maximum value, the predicted value is used as the maximum value for the predictive task.</li>
     * <li>PredictiveValueOverrideMaxWithBuffer: a buffer ratio is added to the predicted value. The predicted value is increased by the ratio specified by PredictiveValueBuffer. If the increased value is greater than the initial maximum value, the increased value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxOverridePredictiveValue</p>
     */
    @NameInMap("PredictiveValueBehavior")
    public String predictiveValueBehavior;

    /**
     * <p>The buffer ratio added to the predicted value. This parameter takes effect only when <code>PredictiveValueBehavior</code> is set to <code>PredictiveValueOverrideMaxWithBuffer</code>. The predicted value is increased by this ratio. If the increased value is greater than the initial maximum value, the increased value is used. Valid values: 0 to 100.</p>
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
     * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times that the threshold condition must be met before the scale-in event-triggered task triggers an alert.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ScaleInEvaluationCount")
    public Integer scaleInEvaluationCount;

    /**
     * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times that the threshold condition must be met before the scale-out event-triggered task triggers an alert.</p>
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
     * <p>The name of the scaling rule. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or digit. The scaling rule name must be unique within a scaling group in a region for an Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingrule****</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The set of instance scaling configurations for step adjustments.</p>
     */
    @NameInMap("StepAdjustments")
    public java.util.List<ModifyScalingRuleRequestStepAdjustments> stepAdjustments;

    /**
     * <p>The target value. This parameter is applicable to target tracking scaling rules and predictive scaling rules. The value can have up to three decimal places and must be greater than 0.</p>
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

    public ModifyScalingRuleRequest setAlarmOptions(ModifyScalingRuleRequestAlarmOptions alarmOptions) {
        this.alarmOptions = alarmOptions;
        return this;
    }
    public ModifyScalingRuleRequestAlarmOptions getAlarmOptions() {
        return this.alarmOptions;
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

    public ModifyScalingRuleRequest setHybridMetrics(java.util.List<ModifyScalingRuleRequestHybridMetrics> hybridMetrics) {
        this.hybridMetrics = hybridMetrics;
        return this;
    }
    public java.util.List<ModifyScalingRuleRequestHybridMetrics> getHybridMetrics() {
        return this.hybridMetrics;
    }

    public ModifyScalingRuleRequest setHybridMonitorNamespace(String hybridMonitorNamespace) {
        this.hybridMonitorNamespace = hybridMonitorNamespace;
        return this;
    }
    public String getHybridMonitorNamespace() {
        return this.hybridMonitorNamespace;
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

    public ModifyScalingRuleRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
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
         * <p>The key of the dimension associated with the monitoring metric.</p>
         * 
         * <strong>example:</strong>
         * <p>rulePool</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension associated with the monitoring metric.</p>
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

    public static class ModifyScalingRuleRequestAlarmOptions extends TeaModel {
        /**
         * <p>The period for collecting monitoring metric data in the target tracking scaling rule. Unit: seconds. Valid values:</p>
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

        public static ModifyScalingRuleRequestAlarmOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestAlarmOptions self = new ModifyScalingRuleRequestAlarmOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestAlarmOptions setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

    }

    public static class ModifyScalingRuleRequestHybridMetricsDimensions extends TeaModel {
        /**
         * <p>The key of the metric dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the metric dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>testQueue</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static ModifyScalingRuleRequestHybridMetricsDimensions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestHybridMetricsDimensions self = new ModifyScalingRuleRequestHybridMetricsDimensions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestHybridMetricsDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ModifyScalingRuleRequestHybridMetricsDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class ModifyScalingRuleRequestHybridMetrics extends TeaModel {
        /**
         * <p>The dimensions of the metric. This parameter is used to specify the resources monitored by the metric.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<ModifyScalingRuleRequestHybridMetricsDimensions> dimensions;

        /**
         * <p>The metric operation expression for multiple Hybrid Cloud Monitoring metrics. The calculation result of the expression is used to trigger scaling activities.</p>
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
         * <p>The name of the metric in the Hybrid Cloud Monitoring monitoring metrics repository.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunSmq_NumberOfMessagesVisible</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical method of the metric. Valid values:</p>
         * <ul>
         * <li>Average: the average value of all data points in the specified period.</li>
         * <li>Minimum: the minimum value of all data points in the specified period.</li>
         * <li>Maximum: the maximum value of all data points in the specified period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistic")
        public String statistic;

        public static ModifyScalingRuleRequestHybridMetrics build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestHybridMetrics self = new ModifyScalingRuleRequestHybridMetrics();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestHybridMetrics setDimensions(java.util.List<ModifyScalingRuleRequestHybridMetricsDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<ModifyScalingRuleRequestHybridMetricsDimensions> getDimensions() {
            return this.dimensions;
        }

        public ModifyScalingRuleRequestHybridMetrics setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ModifyScalingRuleRequestHybridMetrics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyScalingRuleRequestHybridMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyScalingRuleRequestHybridMetrics setStatistic(String statistic) {
            this.statistic = statistic;
            return this;
        }
        public String getStatistic() {
            return this.statistic;
        }

    }

    public static class ModifyScalingRuleRequestStepAdjustments extends TeaModel {
        /**
         * <p>The lower boundary of the step adjustment. This parameter is applicable only to step scaling rules. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        /**
         * <p>The upper boundary of the step adjustment. This parameter is applicable only to step scaling rules. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

        /**
         * <p>The number of instances to adjust for the step adjustment. This parameter is applicable only to step scaling rules.</p>
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
