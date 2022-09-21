// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRuleSpec extends TeaModel {
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("ByLoadScalingRuleSpec")
    public ByLoadScalingRuleSpec byLoadScalingRuleSpec;

    @NameInMap("ByTimeScalingRuleSpec")
    public ByTimeScalingRuleSpec byTimeScalingRuleSpec;

    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    @NameInMap("ScalingActivityType")
    public String scalingActivityType;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static ScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
        ScalingRuleSpec self = new ScalingRuleSpec();
        return TeaModel.build(map, self);
    }

    public ScalingRuleSpec setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRuleSpec setByLoadScalingRuleSpec(ByLoadScalingRuleSpec byLoadScalingRuleSpec) {
        this.byLoadScalingRuleSpec = byLoadScalingRuleSpec;
        return this;
    }
    public ByLoadScalingRuleSpec getByLoadScalingRuleSpec() {
        return this.byLoadScalingRuleSpec;
    }

    public ScalingRuleSpec setByTimeScalingRuleSpec(ByTimeScalingRuleSpec byTimeScalingRuleSpec) {
        this.byTimeScalingRuleSpec = byTimeScalingRuleSpec;
        return this;
    }
    public ByTimeScalingRuleSpec getByTimeScalingRuleSpec() {
        return this.byTimeScalingRuleSpec;
    }

    public ScalingRuleSpec setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ScalingRuleSpec setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ScalingRuleSpec setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingRuleSpec setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public static class ByLoadScalingRuleSpec extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

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

        public static ByLoadScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
            ByLoadScalingRuleSpec self = new ByLoadScalingRuleSpec();
            return TeaModel.build(map, self);
        }

        public ByLoadScalingRuleSpec setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ByLoadScalingRuleSpec setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public ByLoadScalingRuleSpec setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ByLoadScalingRuleSpec setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ByLoadScalingRuleSpec setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public ByLoadScalingRuleSpec setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

    }

    public static class ByTimeScalingRuleSpec extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LaunchTime")
        public Long launchTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        public static ByTimeScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
            ByTimeScalingRuleSpec self = new ByTimeScalingRuleSpec();
            return TeaModel.build(map, self);
        }

        public ByTimeScalingRuleSpec setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ByTimeScalingRuleSpec setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

        public ByTimeScalingRuleSpec setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ByTimeScalingRuleSpec setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

    }

}
