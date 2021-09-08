// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryMessageInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public QueryMessageInfoResponseMessage message;

    public static QueryMessageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageInfoResponse self = new QueryMessageInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMessageInfoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryMessageInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMessageInfoResponse setMessage(QueryMessageInfoResponseMessage message) {
        this.message = message;
        return this;
    }
    public QueryMessageInfoResponseMessage getMessage() {
        return this.message;
    }

    public static class QueryMessageInfoResponseMessageUserProperties extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static QueryMessageInfoResponseMessageUserProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageInfoResponseMessageUserProperties self = new QueryMessageInfoResponseMessageUserProperties();
            return TeaModel.build(map, self);
        }

        public QueryMessageInfoResponseMessageUserProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMessageInfoResponseMessageUserProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMessageInfoResponseMessage extends TeaModel {
        @NameInMap("UniMsgId")
        @Validation(required = true)
        public String uniMsgId;

        @NameInMap("TopicFullName")
        @Validation(required = true)
        public String topicFullName;

        @NameInMap("MessageContent")
        @Validation(required = true)
        public String messageContent;

        @NameInMap("GenerateTime")
        @Validation(required = true)
        public Long generateTime;

        @NameInMap("UserProperties")
        @Validation(required = true)
        public java.util.List<QueryMessageInfoResponseMessageUserProperties> userProperties;

        public static QueryMessageInfoResponseMessage build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageInfoResponseMessage self = new QueryMessageInfoResponseMessage();
            return TeaModel.build(map, self);
        }

        public QueryMessageInfoResponseMessage setUniMsgId(String uniMsgId) {
            this.uniMsgId = uniMsgId;
            return this;
        }
        public String getUniMsgId() {
            return this.uniMsgId;
        }

        public QueryMessageInfoResponseMessage setTopicFullName(String topicFullName) {
            this.topicFullName = topicFullName;
            return this;
        }
        public String getTopicFullName() {
            return this.topicFullName;
        }

        public QueryMessageInfoResponseMessage setMessageContent(String messageContent) {
            this.messageContent = messageContent;
            return this;
        }
        public String getMessageContent() {
            return this.messageContent;
        }

        public QueryMessageInfoResponseMessage setGenerateTime(Long generateTime) {
            this.generateTime = generateTime;
            return this;
        }
        public Long getGenerateTime() {
            return this.generateTime;
        }

        public QueryMessageInfoResponseMessage setUserProperties(java.util.List<QueryMessageInfoResponseMessageUserProperties> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.List<QueryMessageInfoResponseMessageUserProperties> getUserProperties() {
            return this.userProperties;
        }

    }

}
