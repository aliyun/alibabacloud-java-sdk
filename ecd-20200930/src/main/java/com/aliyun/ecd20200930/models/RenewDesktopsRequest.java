// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopsRequest extends TeaModel {
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
     * <p>*   false: disables the auto-payment feature. In this case, an order is generated, and no payment is automatically made.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    You can log on to the EDS console and complete the payment based on the order number.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The cloud desktop ID. Only subscription cloud desktops can be renewed.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The renewal duration. Valid values of this parameter are determined by the value of the `PeriodUnit` parameter.</p>
     * <br>
     * <p>*   Valid values if you set the `PeriodUnit` parameter to `Month`: 1, 2, 3, and 6</p>
     * <p>*   Valid values if you set the `PeriodUnit` parameter to `Year`: 1, 2, 3, 4, 5, and 6</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration that is specified by the Period parameter.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Month (default)</p>
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
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the sales promotion.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RenewDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopsRequest self = new RenewDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RenewDesktopsRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RenewDesktopsRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewDesktopsRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewDesktopsRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
