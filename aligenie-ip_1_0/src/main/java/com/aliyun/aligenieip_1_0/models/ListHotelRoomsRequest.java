// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelRoomsRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    public static ListHotelRoomsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelRoomsRequest self = new ListHotelRoomsRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelRoomsRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
