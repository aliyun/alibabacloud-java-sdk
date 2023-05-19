// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateSavingsPlansInstanceShrinkRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("ExtendMap")
    public String extendMapShrink;

    @NameInMap("PayMode")
    public String payMode;

    @NameInMap("PoolValue")
    public String poolValue;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Region")
    public String region;

    @NameInMap("SpecType")
    public String specType;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("Type")
    public String type;

    public static CreateSavingsPlansInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlansInstanceShrinkRequest self = new CreateSavingsPlansInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlansInstanceShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateSavingsPlansInstanceShrinkRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateSavingsPlansInstanceShrinkRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public CreateSavingsPlansInstanceShrinkRequest setExtendMapShrink(String extendMapShrink) {
        this.extendMapShrink = extendMapShrink;
        return this;
    }
    public String getExtendMapShrink() {
        return this.extendMapShrink;
    }

    public CreateSavingsPlansInstanceShrinkRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public CreateSavingsPlansInstanceShrinkRequest setPoolValue(String poolValue) {
        this.poolValue = poolValue;
        return this;
    }
    public String getPoolValue() {
        return this.poolValue;
    }

    public CreateSavingsPlansInstanceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateSavingsPlansInstanceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSavingsPlansInstanceShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreateSavingsPlansInstanceShrinkRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreateSavingsPlansInstanceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
