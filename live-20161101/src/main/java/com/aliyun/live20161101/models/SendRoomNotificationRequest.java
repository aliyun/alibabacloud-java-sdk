// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendRoomNotificationRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RoomId")
    @Validation(required = true)
    public String roomId;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Priority")
    public Integer priority;

    public static SendRoomNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRoomNotificationRequest self = new SendRoomNotificationRequest();
        return TeaModel.build(map, self);
    }

    public SendRoomNotificationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendRoomNotificationRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SendRoomNotificationRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public SendRoomNotificationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendRoomNotificationRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

}
