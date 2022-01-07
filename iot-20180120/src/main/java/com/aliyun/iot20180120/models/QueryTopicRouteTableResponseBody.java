// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicRouteTableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DstTopics")
    public QueryTopicRouteTableResponseBodyDstTopics dstTopics;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopicRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicRouteTableResponseBody self = new QueryTopicRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopicRouteTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicRouteTableResponseBody setDstTopics(QueryTopicRouteTableResponseBodyDstTopics dstTopics) {
        this.dstTopics = dstTopics;
        return this;
    }
    public QueryTopicRouteTableResponseBodyDstTopics getDstTopics() {
        return this.dstTopics;
    }

    public QueryTopicRouteTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTopicRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicRouteTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopicRouteTableResponseBodyDstTopics extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<java.util.Map<String, String>> topic;

        public static QueryTopicRouteTableResponseBodyDstTopics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicRouteTableResponseBodyDstTopics self = new QueryTopicRouteTableResponseBodyDstTopics();
            return TeaModel.build(map, self);
        }

        public QueryTopicRouteTableResponseBodyDstTopics setTopic(java.util.List<java.util.Map<String, String>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getTopic() {
            return this.topic;
        }

    }

}
