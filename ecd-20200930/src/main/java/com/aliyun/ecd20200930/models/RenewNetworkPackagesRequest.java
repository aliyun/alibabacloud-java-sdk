// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesRequest extends TeaModel {
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
     * <p>The IDs of premium bandwidth plans. You can specify up to 100 IDs.</p>
     */
    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    /**
     * <p>The subscription duration if you specify subscription as the new billing method for the cloud desktop. The unit of the value is specified by the `PeriodUnit` parameter. This parameter takes effect only when the `ChargeType` parameter is set to `PrePaid`.</p>
     * <br>
     * <p>*   If the `PeriodUnit` parameter is set to `Week`, the valid value of the Period parameter is 1.</p>
     * <p>*   If the `PeriodUnit` parameter is set to `Month`, the valid values of the Period parameter are 1, 2, 3, and 6.</p>
     * <p>*   If the `PeriodUnit` parameter is set to `Year`, the valid values of the Period parameter are 1, 2, 3, 4, and 5.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration specified by the Period parameter. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RenewNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewNetworkPackagesRequest self = new RenewNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public RenewNetworkPackagesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public RenewNetworkPackagesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewNetworkPackagesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewNetworkPackagesRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
