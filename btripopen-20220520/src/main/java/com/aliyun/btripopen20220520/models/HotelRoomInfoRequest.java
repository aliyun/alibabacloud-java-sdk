// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelRoomInfoRequest extends TeaModel {
    @NameInMap("room_ids")
    public java.util.List<Long> roomIds;

    public static HotelRoomInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelRoomInfoRequest self = new HotelRoomInfoRequest();
        return TeaModel.build(map, self);
    }

    public HotelRoomInfoRequest setRoomIds(java.util.List<Long> roomIds) {
        this.roomIds = roomIds;
        return this;
    }
    public java.util.List<Long> getRoomIds() {
        return this.roomIds;
    }

}
