// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   true: enables automatic payment. Make sure that you have sufficient balance in your account. Otherwise, abnormal orders are generated.</p>
     * <p>*   false: generates the order with no payment made. You can log on to the EDS console and complete the payment based on the order number.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The IDs of cloud desktops.</p>
     * <br>
     * <p>Only subscription cloud desktops can be renewed by calling this operation.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The renewal duration. The valid values of this parameter are determined by the PeriodUnit value.</p>
     * <br>
     * <p>*   If PeriodUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, and 6.</p>
     * <p>*   If PeriodUnit is set to Year, the valid values of the Period parameter are 1, 2, 3, 4, and 5.</p>
     * <br>
     * <p>Default value: 1.</p>
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
     * <p>The ID of the sales promotion.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID of the cloud desktop.</p>
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
