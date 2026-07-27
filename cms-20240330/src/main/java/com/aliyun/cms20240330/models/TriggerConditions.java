// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TriggerConditions extends TeaModel {
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
