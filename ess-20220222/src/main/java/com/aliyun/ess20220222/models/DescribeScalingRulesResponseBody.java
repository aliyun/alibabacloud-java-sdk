// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingRules")
    public java.util.List<DescribeScalingRulesResponseBodyScalingRules> scalingRules;

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

    public static class DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions extends TeaModel {
        @NameInMap("DimensionKey")
        public String dimensionKey;

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
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        @NameInMap("AlarmTaskName")
        public String alarmTaskName;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Dimensions")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarmsDimensions> dimensions;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("Statistics")
        public String statistics;

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
        @NameInMap("MetricIntervalLowerBound")
        public Float metricIntervalLowerBound;

        @NameInMap("MetricIntervalUpperBound")
        public Float metricIntervalUpperBound;

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
        @NameInMap("AdjustmentType")
        public String adjustmentType;

        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        @NameInMap("Alarms")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesAlarms> alarms;

        @NameInMap("Cooldown")
        public Integer cooldown;

        @NameInMap("DisableScaleIn")
        public Boolean disableScaleIn;

        @NameInMap("EstimatedInstanceWarmup")
        public Integer estimatedInstanceWarmup;

        @NameInMap("InitialMaxSize")
        public Integer initialMaxSize;

        @NameInMap("MaxSize")
        public Integer maxSize;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("MinAdjustmentMagnitude")
        public Integer minAdjustmentMagnitude;

        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("PredictiveScalingMode")
        public String predictiveScalingMode;

        @NameInMap("PredictiveTaskBufferTime")
        public Integer predictiveTaskBufferTime;

        @NameInMap("PredictiveValueBehavior")
        public String predictiveValueBehavior;

        @NameInMap("PredictiveValueBuffer")
        public Integer predictiveValueBuffer;

        @NameInMap("ScaleInEvaluationCount")
        public Integer scaleInEvaluationCount;

        @NameInMap("ScaleOutEvaluationCount")
        public Integer scaleOutEvaluationCount;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ScalingRuleAri")
        public String scalingRuleAri;

        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        @NameInMap("ScalingRuleType")
        public String scalingRuleType;

        @NameInMap("StepAdjustments")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesStepAdjustments> stepAdjustments;

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
