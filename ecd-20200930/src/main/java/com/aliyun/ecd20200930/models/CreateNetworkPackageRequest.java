// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment.</p>
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
     * <p>The bandwidth of the network package, in Mbps.</p>
     * <ul>
     * <li><p>For subscription network packages, the value range is 2 to 1,000.</p>
     * </li>
     * <li><p>For pay-as-you-go network packages that are billed by traffic, the value range is 2 to 200.</p>
     * </li>
     * <li><p>For pay-as-you-go network packages that are billed by bandwidth, the value range is 2 to 1,000.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The billing method for the network package.</p>
     * <ul>
     * <li><p>When <code>PayType</code> is set to <code>PrePaid</code>, the only valid value is:</p>
     * <ul>
     * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
     * </ul>
     * </li>
     * <li><p>When <code>PayType</code> is set to <code>PostPaid</code>, valid values are:</p>
     * <ul>
     * <li><p><code>PayByTraffic</code>: pay-by-traffic.</p>
     * </li>
     * <li><p><code>PayByBandwidth</code>: pay-by-bandwidth.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration of the network package. This parameter is required and applies only when <code>PayType</code> is set to <code>PrePaid</code>. The valid values for this parameter depend on the value of <code>PeriodUnit</code>.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Week</code>, the only valid value is 1.</p>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, and 6.</p>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values are 1, 2, and 3.</p>
     * </li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration for the network package. This parameter is required and applies only when <code>PayType</code> is set to <code>PrePaid</code>.</p>
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
     * <p>23141</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to get the list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static CreateNetworkPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPackageRequest self = new CreateNetworkPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNetworkPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateNetworkPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateNetworkPackageRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateNetworkPackageRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateNetworkPackageRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateNetworkPackageRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateNetworkPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateNetworkPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateNetworkPackageRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateNetworkPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkPackageRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

}
