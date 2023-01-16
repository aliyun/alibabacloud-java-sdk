// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyShrinkRequest extends TeaModel {
    @NameInMap("corp_refund_price")
    public Long corpRefundPrice;

    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    @NameInMap("display_refund_money")
    public String displayRefundMoney;

    @NameInMap("extra")
    public String extraShrink;

    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    @NameInMap("item_unit_ids")
    public String itemUnitIds;

    @NameInMap("passenger_segment_info_list")
    public String passengerSegmentInfoListShrink;

    @NameInMap("personal_refund_price")
    public Long personalRefundPrice;

    @NameInMap("reason_detail")
    public String reasonDetail;

    @NameInMap("reason_type")
    public Integer reasonType;

    @NameInMap("refund_voucher_info")
    public String refundVoucherInfoShrink;

    @NameInMap("session_id")
    public String sessionId;

    @NameInMap("total_refund_price")
    public Long totalRefundPrice;

    public static FlightRefundApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyShrinkRequest self = new FlightRefundApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyShrinkRequest setCorpRefundPrice(Long corpRefundPrice) {
        this.corpRefundPrice = corpRefundPrice;
        return this;
    }
    public Long getCorpRefundPrice() {
        return this.corpRefundPrice;
    }

    public FlightRefundApplyShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightRefundApplyShrinkRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    public FlightRefundApplyShrinkRequest setDisplayRefundMoney(String displayRefundMoney) {
        this.displayRefundMoney = displayRefundMoney;
        return this;
    }
    public String getDisplayRefundMoney() {
        return this.displayRefundMoney;
    }

    public FlightRefundApplyShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public FlightRefundApplyShrinkRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public FlightRefundApplyShrinkRequest setItemUnitIds(String itemUnitIds) {
        this.itemUnitIds = itemUnitIds;
        return this;
    }
    public String getItemUnitIds() {
        return this.itemUnitIds;
    }

    public FlightRefundApplyShrinkRequest setPassengerSegmentInfoListShrink(String passengerSegmentInfoListShrink) {
        this.passengerSegmentInfoListShrink = passengerSegmentInfoListShrink;
        return this;
    }
    public String getPassengerSegmentInfoListShrink() {
        return this.passengerSegmentInfoListShrink;
    }

    public FlightRefundApplyShrinkRequest setPersonalRefundPrice(Long personalRefundPrice) {
        this.personalRefundPrice = personalRefundPrice;
        return this;
    }
    public Long getPersonalRefundPrice() {
        return this.personalRefundPrice;
    }

    public FlightRefundApplyShrinkRequest setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
        return this;
    }
    public String getReasonDetail() {
        return this.reasonDetail;
    }

    public FlightRefundApplyShrinkRequest setReasonType(Integer reasonType) {
        this.reasonType = reasonType;
        return this;
    }
    public Integer getReasonType() {
        return this.reasonType;
    }

    public FlightRefundApplyShrinkRequest setRefundVoucherInfoShrink(String refundVoucherInfoShrink) {
        this.refundVoucherInfoShrink = refundVoucherInfoShrink;
        return this;
    }
    public String getRefundVoucherInfoShrink() {
        return this.refundVoucherInfoShrink;
    }

    public FlightRefundApplyShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightRefundApplyShrinkRequest setTotalRefundPrice(Long totalRefundPrice) {
        this.totalRefundPrice = totalRefundPrice;
        return this;
    }
    public Long getTotalRefundPrice() {
        return this.totalRefundPrice;
    }

}
