// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmCompositeCompareConfig extends TeaModel {
    /**
     * <p>The aggregation method for metric data. For example, <code>AVG</code>, <code>SUM</code>, or <code>MAX</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>The operator for comparing the aggregated metric data against the <code>threshold</code>. For example, <code>GREATER_THAN</code> or <code>LESS_THAN</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The value to compare the aggregated metric data against. An alert is triggered when the metric data meets the condition defined by the <code>operator</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("threshold")
    public Float threshold;

    public static ApmCompositeCompareConfig build(java.util.Map<String, ?> map) throws Exception {
        ApmCompositeCompareConfig self = new ApmCompositeCompareConfig();
        return TeaModel.build(map, self);
    }

    public ApmCompositeCompareConfig setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public ApmCompositeCompareConfig setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ApmCompositeCompareConfig setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
