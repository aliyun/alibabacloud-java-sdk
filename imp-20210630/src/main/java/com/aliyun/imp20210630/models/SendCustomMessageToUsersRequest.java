// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToUsersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Body")
    public String body;

    @NameInMap("ReceiverList")
    public java.util.List<String> receiverList;

    @NameInMap("RoomId")
    public String roomId;

    public static SendCustomMessageToUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToUsersRequest self = new SendCustomMessageToUsersRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendCustomMessageToUsersRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public SendCustomMessageToUsersRequest setReceiverList(java.util.List<String> receiverList) {
        this.receiverList = receiverList;
        return this;
    }
    public java.util.List<String> getReceiverList() {
        return this.receiverList;
    }

    public SendCustomMessageToUsersRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
