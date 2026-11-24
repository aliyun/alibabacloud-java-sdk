// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the scaling rules.</p>
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
         * <p>The key of the dimension associated with the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>rulePool</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension associated with the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-l1cbirz451yxu2****</p>
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
         * <p>The key of the dimension associated with the metric. Valid values:</p>
         * <ul>
         * <li>scaling_group: the ID of the scaling group.</li>
         * <li>userId: the ID of the user account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scaling_group</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension associated with the metric.</p>
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
         * <p>The ID of the event-triggered task associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****_1f9458d1-70e1-4bee-8c7f-7a47695b****</p>
         */
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        /**
         * <p>The name of the event-triggered task associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alarmtask****</p>
         */
        @NameInMap("AlarmTaskName")
        public String alarmTaskName;

        /**
         * <p>The comparison operator used to compare the statistical value of the metric with the threshold for the event-triggered task associated with the scaling rule. This operator specifies the relationship between the statistical value and the threshold that meets the condition. Valid values:</p>
         * <ul>
         * <li><blockquote>
         * <p>=: the statistical value of the metric is greater than or equal to the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;=: the statistical value of the metric is less than or equal to the threshold.</li>
         * <li><blockquote>
         * <p>: the statistical value of the metric is greater than the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;: the statistical value of the metric is less than the threshold.</li>
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
         * <p>The dimension information of the event-triggered task associated with the scaling rule.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions> dimensions;

        /**
         * <p>The number of consecutive times the threshold expression must be met for the event-triggered task associated with the scaling rule to reach the alert state.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>The name of the metric for the event-triggered task associated with the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The type of the event-triggered task associated with the scaling rule. Valid values:</p>
         * <ul>
         * <li>system: system monitoring event-triggered task.</li>
         * <li>custom: custom monitoring event-triggered task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The period for collecting metric data in the target tracking scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The statistical method of the event-triggered task associated with the scaling rule. Valid values:</p>
         * <ul>
         * <li>Average: the average value.</li>
         * <li>Maximum: the maximum value.</li>
         * <li>Minimum: the minimum value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold of the event-triggered task associated with the scaling rule.</p>
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

        public DescribeScalingRulesResponseBodyScalingRulesAlarms setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
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

    public static class DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions extends TeaModel {
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

        public static DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions self = new DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesHybridMetrics extends TeaModel {
        /**
         * <p>The dimensions of the metric. Used to specify the resources monitored by the metric.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions> dimensions;

        /**
         * <p>The metric operation expression for multiple Hybrid Cloud Monitoring metrics. The calculation result of the expression is used to trigger scaling.</p>
         * <p>The operation expression must meet the Reverse Polish Notation (RPN) specification, and only the <code>+ - * /</code> operators are supported.</p>
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

        public static DescribeScalingRulesResponseBodyScalingRulesHybridMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesHybridMetrics self = new DescribeScalingRulesResponseBodyScalingRulesHybridMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetrics setDimensions(java.util.List<DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesHybridMetricsDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetrics setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetrics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesHybridMetrics setStatistic(String statistic) {
            this.statistic = statistic;
            return this;
        }
        public String getStatistic() {
            return this.statistic;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesStepAdjustments extends TeaModel {
        /**
         * <p>The lower boundary of the step adjustment. Valid values: -9.999999E18 to 9.999999E18.</p>
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
         * <p>The number of instances to be scaled for the step adjustment.</p>
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
         * <p>The adjustment type of the scaling rule. Valid values:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: increases or decreases a specified number of ECS instances.</li>
         * <li>PercentChangeInCapacity: increases or decreases a specified percentage of ECS instances.</li>
         * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QuantityChangeInCapacity</p>
         */
        @NameInMap("AdjustmentType")
        public String adjustmentType;

        /**
         * <p>The adjustment value of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        /**
         * <p>The dimension value of the metric. This parameter applies to target tracking scaling rules and is configured when the metric requires additional dimension information. For example, the LoadBalancerRealServerAverageQps metric requires the rulePool dimension information.</p>
         */
        @NameInMap("AlarmDimensions")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmDimensions> alarmDimensions;

        /**
         * <p>The CloudMonitor event-triggered tasks associated with the scaling rule. The associated CloudMonitor event-triggered tasks are returned only when the ShowAlarmRules parameter is set to true. Otherwise, an empty list is returned.</p>
         */
        @NameInMap("Alarms")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarms> alarms;

        /**
         * <p>The cooldown time of the scaling rule. This parameter applies only to simple scaling rules. Valid values: 0 to 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Cooldown")
        public Integer cooldown;

        /**
         * <p>Specifies whether to disable scale-in. This parameter applies only to target tracking scaling rules. Valid values:</p>
         * <ul>
         * <li>true: disables scale-in.</li>
         * <li>false: allows scale-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableScaleIn")
        public Boolean disableScaleIn;

        /**
         * <p>The warmup time required for newly created instances to complete a series of preparations. During the warmup period, the started instances do not affect the monitoring metrics of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EstimatedInstanceWarmup")
        public Integer estimatedInstanceWarmup;

        /**
         * <p>The monitoring metrics settings for Hybrid Cloud Monitoring. For more information about how to configure the settings, see <a href="https://help.aliyun.com/document_detail/2852162.html">Use formula operations to customize target tracking scaling rules</a>.</p>
         */
        @NameInMap("HybridMetrics")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesHybridMetrics> hybridMetrics;

        /**
         * <p>The ID of the monitoring metrics repository for Hybrid Cloud Monitoring.</p>
         * <p>To manage monitoring metrics repositories, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage monitoring metrics repositories</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        @NameInMap("HybridMonitorNamespace")
        public String hybridMonitorNamespace;

        /**
         * <p>The maximum number of instances in the scaling group. This parameter is used in combination with PredictiveValueBehavior.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InitialMaxSize")
        public Integer initialMaxSize;

        /**
         * <p>The maximum number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <p>The name of the metric for the event-triggered task associated with the scaling rule.</p>
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
         * <p>The minimum number of instances to be adjusted by the scaling rule. This parameter takes effect only when the scaling rule type is SimpleScalingRule or StepScalingRule and the AdjustmentType is PercentChangeInCapacity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinAdjustmentMagnitude")
        public Integer minAdjustmentMagnitude;

        /**
         * <p>The minimum number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

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
         * <p>The predictive tasks automatically created by the predictive scaling rule are executed on the hour by default. You can set the pre-start time to execute the predictive tasks in advance and prepare resources. Valid values: 0 to 60. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PredictiveTaskBufferTime")
        public Integer predictiveTaskBufferTime;

        /**
         * <p>The processing method for the maximum value of the predictive scaling rule. Valid values:</p>
         * <ul>
         * <li>MaxOverridePredictiveValue: the initial maximum value overrides the predicted value. If the predicted value is greater than the initial maximum value, the maximum value of the predictive task uses the initial maximum value.</li>
         * <li>PredictiveValueOverrideMax: the predicted value overrides the initial maximum value. If the predicted value is greater than the initial maximum value, the maximum value of the predictive task uses the predicted value.</li>
         * <li>PredictiveValueOverrideMaxWithBuffer: a certain percentage is added to the predicted value. The predicted value is increased by the percentage specified by PredictiveValueBuffer. If the increased value is greater than the initial maximum value, the increased value is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxOverridePredictiveValue</p>
         */
        @NameInMap("PredictiveValueBehavior")
        public String predictiveValueBehavior;

        /**
         * <p>This parameter takes effect when PredictiveValueBehavior is set to PredictiveValueOverrideMaxWithBuffer. The predicted value is increased by this percentage. If the increased value is greater than the initial maximum value, the increased value is used. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PredictiveValueBuffer")
        public Integer predictiveValueBuffer;

        /**
         * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times the threshold condition must be met to trigger the scale-in event-triggered task.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ScaleInEvaluationCount")
        public Integer scaleInEvaluationCount;

        /**
         * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times the threshold condition must be met to trigger the scale-out event-triggered task.</p>
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
         * <li>SimpleScalingRule: simple scaling rule. Adjusts the number of ECS instances based on the adjustment type (AdjustmentType) and adjustment value (AdjustmentValue).</li>
         * <li>TargetTrackingScalingRule: target tracking scaling rule. Dynamically calculates the number of ECS instances to scale out or scale-in based on a predefined metric (MetricName) and attempts to maintain the metric value near the target value (TargetValue).</li>
         * <li>StepScalingRule: step scaling rule. Provides a step-by-step extension method based on thresholds and metric values.</li>
         * <li>PredictiveScalingRule: predictive scaling rule. Analyzes the historical monitoring data of the scaling group based on machine learning capabilities to predict future monitoring metrics, and supports the automatic creation of scheduled tasks to set the boundaries of the scaling group.</li>
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
         * <p>The target value. When the scaling rule is a target tracking scaling rule or a predictive scaling rule, the scaling rule maintains the metric near the target value by adding or removing instances.</p>
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

        public DescribeScalingRulesResponseBodyScalingRules setHybridMetrics(java.util.List<DescribeScalingRulesResponseBodyScalingRulesHybridMetrics> hybridMetrics) {
            this.hybridMetrics = hybridMetrics;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesHybridMetrics> getHybridMetrics() {
            return this.hybridMetrics;
        }

        public DescribeScalingRulesResponseBodyScalingRules setHybridMonitorNamespace(String hybridMonitorNamespace) {
            this.hybridMonitorNamespace = hybridMonitorNamespace;
            return this;
        }
        public String getHybridMonitorNamespace() {
            return this.hybridMonitorNamespace;
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

        public DescribeScalingRulesResponseBodyScalingRules setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
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
