// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToAllRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Body")
    public String body;

    @NameInMap("RoomId")
    public String roomId;

    public static SendCustomMessageToAllRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToAllRequest self = new SendCustomMessageToAllRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToAllRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendCustomMessageToAllRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public SendCustomMessageToAllRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
