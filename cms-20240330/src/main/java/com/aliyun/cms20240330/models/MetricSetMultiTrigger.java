// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetMultiTrigger extends TeaModel {
    /**
     * <p>The minimum deviation or absolute deviation dead zone for the dynamic baseline. Takes effect only with baseline operators. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 means no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The baseline period. Takes effect only with baseline operators. Valid values: AUTO (automatic detection), DAILY (daily), WEEKLY (weekly), and NONE (no period). When set to WEEKLY, the backend automatically expands the historical training window to at least 14 days.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("baselinePeriod")
    public String baselinePeriod;

    /**
     * <p>The list of sub-conditions. Used when expressionType is COMPOSITE. Each item contains queryName, operator, and threshold.</p>
     */
    @NameInMap("conditions")
    public java.util.List<MetricSetTriggerSimpleExpression> conditions;

    /**
     * <p>The duration in seconds that data must continuously meet the condition before an alert is triggered. If not specified, the value is inherited from conditionConfig.durationSecs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>The expression type. Valid values: SIMPLE (single-metric threshold) and COMPOSITE (multi-metric AND/OR/UNLESS combination).</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The logical operator. Used when expressionType is COMPOSITE. Valid values: AND (all conditions met), OR (any condition met), and UNLESS (first condition met and all others not met).</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("logicOperator")
    public String logicOperator;

    /**
     * <p>The upper bound of the range. Required when expressionType is SIMPLE and operator is IN_RANGE or OUT_OF_RANGE. The value must be greater than or equal to min.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range. Required when expressionType is SIMPLE and operator is IN_RANGE or OUT_OF_RANGE.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The comparison operator (used when expressionType is SIMPLE). Valid values: GT (greater than), GE (greater than or equal to), LT (less than), LE (less than or equal to), EQ (equal to), NE (not equal to), IN_RANGE (within range, requires min/max), OUT_OF_RANGE (outside range, requires min/max), PRESENT (field exists, no threshold/min/max required), NOT_PRESENT (field does not exist, no threshold/min/max required), ABOVE_UPPER/BELOW_LOWER/OUT_OF_BAND (dynamic baseline spike/drop/bidirectional, requires sensitivity, no threshold/min/max).</p>
     * 
     * <strong>example:</strong>
     * <p>OUT_OF_BAND</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The referenced query name (used when expressionType is SIMPLE), corresponding to QueryConfigUnified.queries[].name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The dynamic baseline sensitivity. Takes effect when expressionType is SIMPLE and a baseline operator is used. Valid values: HIGH (narrowest and most sensitive band), MEDIUM, and LOW (widest and least sensitive band).</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("sensitivity")
    public String sensitivity;

    /**
     * <p>The alert severity level: CRITICAL &gt; ERROR &gt; WARN / WARNING &gt; INFO. Multiple triggers are sorted by this priority, and the first match fires.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The comparison threshold. Used when expressionType is SIMPLE and operator is GT/GE/LT/LE/EQ/NE. For IN_RANGE/OUT_OF_RANGE, use min/max instead. Not required for PRESENT/NOT_PRESENT.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    public static MetricSetMultiTrigger build(java.util.Map<String, ?> map) throws Exception {
        MetricSetMultiTrigger self = new MetricSetMultiTrigger();
        return TeaModel.build(map, self);
    }

    public MetricSetMultiTrigger setAbsDeviation(Double absDeviation) {
        this.absDeviation = absDeviation;
        return this;
    }
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    public MetricSetMultiTrigger setBaselinePeriod(String baselinePeriod) {
        this.baselinePeriod = baselinePeriod;
        return this;
    }
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    public MetricSetMultiTrigger setConditions(java.util.List<MetricSetTriggerSimpleExpression> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<MetricSetTriggerSimpleExpression> getConditions() {
        return this.conditions;
    }

    public MetricSetMultiTrigger setDurationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    public MetricSetMultiTrigger setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public MetricSetMultiTrigger setLogicOperator(String logicOperator) {
        this.logicOperator = logicOperator;
        return this;
    }
    public String getLogicOperator() {
        return this.logicOperator;
    }

    public MetricSetMultiTrigger setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public MetricSetMultiTrigger setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public MetricSetMultiTrigger setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public MetricSetMultiTrigger setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public MetricSetMultiTrigger setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public String getSensitivity() {
        return this.sensitivity;
    }

    public MetricSetMultiTrigger setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public MetricSetMultiTrigger setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
