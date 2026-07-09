// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetTriggerCompositeExpression extends TeaModel {
    @NameInMap("conditions")
    public java.util.List<MetricSetTriggerSimpleExpression> conditions;

    @NameInMap("expressionType")
    public String expressionType;

    @NameInMap("logicOperator")
    public String logicOperator;

    public static MetricSetTriggerCompositeExpression build(java.util.Map<String, ?> map) throws Exception {
        MetricSetTriggerCompositeExpression self = new MetricSetTriggerCompositeExpression();
        return TeaModel.build(map, self);
    }

    public MetricSetTriggerCompositeExpression setConditions(java.util.List<MetricSetTriggerSimpleExpression> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<MetricSetTriggerSimpleExpression> getConditions() {
        return this.conditions;
    }

    public MetricSetTriggerCompositeExpression setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public MetricSetTriggerCompositeExpression setLogicOperator(String logicOperator) {
        this.logicOperator = logicOperator;
        return this;
    }
    public String getLogicOperator() {
        return this.logicOperator;
    }

}
