// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class LeaveRoomRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    public static LeaveRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        LeaveRoomRequest self = new LeaveRoomRequest();
        return TeaModel.build(map, self);
    }

    public LeaveRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
