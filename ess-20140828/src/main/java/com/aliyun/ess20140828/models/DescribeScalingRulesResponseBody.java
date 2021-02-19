// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ScalingRules")
    public DescribeScalingRulesResponseBodyScalingRules scalingRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesResponseBody self = new DescribeScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScalingRulesResponseBody setScalingRules(DescribeScalingRulesResponseBodyScalingRules scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public DescribeScalingRulesResponseBodyScalingRules getScalingRules() {
        return this.scalingRules;
    }

    public DescribeScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension extends TeaModel {
        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension self = new DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions extends TeaModel {
        @NameInMap("Dimension")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension> dimension;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions self = new DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions setDimension(java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensionsDimension> getDimension() {
            return this.dimension;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm extends TeaModel {
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("AlarmTaskName")
        public String alarmTaskName;

        @NameInMap("Dimensions")
        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions dimensions;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm self = new DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setAlarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setAlarmTaskName(String alarmTaskName) {
            this.alarmTaskName = alarmTaskName;
            return this;
        }
        public String getAlarmTaskName() {
            return this.alarmTaskName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setDimensions(DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarmDimensions getDimensions() {
            return this.dimensions;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm> alarm;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms self = new DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms setAlarm(java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarmsAlarm> getAlarm() {
            return this.alarm;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment extends TeaModel {
        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

        @NameInMap("ScalingAdjustment")
        public Integer scalingAdjustment;

        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment self = new DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        public Float getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }
        public Integer getScalingAdjustment() {
            return this.scalingAdjustment;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        public Float getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments extends TeaModel {
        @NameInMap("StepAdjustment")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment> stepAdjustment;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments self = new DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments setStepAdjustment(java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment> stepAdjustment) {
            this.stepAdjustment = stepAdjustment;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustmentsStepAdjustment> getStepAdjustment() {
            return this.stepAdjustment;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRule extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("InitialMaxSize")
        public Integer initialMaxSize;

        @NameInMap("Alarms")
        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms alarms;

        @NameInMap("ScaleOutEvaluationCount")
        public Integer scaleOutEvaluationCount;

        @NameInMap("PredictiveScalingMode")
        public String predictiveScalingMode;

        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("PredictiveTaskBufferTime")
        public Integer predictiveTaskBufferTime;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("PredictiveValueBehavior")
        public String predictiveValueBehavior;

        @NameInMap("Cooldown")
        public Integer cooldown;

        @NameInMap("ScalingRuleType")
        public String scalingRuleType;

        @NameInMap("PredictiveValueBuffer")
        public Integer predictiveValueBuffer;

        @NameInMap("ScaleInEvaluationCount")
        public Integer scaleInEvaluationCount;

        @NameInMap("DisableScaleIn")
        public Boolean disableScaleIn;

        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        @NameInMap("AdjustmentType")
        public String adjustmentType;

        @NameInMap("EstimatedInstanceWarmup")
        public Integer estimatedInstanceWarmup;

        @NameInMap("MinAdjustmentMagnitude")
        public Integer minAdjustmentMagnitude;

        @NameInMap("ScalingRuleAri")
        public String scalingRuleAri;

        @NameInMap("StepAdjustments")
        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments stepAdjustments;

        @NameInMap("TargetValue")
        public Float targetValue;

        @NameInMap("MaxSize")
        public Integer maxSize;

        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRule self = new DescribeScalingRulesResponseBodyScalingRulesScalingRule();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setInitialMaxSize(Integer initialMaxSize) {
            this.initialMaxSize = initialMaxSize;
            return this;
        }
        public Integer getInitialMaxSize() {
            return this.initialMaxSize;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setAlarms(DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms alarms) {
            this.alarms = alarms;
            return this;
        }
        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleAlarms getAlarms() {
            return this.alarms;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
            this.scaleOutEvaluationCount = scaleOutEvaluationCount;
            return this;
        }
        public Integer getScaleOutEvaluationCount() {
            return this.scaleOutEvaluationCount;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setPredictiveScalingMode(String predictiveScalingMode) {
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }
        public String getPredictiveScalingMode() {
            return this.predictiveScalingMode;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
            this.predictiveTaskBufferTime = predictiveTaskBufferTime;
            return this;
        }
        public Integer getPredictiveTaskBufferTime() {
            return this.predictiveTaskBufferTime;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setPredictiveValueBehavior(String predictiveValueBehavior) {
            this.predictiveValueBehavior = predictiveValueBehavior;
            return this;
        }
        public String getPredictiveValueBehavior() {
            return this.predictiveValueBehavior;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setCooldown(Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        public Integer getCooldown() {
            return this.cooldown;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleType(String scalingRuleType) {
            this.scalingRuleType = scalingRuleType;
            return this;
        }
        public String getScalingRuleType() {
            return this.scalingRuleType;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setPredictiveValueBuffer(Integer predictiveValueBuffer) {
            this.predictiveValueBuffer = predictiveValueBuffer;
            return this;
        }
        public Integer getPredictiveValueBuffer() {
            return this.predictiveValueBuffer;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
            this.scaleInEvaluationCount = scaleInEvaluationCount;
            return this;
        }
        public Integer getScaleInEvaluationCount() {
            return this.scaleInEvaluationCount;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setDisableScaleIn(Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }
        public Boolean getDisableScaleIn() {
            return this.disableScaleIn;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setAdjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }
        public Integer getEstimatedInstanceWarmup() {
            return this.estimatedInstanceWarmup;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }
        public Integer getMinAdjustmentMagnitude() {
            return this.minAdjustmentMagnitude;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleAri(String scalingRuleAri) {
            this.scalingRuleAri = scalingRuleAri;
            return this;
        }
        public String getScalingRuleAri() {
            return this.scalingRuleAri;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setStepAdjustments(DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments stepAdjustments) {
            this.stepAdjustments = stepAdjustments;
            return this;
        }
        public DescribeScalingRulesResponseBodyScalingRulesScalingRuleStepAdjustments getStepAdjustments() {
            return this.stepAdjustments;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setTargetValue(Float targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public Float getTargetValue() {
            return this.targetValue;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRules extends TeaModel {
        @NameInMap("ScalingRule")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRule> scalingRule;

        public static DescribeScalingRulesResponseBodyScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRules self = new DescribeScalingRulesResponseBodyScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingRule(java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRule> scalingRule) {
            this.scalingRule = scalingRule;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRule> getScalingRule() {
            return this.scalingRule;
        }

    }

}
