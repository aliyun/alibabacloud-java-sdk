// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRoomRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RoomId")
    @Validation(required = true)
    public String roomId;

    public static DeleteRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoomRequest self = new DeleteRoomRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
