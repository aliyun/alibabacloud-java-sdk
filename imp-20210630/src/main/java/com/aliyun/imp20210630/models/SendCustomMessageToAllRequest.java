// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToAllRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 房间唯一标识，由调用CreateRoom返回。
    @NameInMap("RoomId")
    public String roomId;

    // 消息体内容。
    @NameInMap("Body")
    public String body;

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

    public SendCustomMessageToAllRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SendCustomMessageToAllRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
