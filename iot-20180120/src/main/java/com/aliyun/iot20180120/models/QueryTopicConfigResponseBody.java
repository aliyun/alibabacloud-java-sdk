// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopicConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopicConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicConfigResponseBody self = new QueryTopicConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopicConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicConfigResponseBody setData(QueryTopicConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopicConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryTopicConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopicConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopicConfigResponseBodyDataTopicConfigInfo extends TeaModel {
        @NameInMap("Codec")
        public String codec;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableBroadcast")
        public Boolean enableBroadcast;

        @NameInMap("EnableProxySubscribe")
        public Boolean enableProxySubscribe;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("TopicFullName")
        public String topicFullName;

        public static QueryTopicConfigResponseBodyDataTopicConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicConfigResponseBodyDataTopicConfigInfo self = new QueryTopicConfigResponseBodyDataTopicConfigInfo();
            return TeaModel.build(map, self);
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setEnableBroadcast(Boolean enableBroadcast) {
            this.enableBroadcast = enableBroadcast;
            return this;
        }
        public Boolean getEnableBroadcast() {
            return this.enableBroadcast;
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setEnableProxySubscribe(Boolean enableProxySubscribe) {
            this.enableProxySubscribe = enableProxySubscribe;
            return this;
        }
        public Boolean getEnableProxySubscribe() {
            return this.enableProxySubscribe;
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryTopicConfigResponseBodyDataTopicConfigInfo setTopicFullName(String topicFullName) {
            this.topicFullName = topicFullName;
            return this;
        }
        public String getTopicFullName() {
            return this.topicFullName;
        }

    }

    public static class QueryTopicConfigResponseBodyData extends TeaModel {
        @NameInMap("TopicConfigInfo")
        public java.util.List<QueryTopicConfigResponseBodyDataTopicConfigInfo> topicConfigInfo;

        public static QueryTopicConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicConfigResponseBodyData self = new QueryTopicConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopicConfigResponseBodyData setTopicConfigInfo(java.util.List<QueryTopicConfigResponseBodyDataTopicConfigInfo> topicConfigInfo) {
            this.topicConfigInfo = topicConfigInfo;
            return this;
        }
        public java.util.List<QueryTopicConfigResponseBodyDataTopicConfigInfo> getTopicConfigInfo() {
            return this.topicConfigInfo;
        }

    }

}
