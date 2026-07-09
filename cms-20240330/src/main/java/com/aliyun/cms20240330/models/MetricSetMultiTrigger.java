// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetMultiTrigger extends TeaModel {
    @NameInMap("conditions")
    public java.util.List<MetricSetTriggerSimpleExpression> conditions;

    @NameInMap("durationSecs")
    public Integer durationSecs;

    @NameInMap("expressionType")
    public String expressionType;

    @NameInMap("logicOperator")
    public String logicOperator;

    @NameInMap("max")
    public Double max;

    @NameInMap("min")
    public Double min;

    @NameInMap("operator")
    public String operator;

    @NameInMap("queryName")
    public String queryName;

    @NameInMap("severity")
    public String severity;

    @NameInMap("threshold")
    public Double threshold;

    public static MetricSetMultiTrigger build(java.util.Map<String, ?> map) throws Exception {
        MetricSetMultiTrigger self = new MetricSetMultiTrigger();
        return TeaModel.build(map, self);
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
