// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusMultiTrigger extends TeaModel {
    /**
     * <p>The list of sub-conditions. This parameter is used when expressionType is set to COMPOSITE. Each item contains queryName, operator, and threshold.</p>
     */
    @NameInMap("conditions")
    public java.util.List<PrometheusSimpleExpression> conditions;

    /**
     * <p>The duration, in seconds, for which the data must continuously meet the condition before the alert is triggered. If this parameter is not specified, the value of conditionConfig.durationSecs is inherited.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>The expression type. Valid values:</p>
     * <ul>
     * <li>SIMPLE: single-query threshold.</li>
     * <li>COMPOSITE: multi-query AND/OR/UNLESS combination.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The logical operator. This parameter is used when expressionType is set to COMPOSITE. Valid values: AND, OR, and UNLESS.</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("logicOperator")
    public String logicOperator;

    /**
     * <p>The comparison operator. This parameter is used when expressionType is set to SIMPLE. Valid values: GT, GE, LT, LE, EQ, and NE.</p>
     * 
     * <strong>example:</strong>
     * <p>GT</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The referenced query name. This parameter is used when expressionType is set to SIMPLE. The value corresponds to QueryConfigUnified.queries[].name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The alert severity level. Severity levels in descending priority: CRITICAL &gt; ERROR &gt; WARN / WARNING &gt; INFO. When multiple triggers are configured, they are sorted by this priority, and the first match fires the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The comparison threshold. This parameter is used when expressionType is set to SIMPLE.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    public static PrometheusMultiTrigger build(java.util.Map<String, ?> map) throws Exception {
        PrometheusMultiTrigger self = new PrometheusMultiTrigger();
        return TeaModel.build(map, self);
    }

    public PrometheusMultiTrigger setConditions(java.util.List<PrometheusSimpleExpression> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<PrometheusSimpleExpression> getConditions() {
        return this.conditions;
    }

    public PrometheusMultiTrigger setDurationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    public PrometheusMultiTrigger setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public PrometheusMultiTrigger setLogicOperator(String logicOperator) {
        this.logicOperator = logicOperator;
        return this;
    }
    public String getLogicOperator() {
        return this.logicOperator;
    }

    public PrometheusMultiTrigger setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PrometheusMultiTrigger setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public PrometheusMultiTrigger setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public PrometheusMultiTrigger setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
