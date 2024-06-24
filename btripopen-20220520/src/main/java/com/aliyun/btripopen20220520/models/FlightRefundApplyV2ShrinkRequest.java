// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyV2ShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cheshiapi</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>1683901850297448082</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467137</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>1019195836916039</p>
     */
    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    @NameInMap("passenger_segment_relations")
    public String passengerSegmentRelationsShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("pre_cal_type")
    public Integer preCalType;

    @NameInMap("refund_reason")
    public String refundReason;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("refund_reason_type")
    public Integer refundReasonType;

    @NameInMap("ticket_nos")
    public String ticketNosShrink;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("total_refund_price")
    public Long totalRefundPrice;

    @NameInMap("upload_pict_urls")
    public String uploadPictUrls;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightRefundApplyV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyV2ShrinkRequest self = new FlightRefundApplyV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightRefundApplyV2ShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightRefundApplyV2ShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightRefundApplyV2ShrinkRequest setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public FlightRefundApplyV2ShrinkRequest setPassengerSegmentRelationsShrink(String passengerSegmentRelationsShrink) {
        this.passengerSegmentRelationsShrink = passengerSegmentRelationsShrink;
        return this;
    }
    public String getPassengerSegmentRelationsShrink() {
        return this.passengerSegmentRelationsShrink;
    }

    public FlightRefundApplyV2ShrinkRequest setPreCalType(Integer preCalType) {
        this.preCalType = preCalType;
        return this;
    }
    public Integer getPreCalType() {
        return this.preCalType;
    }

    public FlightRefundApplyV2ShrinkRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public FlightRefundApplyV2ShrinkRequest setRefundReasonType(Integer refundReasonType) {
        this.refundReasonType = refundReasonType;
        return this;
    }
    public Integer getRefundReasonType() {
        return this.refundReasonType;
    }

    public FlightRefundApplyV2ShrinkRequest setTicketNosShrink(String ticketNosShrink) {
        this.ticketNosShrink = ticketNosShrink;
        return this;
    }
    public String getTicketNosShrink() {
        return this.ticketNosShrink;
    }

    public FlightRefundApplyV2ShrinkRequest setTotalRefundPrice(Long totalRefundPrice) {
        this.totalRefundPrice = totalRefundPrice;
        return this;
    }
    public Long getTotalRefundPrice() {
        return this.totalRefundPrice;
    }

    public FlightRefundApplyV2ShrinkRequest setUploadPictUrls(String uploadPictUrls) {
        this.uploadPictUrls = uploadPictUrls;
        return this;
    }
    public String getUploadPictUrls() {
        return this.uploadPictUrls;
    }

    public FlightRefundApplyV2ShrinkRequest setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

}
