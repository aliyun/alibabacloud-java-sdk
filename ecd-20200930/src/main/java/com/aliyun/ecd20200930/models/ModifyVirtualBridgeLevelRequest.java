// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyVirtualBridgeLevelRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect and is optional only when the billing method is <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The virtual bridge ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-sfjoasjfosdfj**</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The virtual bridge specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vb.pro</p>
     */
    @NameInMap("BridgeLevel")
    public String bridgeLevel;

    /**
     * <p>The payment callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://wya.wuying.aliyun.com/mobileClaw">https://wya.wuying.aliyun.com/mobileClaw</a></p>
     */
    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The renewal duration. Valid values of this parameter are determined by the value of the <code>PeriodUnit</code> parameter.</p>
     * <ul>
     * <li>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, and 6.</li>
     * <li>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values are 1, 2, and 3.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration for the prepaid cloud disk. This parameter takes effect and is required only when the <code>CdsChargeType</code> parameter is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID. You can call the pricing query operation to obtain the list of matched promotion IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>23141</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyVirtualBridgeLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBridgeLevelRequest self = new ModifyVirtualBridgeLevelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBridgeLevelRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyVirtualBridgeLevelRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyVirtualBridgeLevelRequest setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public ModifyVirtualBridgeLevelRequest setBridgeLevel(String bridgeLevel) {
        this.bridgeLevel = bridgeLevel;
        return this;
    }
    public String getBridgeLevel() {
        return this.bridgeLevel;
    }

    public ModifyVirtualBridgeLevelRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public ModifyVirtualBridgeLevelRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyVirtualBridgeLevelRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyVirtualBridgeLevelRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ModifyVirtualBridgeLevelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
