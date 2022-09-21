// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRule extends TeaModel {
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("ByLoadScalingRule")
    public ByLoadScalingRule byLoadScalingRule;

    @NameInMap("ByTimeScalingRule")
    public ByTimeScalingRule byTimeScalingRule;

    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    @NameInMap("ScalingActivityType")
    public String scalingActivityType;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static ScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ScalingRule self = new ScalingRule();
        return TeaModel.build(map, self);
    }

    public ScalingRule setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRule setByLoadScalingRule(ByLoadScalingRule byLoadScalingRule) {
        this.byLoadScalingRule = byLoadScalingRule;
        return this;
    }
    public ByLoadScalingRule getByLoadScalingRule() {
        return this.byLoadScalingRule;
    }

    public ScalingRule setByTimeScalingRule(ByTimeScalingRule byTimeScalingRule) {
        this.byTimeScalingRule = byTimeScalingRule;
        return this;
    }
    public ByTimeScalingRule getByTimeScalingRule() {
        return this.byTimeScalingRule;
    }

    public ScalingRule setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ScalingRule setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ScalingRule setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingRule setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public static class ByLoadScalingRule extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("CoolDownInterval")
        public Integer coolDownInterval;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public Double threshold;

        @NameInMap("TimeWindow")
        public Integer timeWindow;

        public static ByLoadScalingRule build(java.util.Map<String, ?> map) throws Exception {
            ByLoadScalingRule self = new ByLoadScalingRule();
            return TeaModel.build(map, self);
        }

        public ByLoadScalingRule setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ByLoadScalingRule setCoolDownInterval(Integer coolDownInterval) {
            this.coolDownInterval = coolDownInterval;
            return this;
        }
        public Integer getCoolDownInterval() {
            return this.coolDownInterval;
        }

        public ByLoadScalingRule setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public ByLoadScalingRule setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ByLoadScalingRule setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ByLoadScalingRule setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public ByLoadScalingRule setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

    }

    public static class ByTimeScalingRule extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LaunchTime")
        public Long launchTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        public static ByTimeScalingRule build(java.util.Map<String, ?> map) throws Exception {
            ByTimeScalingRule self = new ByTimeScalingRule();
            return TeaModel.build(map, self);
        }

        public ByTimeScalingRule setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ByTimeScalingRule setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

        public ByTimeScalingRule setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ByTimeScalingRule setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

    }

}
