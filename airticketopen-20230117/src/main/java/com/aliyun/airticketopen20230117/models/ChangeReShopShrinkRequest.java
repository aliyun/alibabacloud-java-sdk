// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeReShopShrinkRequest extends TeaModel {
    @NameInMap("air_legs")
    public String airLegsShrink;

    @NameInMap("order_num")
    public Long orderNum;

    @NameInMap("passengers")
    public String passengersShrink;

    @NameInMap("reason")
    public Integer reason;

    @NameInMap("trip_type")
    public Integer tripType;

    public static ChangeReShopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeReShopShrinkRequest self = new ChangeReShopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeReShopShrinkRequest setAirLegsShrink(String airLegsShrink) {
        this.airLegsShrink = airLegsShrink;
        return this;
    }
    public String getAirLegsShrink() {
        return this.airLegsShrink;
    }

    public ChangeReShopShrinkRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public ChangeReShopShrinkRequest setPassengersShrink(String passengersShrink) {
        this.passengersShrink = passengersShrink;
        return this;
    }
    public String getPassengersShrink() {
        return this.passengersShrink;
    }

    public ChangeReShopShrinkRequest setReason(Integer reason) {
        this.reason = reason;
        return this;
    }
    public Integer getReason() {
        return this.reason;
    }

    public ChangeReShopShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
