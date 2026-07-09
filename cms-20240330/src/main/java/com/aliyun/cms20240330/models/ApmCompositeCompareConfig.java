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

    /**
     * <p>The time unit for the year-over-year (YoY) comparison. Use this parameter with <code>yoyTimeValue</code> to define the comparison period. Valid values are <code>day</code> and <code>week</code>.</p>
     */
    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    /**
     * <p>The time value for the YoY comparison. For example, if <code>yoyTimeUnit</code> is <code>day</code> and <code>yoyTimeValue</code> is <code>7</code>, the system compares current data with data from 7 days ago.</p>
     */
    @NameInMap("yoyTimeValue")
    public Integer yoyTimeValue;

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

    public ApmCompositeCompareConfig setYoyTimeUnit(String yoyTimeUnit) {
        this.yoyTimeUnit = yoyTimeUnit;
        return this;
    }
    public String getYoyTimeUnit() {
        return this.yoyTimeUnit;
    }

    public ApmCompositeCompareConfig setYoyTimeValue(Integer yoyTimeValue) {
        this.yoyTimeValue = yoyTimeValue;
        return this;
    }
    public Integer getYoyTimeValue() {
        return this.yoyTimeValue;
    }

}
