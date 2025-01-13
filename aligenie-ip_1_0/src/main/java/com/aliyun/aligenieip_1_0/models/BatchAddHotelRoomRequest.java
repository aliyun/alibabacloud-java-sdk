// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class BatchAddHotelRoomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e6dd44fd16084db8a60d69fd625d9f0f</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     */
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
