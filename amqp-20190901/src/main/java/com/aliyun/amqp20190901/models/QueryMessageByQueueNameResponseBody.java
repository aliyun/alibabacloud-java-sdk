// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class QueryMessageByQueueNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryMessageByQueueNameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMessageByQueueNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageByQueueNameResponseBody self = new QueryMessageByQueueNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageByQueueNameResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMessageByQueueNameResponseBody setData(QueryMessageByQueueNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMessageByQueueNameResponseBodyData getData() {
        return this.data;
    }

    public QueryMessageByQueueNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessageByQueueNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageByQueueNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO extends TeaModel {
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

        public static QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO self = new QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO();
            return TeaModel.build(map, self);
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setContentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setCorrelationId(String correlationId) {
            this.correlationId = correlationId;
            return this;
        }
        public String getCorrelationId() {
            return this.correlationId;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setDeliveryMode(Integer deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }
        public Integer getDeliveryMode() {
            return this.deliveryMode;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }
        public String getExchangeName() {
            return this.exchangeName;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setHeaders(String headers) {
            this.headers = headers;
            return this;
        }
        public String getHeaders() {
            return this.headers;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setImmediate(Boolean immediate) {
            this.immediate = immediate;
            return this;
        }
        public Boolean getImmediate() {
            return this.immediate;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setProcessToken(String processToken) {
            this.processToken = processToken;
            return this;
        }
        public String getProcessToken() {
            return this.processToken;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setReplyTo(String replyTo) {
            this.replyTo = replyTo;
            return this;
        }
        public String getReplyTo() {
            return this.replyTo;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public String getRoutingKey() {
            return this.routingKey;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryMessageByQueueNameResponseBodyDataVoList extends TeaModel {
        @NameInMap("AmqpMessageVO")
        public java.util.List<QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO> amqpMessageVO;

        public static QueryMessageByQueueNameResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageByQueueNameResponseBodyDataVoList self = new QueryMessageByQueueNameResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public QueryMessageByQueueNameResponseBodyDataVoList setAmqpMessageVO(java.util.List<QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO> amqpMessageVO) {
            this.amqpMessageVO = amqpMessageVO;
            return this;
        }
        public java.util.List<QueryMessageByQueueNameResponseBodyDataVoListAmqpMessageVO> getAmqpMessageVO() {
            return this.amqpMessageVO;
        }

    }

    public static class QueryMessageByQueueNameResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public QueryMessageByQueueNameResponseBodyDataVoList voList;

        public static QueryMessageByQueueNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageByQueueNameResponseBodyData self = new QueryMessageByQueueNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMessageByQueueNameResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryMessageByQueueNameResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMessageByQueueNameResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryMessageByQueueNameResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryMessageByQueueNameResponseBodyData setVoList(QueryMessageByQueueNameResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public QueryMessageByQueueNameResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
