// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMessagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("BizMessages")
    @Validation(required = true)
    public QueryMessagesResponseBizMessages bizMessages;

    public static QueryMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessagesResponse self = new QueryMessagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessagesResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMessagesResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMessagesResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMessagesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMessagesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessagesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMessagesResponse setBizMessages(QueryMessagesResponseBizMessages bizMessages) {
        this.bizMessages = bizMessages;
        return this;
    }
    public QueryMessagesResponseBizMessages getBizMessages() {
        return this.bizMessages;
    }

    public static class QueryMessagesResponseBizMessagesBizMessage extends TeaModel {
        @NameInMap("Topic")
        @Validation(required = true)
        public String topic;

        @NameInMap("DataId")
        @Validation(required = true)
        public Long dataId;

        @NameInMap("PubTime")
        @Validation(required = true)
        public String pubTime;

        @NameInMap("ContentMapJson")
        @Validation(required = true)
        public String contentMapJson;

        public static QueryMessagesResponseBizMessagesBizMessage build(java.util.Map<String, ?> map) throws Exception {
            QueryMessagesResponseBizMessagesBizMessage self = new QueryMessagesResponseBizMessagesBizMessage();
            return TeaModel.build(map, self);
        }

        public QueryMessagesResponseBizMessagesBizMessage setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMessagesResponseBizMessagesBizMessage setDataId(Long dataId) {
            this.dataId = dataId;
            return this;
        }
        public Long getDataId() {
            return this.dataId;
        }

        public QueryMessagesResponseBizMessagesBizMessage setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public QueryMessagesResponseBizMessagesBizMessage setContentMapJson(String contentMapJson) {
            this.contentMapJson = contentMapJson;
            return this;
        }
        public String getContentMapJson() {
            return this.contentMapJson;
        }

    }

    public static class QueryMessagesResponseBizMessages extends TeaModel {
        @NameInMap("BizMessage")
        @Validation(required = true)
        public java.util.List<QueryMessagesResponseBizMessagesBizMessage> bizMessage;

        public static QueryMessagesResponseBizMessages build(java.util.Map<String, ?> map) throws Exception {
            QueryMessagesResponseBizMessages self = new QueryMessagesResponseBizMessages();
            return TeaModel.build(map, self);
        }

        public QueryMessagesResponseBizMessages setBizMessage(java.util.List<QueryMessagesResponseBizMessagesBizMessage> bizMessage) {
            this.bizMessage = bizMessage;
            return this;
        }
        public java.util.List<QueryMessagesResponseBizMessagesBizMessage> getBizMessage() {
            return this.bizMessage;
        }

    }

}
