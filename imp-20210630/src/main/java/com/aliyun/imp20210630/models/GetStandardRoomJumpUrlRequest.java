// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomJumpUrlRequest extends TeaModel {
    // 用户的应用ID，在控制台创建应用时生成
    @NameInMap("AppId")
    public String appId;

    // 终端设备类型,通过控制台创建和查询
    @NameInMap("AppKey")
    public String appKey;

    // 资源ID：根据业务类型来定，比如直播ID，课堂ID等
    @NameInMap("BizId")
    public String bizId;

    // 业务类型：互动直播live，互动课堂class
    @NameInMap("BizType")
    public String bizType;

    // 平台：win, mac, android, ios, web
    @NameInMap("Platform")
    public String platform;

    // 用户UserId,在AppId下单独唯一
    @NameInMap("UserId")
    public String userId;

    // 用户昵称
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
