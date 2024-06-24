// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyV2Request extends TeaModel {
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
    public java.util.List<FlightRefundApplyV2RequestPassengerSegmentRelations> passengerSegmentRelations;

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
    public java.util.List<String> ticketNos;

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

    public static FlightRefundApplyV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyV2Request self = new FlightRefundApplyV2Request();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightRefundApplyV2Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightRefundApplyV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightRefundApplyV2Request setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public FlightRefundApplyV2Request setPassengerSegmentRelations(java.util.List<FlightRefundApplyV2RequestPassengerSegmentRelations> passengerSegmentRelations) {
        this.passengerSegmentRelations = passengerSegmentRelations;
        return this;
    }
    public java.util.List<FlightRefundApplyV2RequestPassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    public FlightRefundApplyV2Request setPreCalType(Integer preCalType) {
        this.preCalType = preCalType;
        return this;
    }
    public Integer getPreCalType() {
        return this.preCalType;
    }

    public FlightRefundApplyV2Request setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public FlightRefundApplyV2Request setRefundReasonType(Integer refundReasonType) {
        this.refundReasonType = refundReasonType;
        return this;
    }
    public Integer getRefundReasonType() {
        return this.refundReasonType;
    }

    public FlightRefundApplyV2Request setTicketNos(java.util.List<String> ticketNos) {
        this.ticketNos = ticketNos;
        return this;
    }
    public java.util.List<String> getTicketNos() {
        return this.ticketNos;
    }

    public FlightRefundApplyV2Request setTotalRefundPrice(Long totalRefundPrice) {
        this.totalRefundPrice = totalRefundPrice;
        return this;
    }
    public Long getTotalRefundPrice() {
        return this.totalRefundPrice;
    }

    public FlightRefundApplyV2Request setUploadPictUrls(String uploadPictUrls) {
        this.uploadPictUrls = uploadPictUrls;
        return this;
    }
    public String getUploadPictUrls() {
        return this.uploadPictUrls;
    }

    public FlightRefundApplyV2Request setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

    public static class FlightRefundApplyV2RequestPassengerSegmentRelations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1075004</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static FlightRefundApplyV2RequestPassengerSegmentRelations build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundApplyV2RequestPassengerSegmentRelations self = new FlightRefundApplyV2RequestPassengerSegmentRelations();
            return TeaModel.build(map, self);
        }

        public FlightRefundApplyV2RequestPassengerSegmentRelations setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightRefundApplyV2RequestPassengerSegmentRelations setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

}
