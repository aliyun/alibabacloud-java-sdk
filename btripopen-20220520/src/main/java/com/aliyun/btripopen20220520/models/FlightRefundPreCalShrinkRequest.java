// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("is_voluntary")
    public String isVoluntary;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_segment_info_list")
    public String passengerSegmentInfoListShrink;

    public static FlightRefundPreCalShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalShrinkRequest self = new FlightRefundPreCalShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightRefundPreCalShrinkRequest setIsVoluntary(String isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public String getIsVoluntary() {
        return this.isVoluntary;
    }

    public FlightRefundPreCalShrinkRequest setPassengerSegmentInfoListShrink(String passengerSegmentInfoListShrink) {
        this.passengerSegmentInfoListShrink = passengerSegmentInfoListShrink;
        return this;
    }
    public String getPassengerSegmentInfoListShrink() {
        return this.passengerSegmentInfoListShrink;
    }

}
