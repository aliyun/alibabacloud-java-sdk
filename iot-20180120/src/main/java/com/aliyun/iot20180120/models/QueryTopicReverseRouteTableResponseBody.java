// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("SrcTopics")
    public QueryTopicReverseRouteTableResponseBodySrcTopics srcTopics;

    public static QueryTopicReverseRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicReverseRouteTableResponseBody self = new QueryTopicReverseRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopicReverseRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicReverseRouteTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTopicReverseRouteTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicReverseRouteTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTopicReverseRouteTableResponseBody setSrcTopics(QueryTopicReverseRouteTableResponseBodySrcTopics srcTopics) {
        this.srcTopics = srcTopics;
        return this;
    }
    public QueryTopicReverseRouteTableResponseBodySrcTopics getSrcTopics() {
        return this.srcTopics;
    }

    public static class QueryTopicReverseRouteTableResponseBodySrcTopics extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<java.util.Map<String, String>> topic;

        public static QueryTopicReverseRouteTableResponseBodySrcTopics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicReverseRouteTableResponseBodySrcTopics self = new QueryTopicReverseRouteTableResponseBodySrcTopics();
            return TeaModel.build(map, self);
        }

        public QueryTopicReverseRouteTableResponseBodySrcTopics setTopic(java.util.List<java.util.Map<String, String>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getTopic() {
            return this.topic;
        }

    }

}
