// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class BatchAddHotelRoomRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNoList")
    public java.util.List<String> roomNoList;

    public static BatchAddHotelRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddHotelRoomRequest self = new BatchAddHotelRoomRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddHotelRoomRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public BatchAddHotelRoomRequest setRoomNoList(java.util.List<String> roomNoList) {
        this.roomNoList = roomNoList;
        return this;
    }
    public java.util.List<String> getRoomNoList() {
        return this.roomNoList;
    }

}
