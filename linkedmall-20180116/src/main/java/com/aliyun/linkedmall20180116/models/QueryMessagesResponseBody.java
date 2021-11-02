// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMessagesResponseBody extends TeaModel {
    @NameInMap("BizMessages")
    public QueryMessagesResponseBodyBizMessages bizMessages;

    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessagesResponseBody self = new QueryMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessagesResponseBody setBizMessages(QueryMessagesResponseBodyBizMessages bizMessages) {
        this.bizMessages = bizMessages;
        return this;
    }
    public QueryMessagesResponseBodyBizMessages getBizMessages() {
        return this.bizMessages;
    }

    public QueryMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMessagesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessagesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMessagesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMessagesResponseBodyBizMessagesBizMessage extends TeaModel {
        @NameInMap("ContentMapJson")
        public String contentMapJson;

        @NameInMap("DataId")
        public Long dataId;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Topic")
        public String topic;

        public static QueryMessagesResponseBodyBizMessagesBizMessage build(java.util.Map<String, ?> map) throws Exception {
            QueryMessagesResponseBodyBizMessagesBizMessage self = new QueryMessagesResponseBodyBizMessagesBizMessage();
            return TeaModel.build(map, self);
        }

        public QueryMessagesResponseBodyBizMessagesBizMessage setContentMapJson(String contentMapJson) {
            this.contentMapJson = contentMapJson;
            return this;
        }
        public String getContentMapJson() {
            return this.contentMapJson;
        }

        public QueryMessagesResponseBodyBizMessagesBizMessage setDataId(Long dataId) {
            this.dataId = dataId;
            return this;
        }
        public Long getDataId() {
            return this.dataId;
        }

        public QueryMessagesResponseBodyBizMessagesBizMessage setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public QueryMessagesResponseBodyBizMessagesBizMessage setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryMessagesResponseBodyBizMessages extends TeaModel {
        @NameInMap("BizMessage")
        public java.util.List<QueryMessagesResponseBodyBizMessagesBizMessage> bizMessage;

        public static QueryMessagesResponseBodyBizMessages build(java.util.Map<String, ?> map) throws Exception {
            QueryMessagesResponseBodyBizMessages self = new QueryMessagesResponseBodyBizMessages();
            return TeaModel.build(map, self);
        }

        public QueryMessagesResponseBodyBizMessages setBizMessage(java.util.List<QueryMessagesResponseBodyBizMessagesBizMessage> bizMessage) {
            this.bizMessage = bizMessage;
            return this;
        }
        public java.util.List<QueryMessagesResponseBodyBizMessagesBizMessage> getBizMessage() {
            return this.bizMessage;
        }

    }

}
