// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelBanCommentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BanCommentUser")
    public String banCommentUser;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

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

    public CancelBanCommentRequest setBanCommentUser(String banCommentUser) {
        this.banCommentUser = banCommentUser;
        return this;
    }
    public String getBanCommentUser() {
        return this.banCommentUser;
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

}
