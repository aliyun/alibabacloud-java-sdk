// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class BanCommentRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 房间唯一标识，由调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 用户在房间内的唯一标识
    @NameInMap("UserId")
    public String userId;

    // 被禁言的用户在房间内的唯一标识
    @NameInMap("BanCommentUser")
    public String banCommentUser;

    // 禁言时长（秒）
    @NameInMap("BanCommentTime")
    public Long banCommentTime;

    public static BanCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        BanCommentRequest self = new BanCommentRequest();
        return TeaModel.build(map, self);
    }

    public BanCommentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BanCommentRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public BanCommentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BanCommentRequest setBanCommentUser(String banCommentUser) {
        this.banCommentUser = banCommentUser;
        return this;
    }
    public String getBanCommentUser() {
        return this.banCommentUser;
    }

    public BanCommentRequest setBanCommentTime(Long banCommentTime) {
        this.banCommentTime = banCommentTime;
        return this;
    }
    public Long getBanCommentTime() {
        return this.banCommentTime;
    }

}
