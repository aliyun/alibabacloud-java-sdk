// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("struct")
    public Boolean struct;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cancel_fee_ind")
    public Boolean cancelFeeInd;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("change_fee_ind")
    public Boolean changeFeeInd;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("upgrade_fee_ind")
    public Boolean upgradeFeeInd;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reissue_ind")
    public Boolean reissueInd;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("penalty_type_code")
    public Integer penaltyTypeCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("penalty_apply_range_code")
    public Integer penaltyApplyRangeCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("penalty_charge_type_code")
    public Integer penaltyChargeTypeCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("fee")
    public Double fee;

    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("penalty_percent")
    public Double penaltyPercent;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("start_time")
    public Integer startTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("end_time")
    public Integer endTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("time_unit_code")
    public Integer timeUnitCode;

    @NameInMap("title")
    public String title;

    public static ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue self = new ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setStruct(Boolean struct) {
        this.struct = struct;
        return this;
    }
    public Boolean getStruct() {
        return this.struct;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setCancelFeeInd(Boolean cancelFeeInd) {
        this.cancelFeeInd = cancelFeeInd;
        return this;
    }
    public Boolean getCancelFeeInd() {
        return this.cancelFeeInd;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setChangeFeeInd(Boolean changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
        return this;
    }
    public Boolean getChangeFeeInd() {
        return this.changeFeeInd;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setUpgradeFeeInd(Boolean upgradeFeeInd) {
        this.upgradeFeeInd = upgradeFeeInd;
        return this;
    }
    public Boolean getUpgradeFeeInd() {
        return this.upgradeFeeInd;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setReissueInd(Boolean reissueInd) {
        this.reissueInd = reissueInd;
        return this;
    }
    public Boolean getReissueInd() {
        return this.reissueInd;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyTypeCode(Integer penaltyTypeCode) {
        this.penaltyTypeCode = penaltyTypeCode;
        return this;
    }
    public Integer getPenaltyTypeCode() {
        return this.penaltyTypeCode;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyApplyRangeCode(Integer penaltyApplyRangeCode) {
        this.penaltyApplyRangeCode = penaltyApplyRangeCode;
        return this;
    }
    public Integer getPenaltyApplyRangeCode() {
        return this.penaltyApplyRangeCode;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyChargeTypeCode(Integer penaltyChargeTypeCode) {
        this.penaltyChargeTypeCode = penaltyChargeTypeCode;
        return this;
    }
    public Integer getPenaltyChargeTypeCode() {
        return this.penaltyChargeTypeCode;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setFee(Double fee) {
        this.fee = fee;
        return this;
    }
    public Double getFee() {
        return this.fee;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyPercent(Double penaltyPercent) {
        this.penaltyPercent = penaltyPercent;
        return this;
    }
    public Double getPenaltyPercent() {
        return this.penaltyPercent;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setTimeUnitCode(Integer timeUnitCode) {
        this.timeUnitCode = timeUnitCode;
        return this;
    }
    public Integer getTimeUnitCode() {
        return this.timeUnitCode;
    }

    public ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
