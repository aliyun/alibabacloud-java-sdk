// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue extends TeaModel {
    /**
     * <p>Indicates whether the rule is applicable.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("struct")
    public Boolean struct;

    /**
     * <p>Indicates whether refund is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cancel_fee_ind")
    public Boolean cancelFeeInd;

    /**
     * <p>Indicates whether date change is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("change_fee_ind")
    public Boolean changeFeeInd;

    /**
     * <p>Indicates whether upgrade is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("upgrade_fee_ind")
    public Boolean upgradeFeeInd;

    /**
     * <p>Indicates whether reissue is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reissue_ind")
    public Boolean reissueInd;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li>0: Refund fee.</li>
     * <li>1: Change fee.</li>
     * <li>2: No-show penalty.</li>
     * <li>3: Other.</li>
     * <li>4: Upgrade fee.</li>
     * <li>5: Endorsement.</li>
     * <li>6: Deduction for used segments.</li>
     * <li>100: Tax refund.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("penalty_type_code")
    public Integer penaltyTypeCode;

    /**
     * <p>The applicability scope of the rule. Valid values:</p>
     * <ul>
     * <li>1: All unused.</li>
     * <li>2: Partially unused.</li>
     * <li>3: Outbound.</li>
     * <li>4: Inbound.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("penalty_apply_range_code")
    public Integer penaltyApplyRangeCode;

    /**
     * <p>The charge method of the rule. Valid values:</p>
     * <ul>
     * <li>0: Charged per whole trip.</li>
     * <li>1: Charged per direction.</li>
     * <li>2: Charged per segment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("penalty_charge_type_code")
    public Integer penaltyChargeTypeCode;

    /**
     * <p>The fee amount.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("fee")
    public Double fee;

    /**
     * <p>The currency of the fee.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    public String currency;

    /**
     * <p>The fee percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("penalty_percent")
    public Double penaltyPercent;

    /**
     * <p>The start time of the rule time range.</p>
     * 
     * <strong>example:</strong>
     * <p>-720</p>
     */
    @NameInMap("start_time")
    public Integer startTime;

    /**
     * <p>The end time of the rule time range.</p>
     * 
     * <strong>example:</strong>
     * <p>-168</p>
     */
    @NameInMap("end_time")
    public Integer endTime;

    /**
     * <p>The time unit. Valid values:</p>
     * <ul>
     * <li>0: Hours.</li>
     * <li>1: Days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("time_unit_code")
    public Integer timeUnitCode;

    /**
     * <p>The rule title.</p>
     * 
     * <strong>example:</strong>
     * <p>退票费用</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>起飞时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-01 01:00:00</p>
     */
    @NameInMap("dep_time")
    public String depTime;

    /**
     * <p>航段序号，</p>
     * <ul>
     * <li><p>OUTBOUND_FIRST(&quot;去程第一段&quot;)</p>
     * </li>
     * <li><p>OUTBOUND_SECOND(&quot;去程第二段&quot;)</p>
     * </li>
     * <li><p>INBOUND_FIRST(&quot;回程第一段&quot;)</p>
     * </li>
     * <li><p>INBOUND_SECOND(&quot;回程第二段&quot;)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OUTBOUND_FIRST</p>
     */
    @NameInMap("segment_number")
    public String segmentNumber;

    /**
     * <p>各类非结构化补充说明</p>
     */
    @NameInMap("desc_infos")
    public java.util.Map<String, String> descInfos;

    public static ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue self = new ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setStruct(Boolean struct) {
        this.struct = struct;
        return this;
    }
    public Boolean getStruct() {
        return this.struct;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setCancelFeeInd(Boolean cancelFeeInd) {
        this.cancelFeeInd = cancelFeeInd;
        return this;
    }
    public Boolean getCancelFeeInd() {
        return this.cancelFeeInd;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setChangeFeeInd(Boolean changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
        return this;
    }
    public Boolean getChangeFeeInd() {
        return this.changeFeeInd;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setUpgradeFeeInd(Boolean upgradeFeeInd) {
        this.upgradeFeeInd = upgradeFeeInd;
        return this;
    }
    public Boolean getUpgradeFeeInd() {
        return this.upgradeFeeInd;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setReissueInd(Boolean reissueInd) {
        this.reissueInd = reissueInd;
        return this;
    }
    public Boolean getReissueInd() {
        return this.reissueInd;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyTypeCode(Integer penaltyTypeCode) {
        this.penaltyTypeCode = penaltyTypeCode;
        return this;
    }
    public Integer getPenaltyTypeCode() {
        return this.penaltyTypeCode;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyApplyRangeCode(Integer penaltyApplyRangeCode) {
        this.penaltyApplyRangeCode = penaltyApplyRangeCode;
        return this;
    }
    public Integer getPenaltyApplyRangeCode() {
        return this.penaltyApplyRangeCode;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyChargeTypeCode(Integer penaltyChargeTypeCode) {
        this.penaltyChargeTypeCode = penaltyChargeTypeCode;
        return this;
    }
    public Integer getPenaltyChargeTypeCode() {
        return this.penaltyChargeTypeCode;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setFee(Double fee) {
        this.fee = fee;
        return this;
    }
    public Double getFee() {
        return this.fee;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setPenaltyPercent(Double penaltyPercent) {
        this.penaltyPercent = penaltyPercent;
        return this;
    }
    public Double getPenaltyPercent() {
        return this.penaltyPercent;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setTimeUnitCode(Integer timeUnitCode) {
        this.timeUnitCode = timeUnitCode;
        return this;
    }
    public Integer getTimeUnitCode() {
        return this.timeUnitCode;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setDepTime(String depTime) {
        this.depTime = depTime;
        return this;
    }
    public String getDepTime() {
        return this.depTime;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setSegmentNumber(String segmentNumber) {
        this.segmentNumber = segmentNumber;
        return this;
    }
    public String getSegmentNumber() {
        return this.segmentNumber;
    }

    public ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue setDescInfos(java.util.Map<String, String> descInfos) {
        this.descInfos = descInfos;
        return this;
    }
    public java.util.Map<String, String> getDescInfos() {
        return this.descInfos;
    }

}
