// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetTriggerSimpleExpression extends TeaModel {
    @NameInMap("expressionType")
    public String expressionType;

    @NameInMap("max")
    public Double max;

    @NameInMap("min")
    public Double min;

    @NameInMap("operator")
    public String operator;

    @NameInMap("queryName")
    public String queryName;

    @NameInMap("threshold")
    public Double threshold;

    public static MetricSetTriggerSimpleExpression build(java.util.Map<String, ?> map) throws Exception {
        MetricSetTriggerSimpleExpression self = new MetricSetTriggerSimpleExpression();
        return TeaModel.build(map, self);
    }

    public MetricSetTriggerSimpleExpression setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public MetricSetTriggerSimpleExpression setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public MetricSetTriggerSimpleExpression setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public MetricSetTriggerSimpleExpression setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public MetricSetTriggerSimpleExpression setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public MetricSetTriggerSimpleExpression setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
