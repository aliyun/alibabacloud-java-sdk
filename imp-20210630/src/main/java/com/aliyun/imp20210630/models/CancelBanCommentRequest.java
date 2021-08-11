// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelBanCommentRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 房间唯一标识，由调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 用户在房间内的唯一标识
    @NameInMap("UserId")
    public String userId;

    // 取消禁言的用户唯一标识
    @NameInMap("BanCommentUser")
    public String banCommentUser;

    public static CancelBanCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBanCommentRequest self = new CancelBanCommentRequest();
        return TeaModel.build(map, self);
    }

    public CancelBanCommentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelBanCommentRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CancelBanCommentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CancelBanCommentRequest setBanCommentUser(String banCommentUser) {
        this.banCommentUser = banCommentUser;
        return this;
    }
    public String getBanCommentUser() {
        return this.banCommentUser;
    }

}
