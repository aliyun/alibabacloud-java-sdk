// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetResourcePackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceRequest self = new GetResourcePackagePriceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcePackagePriceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetResourcePackagePriceRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public GetResourcePackagePriceRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public GetResourcePackagePriceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public GetResourcePackagePriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public GetResourcePackagePriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public GetResourcePackagePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetResourcePackagePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
