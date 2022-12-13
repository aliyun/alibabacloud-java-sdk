// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopChargeTypeRequest extends TeaModel {
    // Specifies whether to enable automatic payment when you change a pay-as-you-go cloud desktop to a subscription cloud desktop. Valid values:
    // 
    // *   true: enables automatic payment. Make sure that you have sufficient balance in your account. Otherwise, abnormal orders are generated.
    // *   false: generates an order. However, no payment is completed. You can log on to the EDS console and complete the payment based on the order ID on the **Orders** page.
    // 
    // Default value: true.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The billing method that you want to change for the cloud desktop. You can change only a pay-as-you-go cloud desktop to a subscription cloud desktop. Valid value: PrePaid.
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The subscription duration when you change a pay-as-you-go cloud desktop to a subscription cloud desktop. The unit is specified by the PeriodUnit parameter. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
    // 
    // *   If the PeriodUnit parameter is set to Week, the valid value of the Period parameter is 1.
    // *   If the PeriodUnit parameter is set to Month, the valid values of the Period parameter are 1, 2, 3, and 6.
    // *   If the PeriodUnit parameter is set to Year, the valid values of the Period parameter are 1, 2, 3, 4, and 5.
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription duration when you change a pay-as-you-go cloud desktop to a subscription cloud desktop. Valid values:
    // 
    // *   Week
    // *   Month
    // *   Year
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PromotionId")
    public String promotionId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDesktopChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopChargeTypeRequest self = new ModifyDesktopChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDesktopChargeTypeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ModifyDesktopChargeTypeRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopChargeTypeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyDesktopChargeTypeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyDesktopChargeTypeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ModifyDesktopChargeTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
