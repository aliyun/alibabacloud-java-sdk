// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody self = new GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody setData(GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData getData() {
        return this.data;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("Exchange")
        public String exchange;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("QueueMsgIdMap")
        public java.util.Map<String, ?> queueMsgIdMap;

        @NameInMap("RemoteAddress")
        public String remoteAddress;

        @NameInMap("RoutingKey")
        public String routingKey;

        @NameInMap("SendErrorInfo")
        public String sendErrorInfo;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Vhost")
        public String vhost;

        @NameInMap("XDelay")
        public String XDelay;

        public static GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData self = new GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }
        public String getExchange() {
            return this.exchange;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setQueueMsgIdMap(java.util.Map<String, ?> queueMsgIdMap) {
            this.queueMsgIdMap = queueMsgIdMap;
            return this;
        }
        public java.util.Map<String, ?> getQueueMsgIdMap() {
            return this.queueMsgIdMap;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setRemoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public String getRoutingKey() {
            return this.routingKey;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setSendErrorInfo(String sendErrorInfo) {
            this.sendErrorInfo = sendErrorInfo;
            return this;
        }
        public String getSendErrorInfo() {
            return this.sendErrorInfo;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setVhost(String vhost) {
            this.vhost = vhost;
            return this;
        }
        public String getVhost() {
            return this.vhost;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBodyData setXDelay(String XDelay) {
            this.XDelay = XDelay;
            return this;
        }
        public String getXDelay() {
            return this.XDelay;
        }

    }

}
