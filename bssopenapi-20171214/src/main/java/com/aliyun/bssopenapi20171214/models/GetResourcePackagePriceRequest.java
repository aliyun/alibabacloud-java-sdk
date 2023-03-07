// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceRequest extends TeaModel {
    /**
     * <p>The validity period of the resource plan. The value must be the same as the duration of the resource plan specified in the specifications.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The time when the resource plan takes effect. If you do not specify this parameter, the resource plan immediately takes effect by default. Specify the time in the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the order. Valid values:</p>
     * <br>
     * <p>*   BUY: You place the order to purchase an instance.</p>
     * <p>*   UPGRADE: You place the order to upgrade an instance.</p>
     * <p>*   RENEW: You place the order to renew an instance.</p>
     * <br>
     * <p>Default value: BUY.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the resource plan. The value must be the same as the value of the **ProductCode** parameter that is returned when you call the **DescribeResourcePackageProduct** operation.</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The unit of validity period of the resource plan. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The code of service. You can query the service code by calling the **QueryProductList** operation or viewing **Codes of Alibaba Cloud Services**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The specifications of the resource plan.</p>
     */
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
