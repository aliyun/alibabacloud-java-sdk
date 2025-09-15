// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundApplyShrinkRequest extends TeaModel {
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
    public String refundSegmentListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public String selectedPassengersShrink;

    public static IntlFlightRefundApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundApplyShrinkRequest self = new IntlFlightRefundApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundApplyShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightRefundApplyShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightRefundApplyShrinkRequest setOutRefundApplyId(String outRefundApplyId) {
        this.outRefundApplyId = outRefundApplyId;
        return this;
    }
    public String getOutRefundApplyId() {
        return this.outRefundApplyId;
    }

    public IntlFlightRefundApplyShrinkRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightRefundApplyShrinkRequest setRefundReasonCode(String refundReasonCode) {
        this.refundReasonCode = refundReasonCode;
        return this;
    }
    public String getRefundReasonCode() {
        return this.refundReasonCode;
    }

    public IntlFlightRefundApplyShrinkRequest setRefundSegmentListShrink(String refundSegmentListShrink) {
        this.refundSegmentListShrink = refundSegmentListShrink;
        return this;
    }
    public String getRefundSegmentListShrink() {
        return this.refundSegmentListShrink;
    }

    public IntlFlightRefundApplyShrinkRequest setSelectedPassengersShrink(String selectedPassengersShrink) {
        this.selectedPassengersShrink = selectedPassengersShrink;
        return this;
    }
    public String getSelectedPassengersShrink() {
        return this.selectedPassengersShrink;
    }

}
