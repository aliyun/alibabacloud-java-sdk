// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class KickRoomUserRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BlockTime")
    public Long blockTime;

    // 被踢出房间的用户ID。
    @NameInMap("KickUser")
    public String kickUser;

    // 房间唯一标识，由字母、数字、符号.和-组成，最大长度36位，传空则随机生成一个房间id。
    @NameInMap("RoomId")
    public String roomId;

    // 操作人的用户ID，用于表示谁执行了踢人操作。
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
