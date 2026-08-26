// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetTriggerSimpleExpression extends TeaModel {
    /**
     * <p>The expression type. Fixed as SIMPLE.</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The upper bound of the range. Required when operator is IN_RANGE or OUT_OF_RANGE. Must be greater than or equal to min.</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range. Required when operator is IN_RANGE or OUT_OF_RANGE.</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The comparison operator. Valid values: GT (greater than), GE (greater than or equal to), LT (less than), LE (less than or equal to), EQ (equal to), NE (not equal to), IN_RANGE (within range, requires both min and max), OUT_OF_RANGE (outside range, requires both min and max), PRESENT (field exists, does not require threshold/min/max), NOT_PRESENT (field does not exist, does not require threshold/min/max).</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The referenced query name, corresponding to QueryConfigUnified.queries[].name.</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The comparison threshold. Used when operator is GT, GE, LT, LE, EQ, or NE. IN_RANGE and OUT_OF_RANGE use min/max instead. PRESENT and NOT_PRESENT do not require this field.</p>
     */
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
