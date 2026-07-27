// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusMultiTrigger extends TeaModel {
    @NameInMap("conditions")
    public java.util.List<PrometheusSimpleExpression> conditions;

    @NameInMap("durationSecs")
    public Integer durationSecs;

    @NameInMap("expressionType")
    public String expressionType;

    @NameInMap("logicOperator")
    public String logicOperator;

    @NameInMap("operator")
    public String operator;

    @NameInMap("queryName")
    public String queryName;

    @NameInMap("severity")
    public String severity;

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
