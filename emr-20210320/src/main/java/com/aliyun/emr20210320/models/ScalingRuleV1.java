// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRuleV1 extends TeaModel {
    /**
     * <p>调整类型。</p>
     * 
     * <strong>example:</strong>
     * <p>QUANTITY_CHANGE_IN_CAPACITY</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>调整值,正数为扩容,负数为缩容。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>冷却时间,单位秒。</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoolDownTime")
    public Integer coolDownTime;

    /**
     * <p>规则名称。</p>
     * 
     * <strong>example:</strong>
     * <p>tule1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>规则参数。</p>
     */
    @NameInMap("RuleParam")
    public RuleParam ruleParam;

    /**
     * <p>规则类型。</p>
     * 
     * <strong>example:</strong>
     * <p>BY_LOAD</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>弹性规则配置ID。</p>
     * 
     * <strong>example:</strong>
     * <p>SCB-DCD96BCCFED1****</p>
     */
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
        /**
         * <p>[负载触发参数] 比较符。</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>[负载触发参数] 统计次数。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>[时间调度参数] 周期类型周期过期时间。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        /**
         * <p>[时间调度参数] 周期类型周期开始时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-15T04:02Z</p>
         */
        @NameInMap("LaunchTime")
        public String launchTime;

        /**
         * <p>[负载触发参数] 度量名称。</p>
         * 
         * <strong>example:</strong>
         * <p>YarnRootAvailableVCores</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>[负载触发参数] 统计时长,单位分钟。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>[时间调度参数] 周期类型周期结束时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-16T05:02Z</p>
         */
        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        /**
         * <p>[时间调度参数] 周期类型。</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>[时间调度参数] 周期类型周期值。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>[负载触发参数] 统计方式。</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>[负载触发参数] 阈值。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
