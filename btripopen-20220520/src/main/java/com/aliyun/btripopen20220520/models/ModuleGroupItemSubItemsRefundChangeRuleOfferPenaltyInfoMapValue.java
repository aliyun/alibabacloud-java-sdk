// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue extends TeaModel {
    @NameInMap("struct")
    public Boolean struct;

    @NameInMap("cancel_fee_ind")
    public Boolean cancelFeeInd;

    @NameInMap("change_fee_ind")
    public Boolean changeFeeInd;

    @NameInMap("upgrade_fee_ind")
    public Boolean upgradeFeeInd;

    @NameInMap("reissue_ind")
    public Boolean reissueInd;

    @NameInMap("penalty_type_code")
    public Integer penaltyTypeCode;

    @NameInMap("penalty_apply_range_code")
    public Integer penaltyApplyRangeCode;

    @NameInMap("penalty_charge_type_code")
    public Integer penaltyChargeTypeCode;

    @NameInMap("fee")
    public Double fee;

    @NameInMap("currency")
    public String currency;

    @NameInMap("penalty_percent")
    public Double penaltyPercent;

    @NameInMap("start_time")
    public Integer startTime;

    @NameInMap("end_time")
    public Integer endTime;

    @NameInMap("time_unit_code")
    public Integer timeUnitCode;

    public static ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue self = new ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setStruct(Boolean struct) {
        this.struct = struct;
        return this;
    }
    public Boolean getStruct() {
        return this.struct;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setCancelFeeInd(Boolean cancelFeeInd) {
        this.cancelFeeInd = cancelFeeInd;
        return this;
    }
    public Boolean getCancelFeeInd() {
        return this.cancelFeeInd;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setChangeFeeInd(Boolean changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
        return this;
    }
    public Boolean getChangeFeeInd() {
        return this.changeFeeInd;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setUpgradeFeeInd(Boolean upgradeFeeInd) {
        this.upgradeFeeInd = upgradeFeeInd;
        return this;
    }
    public Boolean getUpgradeFeeInd() {
        return this.upgradeFeeInd;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setReissueInd(Boolean reissueInd) {
        this.reissueInd = reissueInd;
        return this;
    }
    public Boolean getReissueInd() {
        return this.reissueInd;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyTypeCode(Integer penaltyTypeCode) {
        this.penaltyTypeCode = penaltyTypeCode;
        return this;
    }
    public Integer getPenaltyTypeCode() {
        return this.penaltyTypeCode;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyApplyRangeCode(Integer penaltyApplyRangeCode) {
        this.penaltyApplyRangeCode = penaltyApplyRangeCode;
        return this;
    }
    public Integer getPenaltyApplyRangeCode() {
        return this.penaltyApplyRangeCode;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyChargeTypeCode(Integer penaltyChargeTypeCode) {
        this.penaltyChargeTypeCode = penaltyChargeTypeCode;
        return this;
    }
    public Integer getPenaltyChargeTypeCode() {
        return this.penaltyChargeTypeCode;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setFee(Double fee) {
        this.fee = fee;
        return this;
    }
    public Double getFee() {
        return this.fee;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyPercent(Double penaltyPercent) {
        this.penaltyPercent = penaltyPercent;
        return this;
    }
    public Double getPenaltyPercent() {
        return this.penaltyPercent;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setTimeUnitCode(Integer timeUnitCode) {
        this.timeUnitCode = timeUnitCode;
        return this;
    }
    public Integer getTimeUnitCode() {
        return this.timeUnitCode;
    }

}
