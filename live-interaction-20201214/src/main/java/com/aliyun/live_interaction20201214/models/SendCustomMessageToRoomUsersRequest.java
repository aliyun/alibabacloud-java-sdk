// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageToRoomUsersRequest extends TeaModel {
    @NameInMap("Receivers")
    public java.util.List<String> receivers;

    @NameInMap("Request")
    public SendCustomMessageToRoomUsersRequestRequest request;

    public static SendCustomMessageToRoomUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToRoomUsersRequest self = new SendCustomMessageToRoomUsersRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToRoomUsersRequest setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    public SendCustomMessageToRoomUsersRequest setRequest(SendCustomMessageToRoomUsersRequestRequest request) {
        this.request = request;
        return this;
    }
    public SendCustomMessageToRoomUsersRequestRequest getRequest() {
        return this.request;
    }

    public static class SendCustomMessageToRoomUsersRequestRequest extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("SubType")
        public Integer subType;

        public static SendCustomMessageToRoomUsersRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageToRoomUsersRequestRequest self = new SendCustomMessageToRoomUsersRequestRequest();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageToRoomUsersRequestRequest setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
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

    }

}
