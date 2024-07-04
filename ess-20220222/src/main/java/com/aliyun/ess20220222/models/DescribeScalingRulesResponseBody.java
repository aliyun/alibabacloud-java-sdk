// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the scaling rules.</p>
     */
    @NameInMap("ScalingRules")
    public java.util.List<DescribeScalingRulesResponseBodyScalingRules> scalingRules;

    /**
     * <p>The total number of scaling rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesResponseBody self = new DescribeScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingRulesResponseBody setScalingRules(java.util.List<DescribeScalingRulesResponseBodyScalingRules> scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public java.util.List<DescribeScalingRulesResponseBodyScalingRules> getScalingRules() {
        return this.scalingRules;
    }

    public DescribeScalingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions extends TeaModel {
        /**
         * <p>监控项关联的维度信息键。</p>
         * 
         * <strong>example:</strong>
         * <p>rulePool</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>监控项关联的维度信息值。</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-l1cbirz451yxu2dxxx</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions self = new DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions extends TeaModel {
        /**
         * <p>The key of the dimension that is associated with the metric. Valid values:</p>
         * <ul>
         * <li>scaling_group: the ID of the scaling group</li>
         * <li>userId: the ID of the Alibaba Cloud account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scaling_group</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension that is associated with the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions self = new DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesAlarms extends TeaModel {
        /**
         * <p>The ID of the event-triggered task that is associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****_1f9458d1-70e1-4bee-8c7f-7a47695b****</p>
         */
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        /**
         * <p>The name of the event-triggered task that is associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alarmtask****</p>
         */
        @NameInMap("AlarmTaskName")
        public String alarmTaskName;

        /**
         * <p>The comparison operator between the metric value and the threshold for the event-triggered task that is associated with the scaling rule. The comparison operator indicates the relationship between the metric value and the threshold that is required to meet the condition.</p>
         * <ul>
         * <li>Valid value if the metric value is greater than or equal to the threshold: &gt;=.</li>
         * <li>Valid value if the metric value is less than or equal to the threshold: &lt;=.</li>
         * <li>Valid value if the metric value is greater than the threshold: &gt;.</li>
         * <li>Valid value if the metric value is less than the threshold: &lt;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The dimensions of the event-triggered task that is associated with the scaling rule.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions> dimensions;

        /**
         * <p>The number of consecutive times for which the event-triggered task that is associated with the scaling rule meets the threshold expressions before an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>The name of the metric of the event-triggered task that is associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The type of the event-triggered task that is associated with the scaling rule. Valid values:</p>
         * <ul>
         * <li>system: system monitoring event-triggered tasks</li>
         * <li>custom: custom monitoring event-triggered tasks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The statistical method of the event-triggered task that is associated with the scaling rule. Valid values:</p>
         * <ul>
         * <li>Average</li>
         * <li>Maximum</li>
         * <li>Minimum</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold of the event-triggered task that is associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static DescribeScalingRulesResponseBodyScalingRulesAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesAlarms self = new DescribeScalingRulesResponseBodyScalingRulesAlarms();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setAlarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setAlarmTaskName(String alarmTaskName) {
            this.alarmTaskName = alarmTaskName;
            return this;
        }
        public String getAlarmTaskName() {
            return this.alarmTaskName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setDimensions(java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesStepAdjustments extends TeaModel {
        /**
         * <p>The lower limit that is specified in a step adjustment. Valid values: -9.999999E18 to 9.999999E18.</p>
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
         * <p>The number of ECS instances that are scaled in a step adjustment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScalingAdjustment")
        public Integer scalingAdjustment;

        public static DescribeScalingRulesResponseBodyScalingRulesStepAdjustments build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesStepAdjustments self = new DescribeScalingRulesResponseBodyScalingRulesStepAdjustments();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesStepAdjustments setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        public Float getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

        public DescribeScalingRulesResponseBodyScalingRulesStepAdjustments setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        public Float getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        public DescribeScalingRulesResponseBodyScalingRulesStepAdjustments setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }
        public Integer getScalingAdjustment() {
            return this.scalingAdjustment;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRules extends TeaModel {
        /**
         * <p>The scaling mode of the scaling rule. Valid values:</p>
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
         * <p>The adjustment value that is specified in the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        /**
         * <p>监控项维度信息值，适用于目标追踪规则，当监控项需额外维度信息时设置，例如LoadBalancerRealServerAverageQps监控项需指定rulePool维度信息。</p>
         */
        @NameInMap("AlarmDimensions")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions> alarmDimensions;

        /**
         * <p>The event-triggered tasks that are associated with the scaling rule. Event-triggered tasks that are associated with the scaling rule are returned only if you set the ShowAlarmRules parameter to true. Otherwise, an empty list is returned.</p>
         */
        @NameInMap("Alarms")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarms> alarms;

        /**
         * <p>The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Cooldown")
        public Integer cooldown;

        /**
         * <p>Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableScaleIn")
        public Boolean disableScaleIn;

        /**
         * <p>The warmup period of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EstimatedInstanceWarmup")
        public Integer estimatedInstanceWarmup;

        /**
         * <p>The maximum number of ECS instances in the scaling group. You must specify the InitialMaxSize and PredictiveValueBehavior parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InitialMaxSize")
        public Integer initialMaxSize;

        /**
         * <p>The maximum number of ECS instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <p>The name of the metric of the event-triggered task that is associated with the scaling rule.</p>
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

        /**
         * <p>The minimum number of ECS instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

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
         * <p>The amount of buffer time before the prediction task is executed. By default, all scheduled tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify a buffer time for resource preparation before prediction tasks are executed. Valid values: 0 to 60. Unit: minutes.</p>
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
         * <p>The percentage of the increment to the predicted value when the PredictiveValueBehavior parameter is set to PredictiveValueOverrideMaxWithBuffer. If the predicted value increased by this percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PredictiveValueBuffer")
        public Integer predictiveValueBuffer;

        /**
         * <p>The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ScaleInEvaluationCount")
        public Integer scaleInEvaluationCount;

        /**
         * <p>The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScaleOutEvaluationCount")
        public Integer scaleOutEvaluationCount;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1ffogfdauy0jw0****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The unique identifier of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ari:acs:ess:cn-hangzhou:140692647406****:scalingrule/asr-bp1dvirgwkoowxk7****</p>
         */
        @NameInMap("ScalingRuleAri")
        public String scalingRuleAri;

        /**
         * <p>The ID of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>asr-bp1dvirgwkoowxk7****</p>
         */
        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        /**
         * <p>The name of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scalingrule****</p>
         */
        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        /**
         * <p>The type of the scaling rule. Valid values:</p>
         * <ul>
         * <li>SimpleScalingRule: adjusts the number of ECS instances based on the values of the AdjustmentType and AdjustmentValue parameters.</li>
         * <li>TargetTrackingScalingRule: calculates the number of ECS instances that need to be scaled in a dynamic manner and maintains the value of a predefined metric close to the value of the TargetValue parameter.</li>
         * <li>StepScalingRule: scales ECS instances in steps based on specified thresholds and metric values.</li>
         * <li>PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of metrics. In addition, Auto Scaling automatically creates scheduled tasks to adjust the boundary values for the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SimpleScalingRule</p>
         */
        @NameInMap("ScalingRuleType")
        public String scalingRuleType;

        /**
         * <p>The step adjustments of the step scaling rule.</p>
         */
        @NameInMap("StepAdjustments")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesStepAdjustments> stepAdjustments;

        /**
         * <p>The target value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>0.125</p>
         */
        @NameInMap("TargetValue")
        public Float targetValue;

        public static DescribeScalingRulesResponseBodyScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRules self = new DescribeScalingRulesResponseBodyScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRules setAdjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        public DescribeScalingRulesResponseBodyScalingRules setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public DescribeScalingRulesResponseBodyScalingRules setAlarmDimensions(java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions> alarmDimensions) {
            this.alarmDimensions = alarmDimensions;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions> getAlarmDimensions() {
            return this.alarmDimensions;
        }

        public DescribeScalingRulesResponseBodyScalingRules setAlarms(java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarms> getAlarms() {
            return this.alarms;
        }

        public DescribeScalingRulesResponseBodyScalingRules setCooldown(Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        public Integer getCooldown() {
            return this.cooldown;
        }

        public DescribeScalingRulesResponseBodyScalingRules setDisableScaleIn(Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }
        public Boolean getDisableScaleIn() {
            return this.disableScaleIn;
        }

        public DescribeScalingRulesResponseBodyScalingRules setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }
        public Integer getEstimatedInstanceWarmup() {
            return this.estimatedInstanceWarmup;
        }

        public DescribeScalingRulesResponseBodyScalingRules setInitialMaxSize(Integer initialMaxSize) {
            this.initialMaxSize = initialMaxSize;
            return this;
        }
        public Integer getInitialMaxSize() {
            return this.initialMaxSize;
        }

        public DescribeScalingRulesResponseBodyScalingRules setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DescribeScalingRulesResponseBodyScalingRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingRulesResponseBodyScalingRules setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }
        public Integer getMinAdjustmentMagnitude() {
            return this.minAdjustmentMagnitude;
        }

        public DescribeScalingRulesResponseBodyScalingRules setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DescribeScalingRulesResponseBodyScalingRules setPredictiveScalingMode(String predictiveScalingMode) {
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }
        public String getPredictiveScalingMode() {
            return this.predictiveScalingMode;
        }

        public DescribeScalingRulesResponseBodyScalingRules setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
            this.predictiveTaskBufferTime = predictiveTaskBufferTime;
            return this;
        }
        public Integer getPredictiveTaskBufferTime() {
            return this.predictiveTaskBufferTime;
        }

        public DescribeScalingRulesResponseBodyScalingRules setPredictiveValueBehavior(String predictiveValueBehavior) {
            this.predictiveValueBehavior = predictiveValueBehavior;
            return this;
        }
        public String getPredictiveValueBehavior() {
            return this.predictiveValueBehavior;
        }

        public DescribeScalingRulesResponseBodyScalingRules setPredictiveValueBuffer(Integer predictiveValueBuffer) {
            this.predictiveValueBuffer = predictiveValueBuffer;
            return this;
        }
        public Integer getPredictiveValueBuffer() {
            return this.predictiveValueBuffer;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
            this.scaleInEvaluationCount = scaleInEvaluationCount;
            return this;
        }
        public Integer getScaleInEvaluationCount() {
            return this.scaleInEvaluationCount;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
            this.scaleOutEvaluationCount = scaleOutEvaluationCount;
            return this;
        }
        public Integer getScaleOutEvaluationCount() {
            return this.scaleOutEvaluationCount;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingRuleAri(String scalingRuleAri) {
            this.scalingRuleAri = scalingRuleAri;
            return this;
        }
        public String getScalingRuleAri() {
            return this.scalingRuleAri;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingRuleType(String scalingRuleType) {
            this.scalingRuleType = scalingRuleType;
            return this;
        }
        public String getScalingRuleType() {
            return this.scalingRuleType;
        }

        public DescribeScalingRulesResponseBodyScalingRules setStepAdjustments(java.util.List<DescribeScalingRulesResponseBodyScalingRulesStepAdjustments> stepAdjustments) {
            this.stepAdjustments = stepAdjustments;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesStepAdjustments> getStepAdjustments() {
            return this.stepAdjustments;
        }

        public DescribeScalingRulesResponseBodyScalingRules setTargetValue(Float targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public Float getTargetValue() {
            return this.targetValue;
        }

    }

}
