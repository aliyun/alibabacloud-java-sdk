// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelAlarmShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Rooms")
    public String roomsShrink;

    public static ListHotelAlarmShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelAlarmShrinkRequest self = new ListHotelAlarmShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelAlarmShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListHotelAlarmShrinkRequest setRoomsShrink(String roomsShrink) {
        this.roomsShrink = roomsShrink;
        return this;
    }
    public String getRoomsShrink() {
        return this.roomsShrink;
    }

}
