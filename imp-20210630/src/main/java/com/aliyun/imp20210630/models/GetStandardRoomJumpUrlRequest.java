// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomJumpUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserNick")
    public String userNick;

    public static GetStandardRoomJumpUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRoomJumpUrlRequest self = new GetStandardRoomJumpUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardRoomJumpUrlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetStandardRoomJumpUrlRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetStandardRoomJumpUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetStandardRoomJumpUrlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetStandardRoomJumpUrlRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetStandardRoomJumpUrlRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetStandardRoomJumpUrlRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
