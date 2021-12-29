// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopLiveRequest extends TeaModel {
    // 租户名
    @NameInMap("AppId")
    public String appId;

    // 直播资源的唯一标识ID
    @NameInMap("LiveId")
    public String liveId;

    // 房间ID，最大长度36位
    @NameInMap("RoomId")
    public String roomId;

    // 创建直播用户ID
    @NameInMap("UserId")
    public String userId;

    public static StopLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLiveRequest self = new StopLiveRequest();
        return TeaModel.build(map, self);
    }

    public StopLiveRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public StopLiveRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public StopLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
