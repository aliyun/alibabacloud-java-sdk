// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AllowPushStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("RoomId")
    public String roomId;

    public static AllowPushStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        AllowPushStreamRequest self = new AllowPushStreamRequest();
        return TeaModel.build(map, self);
    }

    public AllowPushStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllowPushStreamRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AllowPushStreamRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
