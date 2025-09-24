// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageRequest extends TeaModel {
    /**
     * <p>The ID of the resource plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-03T12:00:00Z</p>
     */
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FPT_ossbag_absolute_Storage_sh</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ossbag</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
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
