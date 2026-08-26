// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TriggerConditions extends TeaModel {
    /**
     * <p>The expression type, fixed as SIMPLE (used by MetricSet multi-threshold triggers).</p>
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
     * <p>The comparison operator. Valid values: GT / GE / LT / LE / EQ / NE / IN_RANGE (requires both min and max) / OUT_OF_RANGE (requires both min and max) / PRESENT / NOT_PRESENT.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The referenced query name, corresponding to QueryConfigUnified.queries[].name.</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The comparison threshold. Used when operator is GT, GE, LT, LE, EQ, or NE. Use min and max for IN_RANGE or OUT_OF_RANGE. Leave empty for PRESENT or NOT_PRESENT.</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    public static TriggerConditions build(java.util.Map<String, ?> map) throws Exception {
        TriggerConditions self = new TriggerConditions();
        return TeaModel.build(map, self);
    }

    public TriggerConditions setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public TriggerConditions setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public TriggerConditions setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public TriggerConditions setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TriggerConditions setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public TriggerConditions setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
