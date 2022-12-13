// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopsRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. Make sure that you have sufficient balance in your account. Otherwise, abnormal orders are generated.
    // *   false: generates the order with no payment made. You can log on to the EDS console and complete the payment based on the order number.
    // 
    // Default value: true.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The IDs of cloud desktops.
    // 
    // Only subscription cloud desktops can be renewed by calling this operation.
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The renewal duration. The valid values of this parameter are determined by the PeriodUnit value.
    // 
    // *   If PeriodUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, and 6.
    // *   If PeriodUnit is set to Year, the valid values of the Period parameter are 1, 2, 3, 4, and 5.
    // 
    // Default value: 1.
    @NameInMap("Period")
    public Integer period;

    // The unit of the renewal duration specified by the Period parameter. Valid values:
    // 
    // *   Month
    // *   Year
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the sales promotion.
    @NameInMap("PromotionId")
    public String promotionId;

    // The region ID of the cloud desktop.
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
