// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupChargeTypeShrinkRequest extends TeaModel {
    /**
     * <p>The list of delivery group IDs to be modified, in JSON array format. <strong>You must and can only specify one item at a time</strong>. The resource must belong to the current account, the specified product, and the business region.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppInstanceGroupIds")
    public String appInstanceGroupIdsShrink;

    /**
     * <p>Specifies whether to allow automatic payment for this conversion order. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: allows automatic payment for the conversion order.</li>
     * <li>false: does not allow automatic payment. If an unpaid order is generated, you must complete the payment separately.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for this order. Explicitly specify this parameter for subscription orders to determine whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: disables auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The business region ID of the target delivery group. It must be the same as the actual region to which the resource belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The target billing method after conversion. It must be different from the current billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The numeric part of the purchase duration, used together with PeriodUnit. Specify this parameter along with PeriodUnit when converting to subscription and a purchase duration is required. For example, 1 and Month indicate a purchase duration of one month. The specific available purchase durations are determined by the sales rules of the target resource.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the purchase duration, used together with Period. This parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li>Hour: hour.</li>
     * <li>Day: day.</li>
     * <li>Week: week.</li>
     * <li>Month: month.</li>
     * <li>Year: year.</li>
     * </ul>
     * <p>These units do not mean that every product supports any combination. When converting to subscription, select a period supported by the target resource. For example, for a resource that supports monthly purchase, you can set Period=1 and PeriodUnit=Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The product type. Set this parameter to one of the following values when you call the operation:</p>
     * <ul>
     * <li>CloudApp: Wuying Cloud Application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the promotion used for this conversion order. It takes effect only when an order is created and the promotion is applicable. If omitted, no specific coupon is specified. The availability of the promotion is subject to the order result.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static ModifyAppInstanceGroupChargeTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupChargeTypeShrinkRequest self = new ModifyAppInstanceGroupChargeTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setAppInstanceGroupIdsShrink(String appInstanceGroupIdsShrink) {
        this.appInstanceGroupIdsShrink = appInstanceGroupIdsShrink;
        return this;
    }
    public String getAppInstanceGroupIdsShrink() {
        return this.appInstanceGroupIdsShrink;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyAppInstanceGroupChargeTypeShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
