// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageRequest extends TeaModel {
    // 请求参数的结构体。
    @NameInMap("Request")
    public SendCustomMessageRequestRequest request;

    public static SendCustomMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageRequest self = new SendCustomMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageRequest setRequest(SendCustomMessageRequestRequest request) {
        this.request = request;
        return this;
    }
    public SendCustomMessageRequestRequest getRequest() {
        return this.request;
    }

    public static class SendCustomMessageRequestRequest extends TeaModel {
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

        public static SendCustomMessageRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageRequestRequest self = new SendCustomMessageRequestRequest();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public SendCustomMessageRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public SendCustomMessageRequestRequest setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public SendCustomMessageRequestRequest setSubType(Integer subType) {
            this.subType = subType;
            return this;
        }
        public Integer getSubType() {
            return this.subType;
        }

        public SendCustomMessageRequestRequest setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

    }

}
