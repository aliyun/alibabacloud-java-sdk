// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class BatchDeleteHotelRoomShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNoList")
    public String roomNoListShrink;

    public static BatchDeleteHotelRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteHotelRoomShrinkRequest self = new BatchDeleteHotelRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteHotelRoomShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public BatchDeleteHotelRoomShrinkRequest setRoomNoListShrink(String roomNoListShrink) {
        this.roomNoListShrink = roomNoListShrink;
        return this;
    }
    public String getRoomNoListShrink() {
        return this.roomNoListShrink;
    }

}
