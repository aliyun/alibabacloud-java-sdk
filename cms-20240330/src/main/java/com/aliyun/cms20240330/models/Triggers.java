// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Triggers extends TeaModel {
    /**
     * <p>The comparison operator for CLOUD_MONITORING_CONDITION.</p>
     */
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The list of sub-conditions for UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=COMPOSITE. Each item contains queryName, operator, and threshold.</p>
     */
    @NameInMap("conditions")
    public java.util.List<TriggerConditions> conditions;

    /**
     * <p>The count comparison operator for SLS_MULTI_CONDITION. Valid values: GTE, GT, EQ, LTE, and LT.</p>
     */
    @NameInMap("countOperator")
    public String countOperator;

    /**
     * <p>The count threshold for SLS_MULTI_CONDITION. An alert is triggered when this threshold is met.</p>
     */
    @NameInMap("countThreshold")
    public Long countThreshold;

    /**
     * <p>The duration in seconds during which data must continuously meet the condition before an alert is triggered. If this parameter is not specified, the value of conditionConfig.durationSecs is inherited. This parameter is used by UMODEL_METRICSET_MULTI_CONDITION and PROMETHEUS_MULTI_CONDITION.</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>The expression type. Valid values: SIMPLE and COMPOSITE. This parameter takes effect for UMODEL_METRICSET_MULTI_CONDITION and PROMETHEUS_MULTI_CONDITION.</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The logical operator for UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=COMPOSITE. Valid values: AND, OR, and UNLESS.</p>
     */
    @NameInMap("logicOperator")
    public String logicOperator;

    /**
     * <p>The log field name for SLS_MULTI_CONDITION. This parameter is required when matchOperator is set to CONTAINS, EQUALS, or REGEX. When matchOperator is set to PRESENT or NOT_PRESENT, specify the field name.</p>
     */
    @NameInMap("matchField")
    public String matchField;

    /**
     * <p>The log match operator for SLS_MULTI_CONDITION. Valid values: PRESENT, NOT_PRESENT, CONTAINS, EQUALS, and REGEX. If this parameter is left empty, any data matches.</p>
     */
    @NameInMap("matchOperator")
    public String matchOperator;

    /**
     * <p>The log match value for SLS_MULTI_CONDITION. This parameter is required when matchOperator is set to CONTAINS, EQUALS, or REGEX.</p>
     */
    @NameInMap("matchValue")
    public String matchValue;

    /**
     * <p>The upper bound of the range for UMODEL_METRICSET_MULTI with expressionType=SIMPLE. This parameter is required when operator is set to IN_RANGE or OUT_OF_RANGE. The value must be greater than or equal to min.</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The metric name. This parameter is used for CLOUD_MONITORING_CONDITION with expressionType=COMPOSITE. For SIMPLE, the metric name is specified at the conditionConfig level by the metricName parameter.</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The lower bound of the range for UMODEL_METRICSET_MULTI with expressionType=SIMPLE. This parameter is required when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The comparison operator for UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=SIMPLE.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The aggregation period in seconds. This parameter is used for CLOUD_MONITORING_CONDITION with expressionType=COMPOSITE. For SIMPLE, the period is specified at the conditionConfig level by the period parameter.</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The precondition for CLOUD_MONITORING_CONDITION.</p>
     */
    @NameInMap("preCondition")
    public String preCondition;

    /**
     * <p>The referenced query name for UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=SIMPLE. This corresponds to QueryConfigUnified.queries[].name.</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The severity level. Priority order: CRITICAL &gt; ERROR &gt; WARN / WARNING &gt; INFO. When multiple triggers exist, they are sorted by this priority, and the first match triggers the alert. This parameter takes effect for SLS_MULTI_CONDITION and CLOUD_MONITORING_CONDITION with expressionType=SIMPLE.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The statistical method for CLOUD_MONITORING_CONDITION.</p>
     */
    @NameInMap("statistics")
    public String statistics;

    /**
     * <p>The threshold value. For CLOUD_MONITORING_CONDITION, this is a string. For UMODEL_METRICSET_MULTI and PROMETHEUS_MULTI, this is a numeric value.</p>
     */
    @NameInMap("threshold")
    public Object threshold;

    /**
     * <p>The number of consecutive times the condition must be met before an alert is triggered. This parameter is used for CLOUD_MONITORING_CONDITION with expressionType=SIMPLE and is set independently for each entry.</p>
     */
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
