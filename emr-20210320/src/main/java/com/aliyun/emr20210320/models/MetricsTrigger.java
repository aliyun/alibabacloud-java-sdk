// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class MetricsTrigger extends TeaModel {
    /**
     * <p>多指标逻辑关系。默认：Or。取值范围：</p>
     * <p>- And:与</p>
     * <p>- Or：或</p>
     */
    @NameInMap("ConditionLogicOperator")
    public String conditionLogicOperator;

    /**
     * <p>指标触发条件列表。</p>
     */
    @NameInMap("Conditions")
    public java.util.List<TriggerCondition> conditions;

    /**
     * <p>冷却时间。 单位为秒</p>
     */
    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    /**
     * <p>统计次数。</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>时间限制。</p>
     */
    @NameInMap("TimeConstraints")
    public java.util.List<TimeConstraint> timeConstraints;

    /**
     * <p>统计窗口。单位为秒。</p>
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
