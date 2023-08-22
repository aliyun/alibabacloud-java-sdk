// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOtaSearchV2ShrinkRequest extends TeaModel {
    @NameInMap("cabin_class")
    public String cabinClassShrink;

    @NameInMap("dep_date")
    public String depDateShrink;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_segment_relations")
    public String passengerSegmentRelationsShrink;

    @NameInMap("selected_segments")
    public String selectedSegmentsShrink;

    @NameInMap("session_id")
    public String sessionId;

    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightModifyOtaSearchV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOtaSearchV2ShrinkRequest self = new FlightModifyOtaSearchV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightModifyOtaSearchV2ShrinkRequest setCabinClassShrink(String cabinClassShrink) {
        this.cabinClassShrink = cabinClassShrink;
        return this;
    }
    public String getCabinClassShrink() {
        return this.cabinClassShrink;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setDepDateShrink(String depDateShrink) {
        this.depDateShrink = depDateShrink;
        return this;
    }
    public String getDepDateShrink() {
        return this.depDateShrink;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setPassengerSegmentRelationsShrink(String passengerSegmentRelationsShrink) {
        this.passengerSegmentRelationsShrink = passengerSegmentRelationsShrink;
        return this;
    }
    public String getPassengerSegmentRelationsShrink() {
        return this.passengerSegmentRelationsShrink;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setSelectedSegmentsShrink(String selectedSegmentsShrink) {
        this.selectedSegmentsShrink = selectedSegmentsShrink;
        return this;
    }
    public String getSelectedSegmentsShrink() {
        return this.selectedSegmentsShrink;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightModifyOtaSearchV2ShrinkRequest setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

}
