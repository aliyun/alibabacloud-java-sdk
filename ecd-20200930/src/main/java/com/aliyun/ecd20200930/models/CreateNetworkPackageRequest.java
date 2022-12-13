// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageRequest extends TeaModel {
    // Specifies whether to enable automatic payment.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // Specifies whether to enable auto-renewal.
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // The maximum public bandwidth of the Internet access package. Unit: Mbit/s.\
    // Valid values for the pay-by-data-transfer type (PayByTraffic): 10 to 200 Valid values for the pay-by-bandwith type (PayByBandwidth): 10 to 1000
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // The billing method of the Internet access package. Valid values: PayByTraffic: pay-by-data-transfer PayByBandwidth: pay-by-bandwidth Default value: PayByTraffic.
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("PayType")
    public String payType;

    // The duration that you want to use the Internet access package of the pay-by-bandwidth type.
    @NameInMap("Period")
    public Integer period;

    // The unit of duration that you want to use for the Internet access package of the pay-by-bandwidth type.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the sales promotion.
    @NameInMap("PromotionId")
    public String promotionId;

    // The ID of the region.
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
