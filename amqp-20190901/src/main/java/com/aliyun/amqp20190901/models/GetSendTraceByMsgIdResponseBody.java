// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByMsgIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetSendTraceByMsgIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSendTraceByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByMsgIdResponseBody self = new GetSendTraceByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByMsgIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSendTraceByMsgIdResponseBody setData(GetSendTraceByMsgIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSendTraceByMsgIdResponseBodyData getData() {
        return this.data;
    }

    public GetSendTraceByMsgIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSendTraceByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSendTraceByMsgIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSendTraceByMsgIdResponseBodyDataVoList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Exchange")
        public String exchange;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MessageBodyLength")
        public String messageBodyLength;

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

        public static GetSendTraceByMsgIdResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetSendTraceByMsgIdResponseBodyDataVoList self = new GetSendTraceByMsgIdResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }
        public String getExchange() {
            return this.exchange;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setMessageBodyLength(String messageBodyLength) {
            this.messageBodyLength = messageBodyLength;
            return this;
        }
        public String getMessageBodyLength() {
            return this.messageBodyLength;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setMessagePropertiesMap(java.util.Map<String, ?> messagePropertiesMap) {
            this.messagePropertiesMap = messagePropertiesMap;
            return this;
        }
        public java.util.Map<String, ?> getMessagePropertiesMap() {
            return this.messagePropertiesMap;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setQueueMsgIdMap(java.util.Map<String, ?> queueMsgIdMap) {
            this.queueMsgIdMap = queueMsgIdMap;
            return this;
        }
        public java.util.Map<String, ?> getQueueMsgIdMap() {
            return this.queueMsgIdMap;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setRemoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public String getRoutingKey() {
            return this.routingKey;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setSendErrorInfo(String sendErrorInfo) {
            this.sendErrorInfo = sendErrorInfo;
            return this;
        }
        public String getSendErrorInfo() {
            return this.sendErrorInfo;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSendTraceByMsgIdResponseBodyDataVoList setVhost(String vhost) {
            this.vhost = vhost;
            return this;
        }
        public String getVhost() {
            return this.vhost;
        }

    }

    public static class GetSendTraceByMsgIdResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoList")
        public java.util.List<GetSendTraceByMsgIdResponseBodyDataVoList> voList;

        public static GetSendTraceByMsgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSendTraceByMsgIdResponseBodyData self = new GetSendTraceByMsgIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSendTraceByMsgIdResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetSendTraceByMsgIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSendTraceByMsgIdResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetSendTraceByMsgIdResponseBodyData setVoList(java.util.List<GetSendTraceByMsgIdResponseBodyDataVoList> voList) {
            this.voList = voList;
            return this;
        }
        public java.util.List<GetSendTraceByMsgIdResponseBodyDataVoList> getVoList() {
            return this.voList;
        }

    }

}
