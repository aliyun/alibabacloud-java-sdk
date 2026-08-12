// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmCompositeCompareConfig extends TeaModel {
    /**
     * <p>The aggregate functions used for aggregation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>The comparison operator. GTE/LTE indicates greater than or equal to/less than or equal to. YOY_UP/YOY_DOWN indicates year-over-year increase/decrease, which requires yoyTimeUnit and yoyTimeValue to be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The threshold.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("threshold")
    public Float threshold;

    /**
     * <p>The year-over-year time unit. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
     */
    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    /**
     * <p>The year-over-year time value. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
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
