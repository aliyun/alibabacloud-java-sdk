// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyApplyV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>72e961f8-930b-43c1-a4ca-18a6f28349c6distributionModifyCacheInfo</p>
     */
    @NameInMap("cache_key")
    public String cacheKey;

    /**
     * <strong>example:</strong>
     * <p>17816963077</p>
     */
    @NameInMap("contact_phone")
    public String contactPhone;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>fa2fb23a859a4e78b5ddb87a6a23094b_0</p>
     */
    @NameInMap("item_id")
    public String itemId;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467138</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467137</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>1019195786853020</p>
     */
    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    @NameInMap("passenger_segment_relations")
    public java.util.List<FlightModifyApplyV2RequestPassengerSegmentRelations> passengerSegmentRelations;

    @NameInMap("reason")
    public String reason;

    /**
     * <p>sessionId</p>
     * 
     * <strong>example:</strong>
     * <p>a2ffebfe733742aab5c491d960ba3d59</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightModifyApplyV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyApplyV2Request self = new FlightModifyApplyV2Request();
        return TeaModel.build(map, self);
    }

    public FlightModifyApplyV2Request setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
        return this;
    }
    public String getCacheKey() {
        return this.cacheKey;
    }

    public FlightModifyApplyV2Request setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public FlightModifyApplyV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyApplyV2Request setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public FlightModifyApplyV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyApplyV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyApplyV2Request setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public FlightModifyApplyV2Request setPassengerSegmentRelations(java.util.List<FlightModifyApplyV2RequestPassengerSegmentRelations> passengerSegmentRelations) {
        this.passengerSegmentRelations = passengerSegmentRelations;
        return this;
    }
    public java.util.List<FlightModifyApplyV2RequestPassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    public FlightModifyApplyV2Request setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public FlightModifyApplyV2Request setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightModifyApplyV2Request setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

    public static class FlightModifyApplyV2RequestPassengerSegmentRelations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3243028</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static FlightModifyApplyV2RequestPassengerSegmentRelations build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyApplyV2RequestPassengerSegmentRelations self = new FlightModifyApplyV2RequestPassengerSegmentRelations();
            return TeaModel.build(map, self);
        }

        public FlightModifyApplyV2RequestPassengerSegmentRelations setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightModifyApplyV2RequestPassengerSegmentRelations setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

}
