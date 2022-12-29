// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CheckoutWithAKRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    public static CheckoutWithAKRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckoutWithAKRequest self = new CheckoutWithAKRequest();
        return TeaModel.build(map, self);
    }

    public CheckoutWithAKRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public CheckoutWithAKRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
