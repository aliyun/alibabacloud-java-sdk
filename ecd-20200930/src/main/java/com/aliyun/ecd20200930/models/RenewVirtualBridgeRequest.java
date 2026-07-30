// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewVirtualBridgeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>The virtual bridge ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-shfisahfihs***</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The payment callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://edu.wuying.aliyun.com/edu/school-manage">https://edu.wuying.aliyun.com/edu/school-manage</a></p>
     */
    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The renewal duration. The valid values of this parameter are determined by the value of the <code>PeriodUnit</code> parameter.</p>
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
     * <p>The unit of the renewal duration, which is the unit of the <code>Period</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003836003****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RenewVirtualBridgeRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewVirtualBridgeRequest self = new RenewVirtualBridgeRequest();
        return TeaModel.build(map, self);
    }

    public RenewVirtualBridgeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewVirtualBridgeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewVirtualBridgeRequest setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public RenewVirtualBridgeRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public RenewVirtualBridgeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewVirtualBridgeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewVirtualBridgeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewVirtualBridgeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
