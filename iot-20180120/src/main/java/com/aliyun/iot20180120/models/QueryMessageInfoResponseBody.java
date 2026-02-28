// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryMessageInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public QueryMessageInfoResponseBodyMessage message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMessageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageInfoResponseBody self = new QueryMessageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMessageInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryMessageInfoResponseBody setMessage(QueryMessageInfoResponseBodyMessage message) {
        this.message = message;
        return this;
    }
    public QueryMessageInfoResponseBodyMessage getMessage() {
        return this.message;
    }

    public QueryMessageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMessageInfoResponseBodyMessageMqttProperties extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryMessageInfoResponseBodyMessageMqttProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageInfoResponseBodyMessageMqttProperties self = new QueryMessageInfoResponseBodyMessageMqttProperties();
            return TeaModel.build(map, self);
        }

        public QueryMessageInfoResponseBodyMessageMqttProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMessageInfoResponseBodyMessageMqttProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMessageInfoResponseBodyMessageUserProperties extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryMessageInfoResponseBodyMessageUserProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageInfoResponseBodyMessageUserProperties self = new QueryMessageInfoResponseBodyMessageUserProperties();
            return TeaModel.build(map, self);
        }

        public QueryMessageInfoResponseBodyMessageUserProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMessageInfoResponseBodyMessageUserProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMessageInfoResponseBodyMessage extends TeaModel {
        @NameInMap("GenerateTime")
        public Long generateTime;

        @NameInMap("MessageContent")
        public String messageContent;

        @NameInMap("MqttProperties")
        public java.util.List<QueryMessageInfoResponseBodyMessageMqttProperties> mqttProperties;

        @NameInMap("TopicFullName")
        public String topicFullName;

        @NameInMap("TransformedMessageContent")
        public String transformedMessageContent;

        @NameInMap("TransformedTopicFullName")
        public String transformedTopicFullName;

        @NameInMap("UniMsgId")
        public String uniMsgId;

        @NameInMap("UserProperties")
        public java.util.List<QueryMessageInfoResponseBodyMessageUserProperties> userProperties;

        public static QueryMessageInfoResponseBodyMessage build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageInfoResponseBodyMessage self = new QueryMessageInfoResponseBodyMessage();
            return TeaModel.build(map, self);
        }

        public QueryMessageInfoResponseBodyMessage setGenerateTime(Long generateTime) {
            this.generateTime = generateTime;
            return this;
        }
        public Long getGenerateTime() {
            return this.generateTime;
        }

        public QueryMessageInfoResponseBodyMessage setMessageContent(String messageContent) {
            this.messageContent = messageContent;
            return this;
        }
        public String getMessageContent() {
            return this.messageContent;
        }

        public QueryMessageInfoResponseBodyMessage setMqttProperties(java.util.List<QueryMessageInfoResponseBodyMessageMqttProperties> mqttProperties) {
            this.mqttProperties = mqttProperties;
            return this;
        }
        public java.util.List<QueryMessageInfoResponseBodyMessageMqttProperties> getMqttProperties() {
            return this.mqttProperties;
        }

        public QueryMessageInfoResponseBodyMessage setTopicFullName(String topicFullName) {
            this.topicFullName = topicFullName;
            return this;
        }
        public String getTopicFullName() {
            return this.topicFullName;
        }

        public QueryMessageInfoResponseBodyMessage setTransformedMessageContent(String transformedMessageContent) {
            this.transformedMessageContent = transformedMessageContent;
            return this;
        }
        public String getTransformedMessageContent() {
            return this.transformedMessageContent;
        }

        public QueryMessageInfoResponseBodyMessage setTransformedTopicFullName(String transformedTopicFullName) {
            this.transformedTopicFullName = transformedTopicFullName;
            return this;
        }
        public String getTransformedTopicFullName() {
            return this.transformedTopicFullName;
        }

        public QueryMessageInfoResponseBodyMessage setUniMsgId(String uniMsgId) {
            this.uniMsgId = uniMsgId;
            return this;
        }
        public String getUniMsgId() {
            return this.uniMsgId;
        }

        public QueryMessageInfoResponseBodyMessage setUserProperties(java.util.List<QueryMessageInfoResponseBodyMessageUserProperties> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.List<QueryMessageInfoResponseBodyMessageUserProperties> getUserProperties() {
            return this.userProperties;
        }

    }

}
