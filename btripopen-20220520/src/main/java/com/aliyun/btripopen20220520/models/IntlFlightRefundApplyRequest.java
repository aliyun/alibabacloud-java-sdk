// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundApplyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002145190081005400</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>3750656668336001024</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>202503251022170001</p>
     */
    @NameInMap("out_refund_apply_id")
    public String outRefundApplyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("refund_reason_code")
    public String refundReasonCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_segment_list")
    public java.util.List<IntlFlightRefundApplyRequestRefundSegmentList> refundSegmentList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public java.util.List<IntlFlightRefundApplyRequestSelectedPassengers> selectedPassengers;

    public static IntlFlightRefundApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundApplyRequest self = new IntlFlightRefundApplyRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundApplyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightRefundApplyRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightRefundApplyRequest setOutRefundApplyId(String outRefundApplyId) {
        this.outRefundApplyId = outRefundApplyId;
        return this;
    }
    public String getOutRefundApplyId() {
        return this.outRefundApplyId;
    }

    public IntlFlightRefundApplyRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightRefundApplyRequest setRefundReasonCode(String refundReasonCode) {
        this.refundReasonCode = refundReasonCode;
        return this;
    }
    public String getRefundReasonCode() {
        return this.refundReasonCode;
    }

    public IntlFlightRefundApplyRequest setRefundSegmentList(java.util.List<IntlFlightRefundApplyRequestRefundSegmentList> refundSegmentList) {
        this.refundSegmentList = refundSegmentList;
        return this;
    }
    public java.util.List<IntlFlightRefundApplyRequestRefundSegmentList> getRefundSegmentList() {
        return this.refundSegmentList;
    }

    public IntlFlightRefundApplyRequest setSelectedPassengers(java.util.List<IntlFlightRefundApplyRequestSelectedPassengers> selectedPassengers) {
        this.selectedPassengers = selectedPassengers;
        return this;
    }
    public java.util.List<IntlFlightRefundApplyRequestSelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    public static class IntlFlightRefundApplyRequestRefundSegmentList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CZ5009PKXHKG0616</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightRefundApplyRequestRefundSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundApplyRequestRefundSegmentList self = new IntlFlightRefundApplyRequestRefundSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundApplyRequestRefundSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightRefundApplyRequestSelectedPassengers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        public static IntlFlightRefundApplyRequestSelectedPassengers build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundApplyRequestSelectedPassengers self = new IntlFlightRefundApplyRequestSelectedPassengers();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundApplyRequestSelectedPassengers setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightRefundApplyRequestSelectedPassengers setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

}
