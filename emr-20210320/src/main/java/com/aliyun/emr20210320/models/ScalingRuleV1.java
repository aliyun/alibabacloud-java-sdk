// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRuleV1 extends TeaModel {
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("CoolDownTime")
    public Integer coolDownTime;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleParam")
    public RuleParam ruleParam;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("ScalingConfigBizId")
    public String scalingConfigBizId;

    public static ScalingRuleV1 build(java.util.Map<String, ?> map) throws Exception {
        ScalingRuleV1 self = new ScalingRuleV1();
        return TeaModel.build(map, self);
    }

    public ScalingRuleV1 setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ScalingRuleV1 setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRuleV1 setCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
        return this;
    }
    public Integer getCoolDownTime() {
        return this.coolDownTime;
    }

    public ScalingRuleV1 setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ScalingRuleV1 setRuleParam(RuleParam ruleParam) {
        this.ruleParam = ruleParam;
        return this;
    }
    public RuleParam getRuleParam() {
        return this.ruleParam;
    }

    public ScalingRuleV1 setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ScalingRuleV1 setScalingConfigBizId(String scalingConfigBizId) {
        this.scalingConfigBizId = scalingConfigBizId;
        return this;
    }
    public String getScalingConfigBizId() {
        return this.scalingConfigBizId;
    }

    public static class RuleParam extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("LaunchTime")
        public String launchTime;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public Integer threshold;

        public static RuleParam build(java.util.Map<String, ?> map) throws Exception {
            RuleParam self = new RuleParam();
            return TeaModel.build(map, self);
        }

        public RuleParam setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public RuleParam setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public RuleParam setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public RuleParam setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

        public RuleParam setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public RuleParam setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public RuleParam setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public RuleParam setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public RuleParam setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public RuleParam setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public RuleParam setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

}
