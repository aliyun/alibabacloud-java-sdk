// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByQueueResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetSendTraceByQueueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSendTraceByQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByQueueResponseBody self = new GetSendTraceByQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByQueueResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSendTraceByQueueResponseBody setData(GetSendTraceByQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSendTraceByQueueResponseBodyData getData() {
        return this.data;
    }

    public GetSendTraceByQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSendTraceByQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSendTraceByQueueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSendTraceByQueueResponseBodyDataVoList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Exchange")
        public String exchange;

        @NameInMap("MessageBodyLength")
        public String messageBodyLength;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("MessagePropertiesMap")
        public java.util.Map<String, ?> messagePropertiesMap;

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

        public static GetSendTraceByQueueResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetSendTraceByQueueResponseBodyDataVoList self = new GetSendTraceByQueueResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetSendTraceByQueueResponseBodyDataVoList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }
        public String getExchange() {
            return this.exchange;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setMessageBodyLength(String messageBodyLength) {
            this.messageBodyLength = messageBodyLength;
            return this;
        }
        public String getMessageBodyLength() {
            return this.messageBodyLength;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setMessagePropertiesMap(java.util.Map<String, ?> messagePropertiesMap) {
            this.messagePropertiesMap = messagePropertiesMap;
            return this;
        }
        public java.util.Map<String, ?> getMessagePropertiesMap() {
            return this.messagePropertiesMap;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setQueueMsgIdMap(java.util.Map<String, ?> queueMsgIdMap) {
            this.queueMsgIdMap = queueMsgIdMap;
            return this;
        }
        public java.util.Map<String, ?> getQueueMsgIdMap() {
            return this.queueMsgIdMap;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setRemoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public String getRoutingKey() {
            return this.routingKey;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setSendErrorInfo(String sendErrorInfo) {
            this.sendErrorInfo = sendErrorInfo;
            return this;
        }
        public String getSendErrorInfo() {
            return this.sendErrorInfo;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSendTraceByQueueResponseBodyDataVoList setVhost(String vhost) {
            this.vhost = vhost;
            return this;
        }
        public String getVhost() {
            return this.vhost;
        }

    }

    public static class GetSendTraceByQueueResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoList")
        public java.util.List<GetSendTraceByQueueResponseBodyDataVoList> voList;

        public static GetSendTraceByQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSendTraceByQueueResponseBodyData self = new GetSendTraceByQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSendTraceByQueueResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetSendTraceByQueueResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSendTraceByQueueResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetSendTraceByQueueResponseBodyData setVoList(java.util.List<GetSendTraceByQueueResponseBodyDataVoList> voList) {
            this.voList = voList;
            return this;
        }
        public java.util.List<GetSendTraceByQueueResponseBodyDataVoList> getVoList() {
            return this.voList;
        }

    }

}
