// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Triggers extends TeaModel {
    /**
     * <p>The comparison operator for CLOUD_MONITORING_CONDITION.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The match expression for SLS_MULTI_CONDITION. Corresponds to the V1 condition field and is preserved as-is without parsing.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>The list of sub-conditions for UMODEL_METRICSET_MULTI / PROMETHEUS_MULTI with expressionType=COMPOSITE. Each item contains queryName, operator, and threshold.</p>
     */
    @NameInMap("conditions")
    public java.util.List<TriggerConditions> conditions;

    /**
     * <p>The count match expression for SLS_MULTI_CONDITION. Corresponds to the V1 countCondition field and is preserved as-is without parsing.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("countCondition")
    public String countCondition;

    /**
     * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION countOperator is disabled. Use countCondition instead.</p>
     * 
     * <strong>example:</strong>
     * <p>GTE</p>
     */
    @NameInMap("countOperator")
    @Deprecated
    public String countOperator;

    /**
     * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION countOperator is disabled. Use countCondition instead.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("countThreshold")
    @Deprecated
    public Long countThreshold;

    /**
     * <p>The duration in seconds for which data must continuously meet the condition to fire an alert. If not specified, the value is inherited from conditionConfig.durationSecs. Used by UMODEL_METRICSET_MULTI_CONDITION / PROMETHEUS_MULTI_CONDITION.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>The expression type. For UMODEL_METRICSET_MULTI_CONDITION / PROMETHEUS_MULTI_CONDITION, valid values are SIMPLE and COMPOSITE.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The logic operator for UMODEL_METRICSET_MULTI / PROMETHEUS_MULTI with expressionType=COMPOSITE. Valid values: AND, OR, and UNLESS.</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("logicOperator")
    public String logicOperator;

    /**
     * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION matchField is disabled. Use condition instead.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("matchField")
    @Deprecated
    public String matchField;

    /**
     * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION matchField is disabled. Use condition instead.</p>
     * 
     * <strong>example:</strong>
     * <p>PRESENT</p>
     */
    @NameInMap("matchOperator")
    @Deprecated
    public String matchOperator;

    /**
     * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION matchField is disabled. Use condition instead.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("matchValue")
    @Deprecated
    public String matchValue;

    /**
     * <p>The upper bound of the range for UMODEL_METRICSET_MULTI with expressionType=SIMPLE. Required when operator is IN_RANGE or OUT_OF_RANGE. The value must be greater than or equal to min.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The metric name for CLOUD_MONITORING_CONDITION with expressionType=COMPOSITE. For SIMPLE, the metric name is specified at the conditionConfig level.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleMetricName</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The lower bound of the range for UMODEL_METRICSET_MULTI with expressionType=SIMPLE. Required when operator is IN_RANGE or OUT_OF_RANGE.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The operator. For UMODEL_METRICSET_MULTI / PROMETHEUS_MULTI with expressionType=SIMPLE, this is a comparison operator. Valid values: GT, GE, LT, LE, EQ, NE, IN_RANGE, OUT_OF_RANGE, PRESENT, NOT_PRESENT, ABOVE_UPPER, BELOW_LOWER, and OUT_OF_BAND. For SLS_MULTI_CONDITION, this aligns with the V1 caseList.type. Valid values: HAS_DATA, HAS_DATA_COUNT, HAS_DATA_MATCH, and HAS_DATA_MATCH_COUNT.</p>
     * 
     * <strong>example:</strong>
     * <p>GT</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The collection period in seconds for CLOUD_MONITORING_CONDITION with expressionType=COMPOSITE. For SIMPLE, the period is specified at the conditionConfig level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The precondition for CLOUD_MONITORING_CONDITION.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("preCondition")
    public String preCondition;

    /**
     * <p>The referenced query name for UMODEL_METRICSET_MULTI / PROMETHEUS_MULTI with expressionType=SIMPLE. Corresponds to QueryConfigUnified.queries[].name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleMetricName</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The severity level. Priority order: CRITICAL &gt; ERROR &gt; WARN / WARNING &gt; INFO. When multiple triggers exist, they are sorted by this priority, and the first match fires. This takes effect for SLS_MULTI_CONDITION and CLOUD_MONITORING_CONDITION with expressionType=SIMPLE.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The statistics method for CLOUD_MONITORING_CONDITION.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("statistics")
    public String statistics;

    /**
     * <p>The threshold. For CLOUD_MONITORING_CONDITION, this is a string. For UMODEL_METRICSET_MULTI / PROMETHEUS_MULTI, this is a numeric value.</p>
     */
    @NameInMap("threshold")
    public Object threshold;

    /**
     * <p>The number of consecutive triggers for CLOUD_MONITORING_CONDITION with expressionType=SIMPLE. Each entry is configured independently.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public Triggers setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public Triggers setConditions(java.util.List<TriggerConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<TriggerConditions> getConditions() {
        return this.conditions;
    }

    public Triggers setCountCondition(String countCondition) {
        this.countCondition = countCondition;
        return this;
    }
    public String getCountCondition() {
        return this.countCondition;
    }

    @Deprecated
    public Triggers setCountOperator(String countOperator) {
        this.countOperator = countOperator;
        return this;
    }
    public String getCountOperator() {
        return this.countOperator;
    }

    @Deprecated
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

    @Deprecated
    public Triggers setMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }
    public String getMatchField() {
        return this.matchField;
    }

    @Deprecated
    public Triggers setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    @Deprecated
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
