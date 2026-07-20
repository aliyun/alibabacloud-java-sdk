// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalV2ShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cheshiapi</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>3454043907950204159</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467137</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_segment_relations")
    public String passengerSegmentRelationsShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("pre_cal_type")
    public Integer preCalType;

    @NameInMap("ticket_nos")
    public String ticketNosShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightRefundPreCalV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalV2ShrinkRequest self = new FlightRefundPreCalV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightRefundPreCalV2ShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightRefundPreCalV2ShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightRefundPreCalV2ShrinkRequest setPassengerSegmentRelationsShrink(String passengerSegmentRelationsShrink) {
        this.passengerSegmentRelationsShrink = passengerSegmentRelationsShrink;
        return this;
    }
    public String getPassengerSegmentRelationsShrink() {
        return this.passengerSegmentRelationsShrink;
    }

    public FlightRefundPreCalV2ShrinkRequest setPreCalType(Integer preCalType) {
        this.preCalType = preCalType;
        return this;
    }
    public Integer getPreCalType() {
        return this.preCalType;
    }

    public FlightRefundPreCalV2ShrinkRequest setTicketNosShrink(String ticketNosShrink) {
        this.ticketNosShrink = ticketNosShrink;
        return this;
    }
    public String getTicketNosShrink() {
        return this.ticketNosShrink;
    }

    public FlightRefundPreCalV2ShrinkRequest setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

}
