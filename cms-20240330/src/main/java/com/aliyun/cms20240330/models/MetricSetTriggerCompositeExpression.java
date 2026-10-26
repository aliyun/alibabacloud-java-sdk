// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetTriggerCompositeExpression extends TeaModel {
    /**
     * <p>The list of sub-conditions, where each item is a simple comparison expression.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;expressionType&quot;:&quot;SIMPLE&quot;,&quot;queryName&quot;:&quot;cpuQuery&quot;,&quot;operator&quot;:&quot;GT&quot;,&quot;threshold&quot;:80}]</p>
     */
    @NameInMap("conditions")
    public java.util.List<MetricSetTriggerSimpleExpression> conditions;

    /**
     * <p>The expression type, which is fixed to COMPOSITE.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPOSITE</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The logical operator. Valid values: AND (all conditions are met), OR (any condition is met), and UNLESS (the first condition is met and none of the others are met).</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
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
