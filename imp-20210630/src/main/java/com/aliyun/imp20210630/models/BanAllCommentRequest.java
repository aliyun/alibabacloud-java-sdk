// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class BanAllCommentRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 房间唯一标识，由调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 用户在房间内的唯一标识
    @NameInMap("UserId")
    public String userId;

    public static BanAllCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        BanAllCommentRequest self = new BanAllCommentRequest();
        return TeaModel.build(map, self);
    }

    public BanAllCommentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BanAllCommentRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public BanAllCommentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
