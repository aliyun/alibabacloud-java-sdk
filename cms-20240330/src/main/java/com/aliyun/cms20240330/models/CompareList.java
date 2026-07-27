// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CompareList extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("threshold")
    public Float threshold;

    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    @NameInMap("yoyTimeValue")
    public Integer yoyTimeValue;

    public static CompareList build(java.util.Map<String, ?> map) throws Exception {
        CompareList self = new CompareList();
        return TeaModel.build(map, self);
    }

    public CompareList setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public CompareList setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CompareList setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public CompareList setYoyTimeUnit(String yoyTimeUnit) {
        this.yoyTimeUnit = yoyTimeUnit;
        return this;
    }
    public String getYoyTimeUnit() {
        return this.yoyTimeUnit;
    }

    public CompareList setYoyTimeValue(Integer yoyTimeValue) {
        this.yoyTimeValue = yoyTimeValue;
        return this;
    }
    public Integer getYoyTimeValue() {
        return this.yoyTimeValue;
    }

}
