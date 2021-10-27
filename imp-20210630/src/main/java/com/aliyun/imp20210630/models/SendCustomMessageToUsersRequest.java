// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToUsersRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 消息体内容。
    @NameInMap("Body")
    public String body;

    // 消息指定的接收人ID列表。
    @NameInMap("ReceiverList")
    public java.util.List<String> receiverList;

    // 房间唯一标识，由调用CreateRoom返回。
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
