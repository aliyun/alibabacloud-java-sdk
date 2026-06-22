// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class MetricsTrigger extends TeaModel {
    /**
     * <p>The logical relationship between multiple metrics. Valid values:</p>
     * <ul>
     * <li>And</li>
     * <li>Or (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Or</p>
     */
    @NameInMap("ConditionLogicOperator")
    public String conditionLogicOperator;

    /**
     * <p>The trigger conditions for the metric.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<TriggerCondition> conditions;

    /**
     * <p>The cooldown interval. Unit: seconds. Valid values: 0 to 10800.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    /**
     * <p>The number of times that the statistics are collected. This parameter is required. Valid values: 1 to 5.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The limits on time.</p>
     */
    @NameInMap("TimeConstraints")
    public java.util.List<TimeConstraint> timeConstraints;

    /**
     * <p>The time window for statistics. This parameter is required. Unit: seconds. Valid values: 30 to 1800.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static MetricsTrigger build(java.util.Map<String, ?> map) throws Exception {
        MetricsTrigger self = new MetricsTrigger();
        return TeaModel.build(map, self);
    }

    public MetricsTrigger setConditionLogicOperator(String conditionLogicOperator) {
        this.conditionLogicOperator = conditionLogicOperator;
        return this;
    }
    public String getConditionLogicOperator() {
        return this.conditionLogicOperator;
    }

    public MetricsTrigger setConditions(java.util.List<TriggerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<TriggerCondition> getConditions() {
        return this.conditions;
    }

    public MetricsTrigger setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public MetricsTrigger setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public MetricsTrigger setTimeConstraints(java.util.List<TimeConstraint> timeConstraints) {
        this.timeConstraints = timeConstraints;
        return this;
    }
    public java.util.List<TimeConstraint> getTimeConstraints() {
        return this.timeConstraints;
    }

    public MetricsTrigger setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
