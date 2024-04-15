// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true (default): enables the auto-payment feature.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    Make sure that your account has sufficient balance. Otherwise, no order is generated.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    To make the payment, log on to the WUYING Workspace console, go to the Orders page, and find the order based on the order ID.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the premium bandwidth plan.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
     * <br>
     * <p>*   Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.</p>
     * <p>*   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.</p>
     * <p>*   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The charge type of the premium bandwidth plan.</p>
     * <br>
     * <p>*   Valid value when the `PayType` parameter is set to `PrePaid`:</p>
     * <br>
     * <p>    *   PayByBandwidth: charges by fixed bandwidth.</p>
     * <br>
     * <p>*   Valid values when the `PayType` parameter is set to `PostPaid`:</p>
     * <br>
     * <p>    *   PayByTraffic: charges by data transfer.</p>
     * <p>    *   PayByBandwidth: charges by fixed bandwidth.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The office network ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The billing method of the premium bandwidth plan.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the `PayType` parameter is set to `PrePaid`. The valid values of this parameter vary based on the `PeriodUnit` value.</p>
     * <br>
     * <p>*   Valid value when the `PeriodUnit` parameter is set to `Week`: 1</p>
     * <p>*   Valid values when the `PeriodUnit` parameter is set to `Month`: 1, 2, 3, and 6</p>
     * <p>*   Valid values when the `PeriodUnit` parameter is set to `Year`: 1, 2, and 3</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration of the premium bandwidth plan. This parameter takes effect and is required only when the `PayType` parameter is set to `PrePaid`.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Year</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Week</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the sales promotion.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
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
