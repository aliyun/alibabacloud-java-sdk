// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

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

    public static CreateResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageRequest self = new CreateResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourcePackageRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateResourcePackageRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public CreateResourcePackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateResourcePackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateResourcePackageRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateResourcePackageRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateResourcePackageRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

}
