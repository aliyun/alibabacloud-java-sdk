// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomUserNotificationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("Data")
    public String data;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("ToAppUid")
    public String toAppUid;

    public static SendRoomUserNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRoomUserNotificationRequest self = new SendRoomUserNotificationRequest();
        return TeaModel.build(map, self);
    }

    public SendRoomUserNotificationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendRoomUserNotificationRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public SendRoomUserNotificationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendRoomUserNotificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendRoomUserNotificationRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public SendRoomUserNotificationRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SendRoomUserNotificationRequest setToAppUid(String toAppUid) {
        this.toAppUid = toAppUid;
        return this;
    }
    public String getToAppUid() {
        return this.toAppUid;
    }

}
