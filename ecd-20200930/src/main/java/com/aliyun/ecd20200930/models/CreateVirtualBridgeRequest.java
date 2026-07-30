// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateVirtualBridgeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bridge specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>vb.ultra</p>
     */
    @NameInMap("BridgeLevel")
    public String bridgeLevel;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-467671****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The payment callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://wya.wuying.aliyun.com/mobileClaw">https://wya.wuying.aliyun.com/mobileClaw</a></p>
     */
    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The duration for which you want to purchase the resource. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>4</li>
     * <li>5</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of duration for the subscription billable methods.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. This feature is not region-specific. Set this parameter to cn-shanghai.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateVirtualBridgeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBridgeRequest self = new CreateVirtualBridgeRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBridgeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateVirtualBridgeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateVirtualBridgeRequest setBridgeLevel(String bridgeLevel) {
        this.bridgeLevel = bridgeLevel;
        return this;
    }
    public String getBridgeLevel() {
        return this.bridgeLevel;
    }

    public CreateVirtualBridgeRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateVirtualBridgeRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public CreateVirtualBridgeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateVirtualBridgeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateVirtualBridgeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateVirtualBridgeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
