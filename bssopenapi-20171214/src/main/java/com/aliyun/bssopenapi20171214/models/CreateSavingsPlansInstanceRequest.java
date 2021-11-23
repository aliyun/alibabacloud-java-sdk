// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateSavingsPlansInstanceRequest extends TeaModel {
    // commodityCode
    @NameInMap("CommodityCode")
    public String commodityCode;

    // duration
    @NameInMap("Duration")
    public String duration;

    // effectiveDate
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    // payMode
    @NameInMap("PayMode")
    public String payMode;

    // poolValue
    @NameInMap("PoolValue")
    public String poolValue;

    // pricingCycle
    @NameInMap("PricingCycle")
    public String pricingCycle;

    // region
    @NameInMap("Region")
    public String region;

    // specType
    @NameInMap("SpecType")
    public String specType;

    // specification
    @NameInMap("Specification")
    public String specification;

    // type
    @NameInMap("Type")
    public String type;

    public static CreateSavingsPlansInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlansInstanceRequest self = new CreateSavingsPlansInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlansInstanceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateSavingsPlansInstanceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateSavingsPlansInstanceRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public CreateSavingsPlansInstanceRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public CreateSavingsPlansInstanceRequest setPoolValue(String poolValue) {
        this.poolValue = poolValue;
        return this;
    }
    public String getPoolValue() {
        return this.poolValue;
    }

    public CreateSavingsPlansInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateSavingsPlansInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSavingsPlansInstanceRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreateSavingsPlansInstanceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreateSavingsPlansInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
