// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidPushStreamRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RoomId")
    @Validation(required = true)
    public String roomId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("EndTime")
    public String endTime;

    public static ForbidPushStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ForbidPushStreamRequest self = new ForbidPushStreamRequest();
        return TeaModel.build(map, self);
    }

    public ForbidPushStreamRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ForbidPushStreamRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public ForbidPushStreamRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ForbidPushStreamRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
