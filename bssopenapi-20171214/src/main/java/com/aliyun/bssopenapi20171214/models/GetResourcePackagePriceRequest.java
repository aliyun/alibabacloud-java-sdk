// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceRequest extends TeaModel {
    /**
     * <p>The validity period of the resource plan. The value must be the same as the duration of the resource plan specified in the specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The time when the resource plan takes effect. If you do not specify this parameter, the resource plan immediately takes effect by default. 
     * When the <strong>OrderType</strong> is <strong>BUY</strong>, resource packs with the <strong>EffectiveDate longer than the current time of 6 months</strong> are not supported. 
     * If the <strong>OrderType</strong> is <strong>UPGRADE</strong>, the <strong>EffectiveDate</strong> <strong>must be less than or equal to</strong> the actual expiration time of the upgraded instance.
     * Specify the time in the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-10T12:00:00Z</p>
     */
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    /**
     * <p>The ID of the instance. <strong>This parameter is required when the order type is renewal or upgrade.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>OSSBAG-cn-0xl0002</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the order. Valid values:</p>
     * <ul>
     * <li>BUY: You place the order to purchase an instance.</li>
     * <li>UPGRADE: You place the order to upgrade an instance.</li>
     * <li>RENEW: You place the order to renew an instance.</li>
     * </ul>
     * <p>Default value: BUY.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the resource plan. The value must be the same as the value of the <strong>ProductCode</strong> parameter that is returned when you call the <strong>DescribeResourcePackageProduct</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FPT_ossbag_periodMonthlyAcc_NetworkOut_finance_common</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The unit of validity period of the resource plan. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The code of service. You can query the service code by calling the <strong>QueryProductList</strong> operation or viewing <strong>Codes of Alibaba Cloud Services</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ossbag</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The specifications of the resource plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
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
