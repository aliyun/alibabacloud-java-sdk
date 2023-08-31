// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelRoomsShrinkRequest extends TeaModel {
    @NameInMap("HotelAdminRoom")
    public String hotelAdminRoomShrink;

    @NameInMap("HotelId")
    public String hotelId;

    public static ListHotelRoomsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelRoomsShrinkRequest self = new ListHotelRoomsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelRoomsShrinkRequest setHotelAdminRoomShrink(String hotelAdminRoomShrink) {
        this.hotelAdminRoomShrink = hotelAdminRoomShrink;
        return this;
    }
    public String getHotelAdminRoomShrink() {
        return this.hotelAdminRoomShrink;
    }

    public ListHotelRoomsShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
