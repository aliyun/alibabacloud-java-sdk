// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("change_fee_ind")
    public Boolean changeFeeInd;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("upgrade_fee_ind")
    public Boolean upgradeFeeInd;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("reissue_ind")
    public Boolean reissueInd;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("penalty_type_code")
    public Integer penaltyTypeCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("penalty_apply_range_code")
    public Integer penaltyApplyRangeCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("penalty_charge_type_code")
    public Integer penaltyChargeTypeCode;

    /**
     * <strong>example:</strong>
     * <p>300</p>
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
     * <p>30</p>
     */
    @NameInMap("penalty_percent")
    public Double penaltyPercent;

    /**
     * <strong>example:</strong>
     * <p>48</p>
     */
    @NameInMap("start_time")
    public Integer startTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("end_time")
    public Integer endTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
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
