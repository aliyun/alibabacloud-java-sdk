// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageToRoomUsersRequest extends TeaModel {
    // 请求参数的结构体。
    @NameInMap("Request")
    public SendCustomMessageToRoomUsersRequestRequest request;

    // 指定的消息接受者的用户ID列表，大小不得超过100。
    @NameInMap("Receivers")
    public java.util.List<String> receivers;

    public static SendCustomMessageToRoomUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToRoomUsersRequest self = new SendCustomMessageToRoomUsersRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToRoomUsersRequest setRequest(SendCustomMessageToRoomUsersRequestRequest request) {
        this.request = request;
        return this;
    }
    public SendCustomMessageToRoomUsersRequestRequest getRequest() {
        return this.request;
    }

    public SendCustomMessageToRoomUsersRequest setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    public static class SendCustomMessageToRoomUsersRequestRequest extends TeaModel {
        // 应用的appKey。
        @NameInMap("Domain")
        public String domain;

        // 房间ID，由调用CreateRoom时返回。
        @NameInMap("RoomId")
        public String roomId;

        // 消息的发送者ID。
        @NameInMap("SenderId")
        public String senderId;

        // 消息的类型，由业务自定义，请传递100000以上。
        @NameInMap("SubType")
        public Integer subType;

        // 消息体。
        @NameInMap("Body")
        public String body;

        public static SendCustomMessageToRoomUsersRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageToRoomUsersRequestRequest self = new SendCustomMessageToRoomUsersRequestRequest();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageToRoomUsersRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public SendCustomMessageToRoomUsersRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public SendCustomMessageToRoomUsersRequestRequest setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public SendCustomMessageToRoomUsersRequestRequest setSubType(Integer subType) {
            this.subType = subType;
            return this;
        }
        public Integer getSubType() {
            return this.subType;
        }

        public SendCustomMessageToRoomUsersRequestRequest setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

    }

}
