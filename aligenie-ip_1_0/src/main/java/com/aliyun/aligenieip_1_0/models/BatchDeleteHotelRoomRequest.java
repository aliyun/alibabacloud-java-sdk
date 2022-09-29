// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class BatchDeleteHotelRoomRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNoList")
    public java.util.List<String> roomNoList;

    public static BatchDeleteHotelRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteHotelRoomRequest self = new BatchDeleteHotelRoomRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteHotelRoomRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public BatchDeleteHotelRoomRequest setRoomNoList(java.util.List<String> roomNoList) {
        this.roomNoList = roomNoList;
        return this;
    }
    public java.util.List<String> getRoomNoList() {
        return this.roomNoList;
    }

}
