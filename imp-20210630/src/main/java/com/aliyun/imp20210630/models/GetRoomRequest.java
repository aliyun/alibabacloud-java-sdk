// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetRoomRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RoomId")
    public String roomId;

    public static GetRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoomRequest self = new GetRoomRequest();
        return TeaModel.build(map, self);
    }

    public GetRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
