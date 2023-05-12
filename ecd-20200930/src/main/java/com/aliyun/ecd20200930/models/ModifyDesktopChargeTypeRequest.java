// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopChargeTypeRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud desktops. You can specify 1 to 20 IDs.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the sales promotion.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>Specifies whether to enable automatic payment if you specify subscription as the new billing method for the cloud desktop.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The IDs of the desktop groups. If multiple cloud desktops are created at a time, multiple cloud desktop IDs are returned.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The unit of the subscription duration if you specify subscription as the new billing method for the cloud desktop.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The subscription duration if you specify subscription as the new billing method for the cloud desktop. The unit of the value is specified by the `PeriodUnit` parameter. This parameter takes effect only when the `ChargeType` parameter is set to `PrePaid`.</p>
     * <br>
     * <p>*   If the `PeriodUnit` parameter is set to `Week`, the valid value of the Period parameter is 1.</p>
     * <p>*   If the `PeriodUnit` parameter is set to `Month`, the valid values of the Period parameter are 1, 2, 3, and 6.</p>
     * <p>*   If the `PeriodUnit` parameter is set to `Year`, the valid values of the Period parameter are 1, 2, 3, 4, and 5.</p>
     */
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
