// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class QueryMessageByMessageIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryMessageByMessageIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMessageByMessageIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageByMessageIdResponseBody self = new QueryMessageByMessageIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageByMessageIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMessageByMessageIdResponseBody setData(QueryMessageByMessageIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMessageByMessageIdResponseBodyData getData() {
        return this.data;
    }

    public QueryMessageByMessageIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessageByMessageIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageByMessageIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMessageByMessageIdResponseBodyDataVoList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Body")
        public String body;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ContentEncoding")
        public String contentEncoding;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("CorrelationId")
        public String correlationId;

        @NameInMap("DeliveryMode")
        public Integer deliveryMode;

        @NameInMap("ExchangeName")
        public String exchangeName;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("Headers")
        public String headers;

        @NameInMap("Immediate")
        public Boolean immediate;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProcessToken")
        public String processToken;

        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        @NameInMap("ReplyTo")
        public String replyTo;

        @NameInMap("RoutingKey")
        public String routingKey;

        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        public static QueryMessageByMessageIdResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageByMessageIdResponseBodyDataVoList self = new QueryMessageByMessageIdResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setContentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setCorrelationId(String correlationId) {
            this.correlationId = correlationId;
            return this;
        }
        public String getCorrelationId() {
            return this.correlationId;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setDeliveryMode(Integer deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }
        public Integer getDeliveryMode() {
            return this.deliveryMode;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }
        public String getExchangeName() {
            return this.exchangeName;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setHeaders(String headers) {
            this.headers = headers;
            return this;
        }
        public String getHeaders() {
            return this.headers;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setImmediate(Boolean immediate) {
            this.immediate = immediate;
            return this;
        }
        public Boolean getImmediate() {
            return this.immediate;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setProcessToken(String processToken) {
            this.processToken = processToken;
            return this;
        }
        public String getProcessToken() {
            return this.processToken;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setReplyTo(String replyTo) {
            this.replyTo = replyTo;
            return this;
        }
        public String getReplyTo() {
            return this.replyTo;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public String getRoutingKey() {
            return this.routingKey;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMessageByMessageIdResponseBodyDataVoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryMessageByMessageIdResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoList")
        public java.util.List<QueryMessageByMessageIdResponseBodyDataVoList> voList;

        public static QueryMessageByMessageIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageByMessageIdResponseBodyData self = new QueryMessageByMessageIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMessageByMessageIdResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryMessageByMessageIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMessageByMessageIdResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryMessageByMessageIdResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryMessageByMessageIdResponseBodyData setVoList(java.util.List<QueryMessageByMessageIdResponseBodyDataVoList> voList) {
            this.voList = voList;
            return this;
        }
        public java.util.List<QueryMessageByMessageIdResponseBodyDataVoList> getVoList() {
            return this.voList;
        }

    }

}
