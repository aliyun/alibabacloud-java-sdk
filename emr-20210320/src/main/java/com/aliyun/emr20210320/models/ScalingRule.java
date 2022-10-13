// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRule extends TeaModel {
    @NameInMap("ActivityType")
    public String activityType;

    @NameInMap("AdjustmentType")
    public String adjustmentType;

    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("ByLoadScalingRule")
    public MetricsTrigger byLoadScalingRule;

    @NameInMap("ByTimeScalingRule")
    public TimeTrigger byTimeScalingRule;

    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    @NameInMap("MetricsTrigger")
    public MetricsTrigger metricsTrigger;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("ScalingActivityType")
    public String scalingActivityType;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    @NameInMap("TimeTrigger")
    public TimeTrigger timeTrigger;

    @NameInMap("TriggerType")
    public String triggerType;

    public static ScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ScalingRule self = new ScalingRule();
        return TeaModel.build(map, self);
    }

    public ScalingRule setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public ScalingRule setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ScalingRule setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRule setByLoadScalingRule(MetricsTrigger byLoadScalingRule) {
        this.byLoadScalingRule = byLoadScalingRule;
        return this;
    }
    public MetricsTrigger getByLoadScalingRule() {
        return this.byLoadScalingRule;
    }

    public ScalingRule setByTimeScalingRule(TimeTrigger byTimeScalingRule) {
        this.byTimeScalingRule = byTimeScalingRule;
        return this;
    }
    public TimeTrigger getByTimeScalingRule() {
        return this.byTimeScalingRule;
    }

    public ScalingRule setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ScalingRule setMetricsTrigger(MetricsTrigger metricsTrigger) {
        this.metricsTrigger = metricsTrigger;
        return this;
    }
    public MetricsTrigger getMetricsTrigger() {
        return this.metricsTrigger;
    }

    public ScalingRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
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

    public ScalingRule setTimeTrigger(TimeTrigger timeTrigger) {
        this.timeTrigger = timeTrigger;
        return this;
    }
    public TimeTrigger getTimeTrigger() {
        return this.timeTrigger;
    }

    public ScalingRule setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
