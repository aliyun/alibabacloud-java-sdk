// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopChargeTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment if you specify subscription as the new billing method for the cloud desktop.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The new billing method that you want to apply.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PostPaid: changes the billing method from subscription to pay-as-you-go.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PrePaid: changes the billing method from pay-as-you-go to subscription.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The IDs of the cloud computers. You can specify 1 to 20 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The subscription duration of the cloud computers if you set the ChargeType parameter to PrePaid. The unit is specified by the `PeriodUnit` parameter. This parameter is valid only when the `ChargeType` parameter is set to `PrePaid`. In this case, you must specify this parameter.</p>
     * <br>
     * <p>*   If the `PeriodUnit` parameter is set to `Week`, set the Period parameter to 1.</p>
     * <p>*   If the `PeriodUnit` parameter is set to `Month`, the valid values of the Period parameter are 1, 2, 3, and 6.</p>
     * <p>*   If the `PeriodUnit` parameter is set to `Year`, the valid values of the Period parameter are 1, 2, 3, 4, and 5.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration if you specify subscription as the new billing method for the cloud desktop.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotional activity.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>>  This parameter is in invitational preview and not publicly available.</p>
     */
    @NameInMap("UseDuration")
    public Integer useDuration;

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

    public ModifyDesktopChargeTypeRequest setUseDuration(Integer useDuration) {
        this.useDuration = useDuration;
        return this;
    }
    public Integer getUseDuration() {
        return this.useDuration;
    }

}
