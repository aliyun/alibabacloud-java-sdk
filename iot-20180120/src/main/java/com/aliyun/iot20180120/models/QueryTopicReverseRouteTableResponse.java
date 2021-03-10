// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("SrcTopics")
    @Validation(required = true)
    public QueryTopicReverseRouteTableResponseSrcTopics srcTopics;

    public static QueryTopicReverseRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicReverseRouteTableResponse self = new QueryTopicReverseRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicReverseRouteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicReverseRouteTableResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTopicReverseRouteTableResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicReverseRouteTableResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTopicReverseRouteTableResponse setSrcTopics(QueryTopicReverseRouteTableResponseSrcTopics srcTopics) {
        this.srcTopics = srcTopics;
        return this;
    }
    public QueryTopicReverseRouteTableResponseSrcTopics getSrcTopics() {
        return this.srcTopics;
    }

    public static class QueryTopicReverseRouteTableResponseSrcTopics extends TeaModel {
        @NameInMap("Topic")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> topic;

        public static QueryTopicReverseRouteTableResponseSrcTopics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicReverseRouteTableResponseSrcTopics self = new QueryTopicReverseRouteTableResponseSrcTopics();
            return TeaModel.build(map, self);
        }

        public QueryTopicReverseRouteTableResponseSrcTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
