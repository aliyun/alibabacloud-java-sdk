// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelAlarmRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Rooms")
    public java.util.List<String> rooms;

    public static ListHotelAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelAlarmRequest self = new ListHotelAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelAlarmRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListHotelAlarmRequest setRooms(java.util.List<String> rooms) {
        this.rooms = rooms;
        return this;
    }
    public java.util.List<String> getRooms() {
        return this.rooms;
    }

}
