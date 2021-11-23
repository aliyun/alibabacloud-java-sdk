// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Specification")
    public String specification;

    public static GetResourcePackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceRequest self = new GetResourcePackagePriceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcePackagePriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public GetResourcePackagePriceRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public GetResourcePackagePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetResourcePackagePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetResourcePackagePriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetResourcePackagePriceRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public GetResourcePackagePriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public GetResourcePackagePriceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetResourcePackagePriceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

}
