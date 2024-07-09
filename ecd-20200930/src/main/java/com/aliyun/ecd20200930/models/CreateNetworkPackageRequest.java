// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true (default): enables the auto-payment feature.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>Make sure that your account has sufficient balance. Otherwise, no order is generated.</p>
     * <!-- -->
     * </li>
     * <li><p>false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>To make the payment, log on to the Elastic Desktop Service console, go to the Orders page, and find the order based on the order ID.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the premium bandwidth plan.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
     * <ul>
     * <li>Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.</li>
     * <li>Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.</li>
     * <li>Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The charge type of the premium bandwidth plan.</p>
     * <ul>
     * <li><p>Valid value when the <code>PayType</code> parameter is set to <code>PrePaid</code>:</p>
     * <ul>
     * <li>PayByBandwidth: charges by fixed bandwidth.</li>
     * </ul>
     * </li>
     * <li><p>Valid values when the <code>PayType</code> parameter is set to <code>PostPaid</code>:</p>
     * <ul>
     * <li>PayByTraffic: charges by data transfer.</li>
     * <li>PayByBandwidth: charges by fixed bandwidth.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The billing method of the premium bandwidth plan.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go</li>
     * <li>PrePaid: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the <code>PayType</code> parameter is set to <code>PrePaid</code>. The valid values of this parameter vary based on the <code>PeriodUnit</code> value.</p>
     * <ul>
     * <li>Valid value when the <code>PeriodUnit</code> parameter is set to <code>Week</code>: 1</li>
     * <li>Valid values when the <code>PeriodUnit</code> parameter is set to <code>Month</code>: 1, 2, 3, and 6</li>
     * <li>Valid values when the <code>PeriodUnit</code> parameter is set to <code>Year</code>: 1, 2, and 3</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the <code>PayType</code> parameter is set to <code>PrePaid</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Month</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Year</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Week</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the sales promotion.</p>
     * 
     * <strong>example:</strong>
     * <p>23141</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

}
