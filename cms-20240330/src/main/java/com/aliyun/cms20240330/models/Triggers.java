// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Triggers extends TeaModel {
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    @NameInMap("conditions")
    public java.util.List<TriggerConditions> conditions;

    @NameInMap("countOperator")
    public String countOperator;

    @NameInMap("countThreshold")
    public Long countThreshold;

    @NameInMap("durationSecs")
    public Integer durationSecs;

    @NameInMap("expressionType")
    public String expressionType;

    @NameInMap("logicOperator")
    public String logicOperator;

    @NameInMap("matchField")
    public String matchField;

    @NameInMap("matchOperator")
    public String matchOperator;

    @NameInMap("matchValue")
    public String matchValue;

    @NameInMap("max")
    public Double max;

    @NameInMap("metricName")
    public String metricName;

    @NameInMap("min")
    public Double min;

    @NameInMap("operator")
    public String operator;

    @NameInMap("period")
    public Integer period;

    @NameInMap("preCondition")
    public String preCondition;

    @NameInMap("queryName")
    public String queryName;

    @NameInMap("severity")
    public String severity;

    @NameInMap("statistics")
    public String statistics;

    @NameInMap("threshold")
    public Object threshold;

    @NameInMap("times")
    public Integer times;

    public static Triggers build(java.util.Map<String, ?> map) throws Exception {
        Triggers self = new Triggers();
        return TeaModel.build(map, self);
    }

    public Triggers setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public Triggers setConditions(java.util.List<TriggerConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<TriggerConditions> getConditions() {
        return this.conditions;
    }

    public Triggers setCountOperator(String countOperator) {
        this.countOperator = countOperator;
        return this;
    }
    public String getCountOperator() {
        return this.countOperator;
    }

    public Triggers setCountThreshold(Long countThreshold) {
        this.countThreshold = countThreshold;
        return this;
    }
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    public Triggers setDurationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    public Triggers setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public Triggers setLogicOperator(String logicOperator) {
        this.logicOperator = logicOperator;
        return this;
    }
    public String getLogicOperator() {
        return this.logicOperator;
    }

    public Triggers setMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }
    public String getMatchField() {
        return this.matchField;
    }

    public Triggers setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    public Triggers setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

    public Triggers setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public Triggers setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public Triggers setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public Triggers setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Triggers setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public Triggers setPreCondition(String preCondition) {
        this.preCondition = preCondition;
        return this;
    }
    public String getPreCondition() {
        return this.preCondition;
    }

    public Triggers setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public Triggers setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public Triggers setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public Triggers setThreshold(Object threshold) {
        this.threshold = threshold;
        return this;
    }
    public Object getThreshold() {
        return this.threshold;
    }

    public Triggers setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
