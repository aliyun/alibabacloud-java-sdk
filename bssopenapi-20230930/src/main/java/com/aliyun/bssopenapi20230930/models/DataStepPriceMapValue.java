// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DataStepPriceMapValue extends TeaModel {
    @NameInMap("RightClose")
    public Boolean rightClose;

    @NameInMap("Min")
    public String min;

    @NameInMap("Max")
    public String max;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("LeftClose")
    public Boolean leftClose;

    @NameInMap("StepPriceValue")
    public String stepPriceValue;

    @NameInMap("PriceValueType")
    public String priceValueType;

    @NameInMap("PriceValue")
    public String priceValue;

    @NameInMap("DeductCycleType")
    public String deductCycleType;

    public static DataStepPriceMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataStepPriceMapValue self = new DataStepPriceMapValue();
        return TeaModel.build(map, self);
    }

    public DataStepPriceMapValue setRightClose(Boolean rightClose) {
        this.rightClose = rightClose;
        return this;
    }
    public Boolean getRightClose() {
        return this.rightClose;
    }

    public DataStepPriceMapValue setMin(String min) {
        this.min = min;
        return this;
    }
    public String getMin() {
        return this.min;
    }

    public DataStepPriceMapValue setMax(String max) {
        this.max = max;
        return this;
    }
    public String getMax() {
        return this.max;
    }

    public DataStepPriceMapValue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DataStepPriceMapValue setLeftClose(Boolean leftClose) {
        this.leftClose = leftClose;
        return this;
    }
    public Boolean getLeftClose() {
        return this.leftClose;
    }

    public DataStepPriceMapValue setStepPriceValue(String stepPriceValue) {
        this.stepPriceValue = stepPriceValue;
        return this;
    }
    public String getStepPriceValue() {
        return this.stepPriceValue;
    }

    public DataStepPriceMapValue setPriceValueType(String priceValueType) {
        this.priceValueType = priceValueType;
        return this;
    }
    public String getPriceValueType() {
        return this.priceValueType;
    }

    public DataStepPriceMapValue setPriceValue(String priceValue) {
        this.priceValue = priceValue;
        return this;
    }
    public String getPriceValue() {
        return this.priceValue;
    }

    public DataStepPriceMapValue setDeductCycleType(String deductCycleType) {
        this.deductCycleType = deductCycleType;
        return this;
    }
    public String getDeductCycleType() {
        return this.deductCycleType;
    }

}
