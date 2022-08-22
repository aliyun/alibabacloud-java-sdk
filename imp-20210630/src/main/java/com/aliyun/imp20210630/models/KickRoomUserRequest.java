// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class KickRoomUserRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BlockTime")
    public Long blockTime;

    @NameInMap("KickUser")
    public String kickUser;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static KickRoomUserRequest build(java.util.Map<String, ?> map) throws Exception {
        KickRoomUserRequest self = new KickRoomUserRequest();
        return TeaModel.build(map, self);
    }

    public KickRoomUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public KickRoomUserRequest setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }
    public Long getBlockTime() {
        return this.blockTime;
    }

    public KickRoomUserRequest setKickUser(String kickUser) {
        this.kickUser = kickUser;
        return this;
    }
    public String getKickUser() {
        return this.kickUser;
    }

    public KickRoomUserRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public KickRoomUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
