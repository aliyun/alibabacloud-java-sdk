// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody self = new GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody setData(java.util.List<GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData> getData() {
        return this.data;
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData extends TeaModel {
        @NameInMap("AutoAckTag")
        public String autoAckTag;

        @NameInMap("ClientAddress")
        public String clientAddress;

        @NameInMap("Code")
        public String code;

        @NameInMap("ConsumeType")
        public String consumeType;

        @NameInMap("ConsumerTag")
        public String consumerTag;

        @NameInMap("CurrentStatus")
        public String currentStatus;

        @NameInMap("DeliveryErrorInfo")
        public String deliveryErrorInfo;

        @NameInMap("DeliveryTag")
        public String deliveryTag;

        @NameInMap("DlqQueueMsgIdMap")
        public java.util.Map<String, ?> dlqQueueMsgIdMap;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ShowAckIcon")
        public Boolean showAckIcon;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("UserId")
        public String userId;

        public static GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData self = new GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setAutoAckTag(String autoAckTag) {
            this.autoAckTag = autoAckTag;
            return this;
        }
        public String getAutoAckTag() {
            return this.autoAckTag;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setClientAddress(String clientAddress) {
            this.clientAddress = clientAddress;
            return this;
        }
        public String getClientAddress() {
            return this.clientAddress;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }
        public String getConsumerTag() {
            return this.consumerTag;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setDeliveryErrorInfo(String deliveryErrorInfo) {
            this.deliveryErrorInfo = deliveryErrorInfo;
            return this;
        }
        public String getDeliveryErrorInfo() {
            return this.deliveryErrorInfo;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setDeliveryTag(String deliveryTag) {
            this.deliveryTag = deliveryTag;
            return this;
        }
        public String getDeliveryTag() {
            return this.deliveryTag;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setDlqQueueMsgIdMap(java.util.Map<String, ?> dlqQueueMsgIdMap) {
            this.dlqQueueMsgIdMap = dlqQueueMsgIdMap;
            return this;
        }
        public java.util.Map<String, ?> getDlqQueueMsgIdMap() {
            return this.dlqQueueMsgIdMap;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setShowAckIcon(Boolean showAckIcon) {
            this.showAckIcon = showAckIcon;
            return this;
        }
        public Boolean getShowAckIcon() {
            return this.showAckIcon;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
