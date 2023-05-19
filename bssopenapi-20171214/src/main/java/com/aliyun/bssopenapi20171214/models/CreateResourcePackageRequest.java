// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageRequest extends TeaModel {
    /**
     * <p>The validity period of the resource plan.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The time when the resource plan takes effect. If you leave this parameter empty, the resource plan immediately takes effect by default.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the resource plan. Set this parameter to the code of the **resource plan** returned by calling the **DescribeResourcePackageProduct** operation.</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The unit of the validity period of the resource plan. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The code of the service. You can query the code by calling the **QueryProductList** operation or viewing **Codes of Alibaba Cloud services**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The specifications of the resource plan. Set this parameter to the value of the **specifications** returned by calling the **DescribeResourcePackageProduct** operation.</p>
     */
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
