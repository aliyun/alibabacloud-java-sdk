// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceRequest extends TeaModel {
    /**
     * <p>The validity period of the resource plan. The value must match the available validity period of the specification size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The effective period of the resource plan. If you do not specify this parameter, the default is immediate.
     * When the order type is <strong>BUY</strong>, you cannot query the price of a resource plan whose effective period is more than six months later than the current time.
     * When the order type is <strong>UPGRADE</strong>, the effective period must be earlier than or equal to the actual expiration time of the resource plan to be upgraded.
     * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-10T12:00:00Z</p>
     */
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    /**
     * <p>The instance ID. <strong>This parameter is required when the order type is renewal or upgrade.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>OSSBAG-cn-0xl0002</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>BUY: new purchase.</li>
     * <li>UPGRADE: upgrade.</li>
     * <li>RENEW: renewal.</li>
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
     * <p>The resource plan type. The value must be the same as the Code value of <strong>ResourcePackage</strong> returned by the operation that describes resource plans.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FPT_ossbag_periodMonthlyAcc_NetworkOut_finance_common</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The unit of the validity period for the resource plan. Valid values:</p>
     * <ul>
     * <li>Month: months.</li>
     * <li>Year: years.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The product code. You can obtain the product code by calling the <strong>QueryProductList</strong> operation or referring to the <strong>Alibaba Cloud product code quick reference guide</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ossbag</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The specification size of the resource plan.</p>
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
