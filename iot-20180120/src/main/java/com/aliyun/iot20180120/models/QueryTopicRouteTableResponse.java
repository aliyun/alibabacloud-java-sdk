// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicRouteTableResponse extends TeaModel {
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

    @NameInMap("DstTopics")
    @Validation(required = true)
    public QueryTopicRouteTableResponseDstTopics dstTopics;

    public static QueryTopicRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicRouteTableResponse self = new QueryTopicRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicRouteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicRouteTableResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTopicRouteTableResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicRouteTableResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTopicRouteTableResponse setDstTopics(QueryTopicRouteTableResponseDstTopics dstTopics) {
        this.dstTopics = dstTopics;
        return this;
    }
    public QueryTopicRouteTableResponseDstTopics getDstTopics() {
        return this.dstTopics;
    }

    public static class QueryTopicRouteTableResponseDstTopics extends TeaModel {
        @NameInMap("Topic")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> topic;

        public static QueryTopicRouteTableResponseDstTopics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicRouteTableResponseDstTopics self = new QueryTopicRouteTableResponseDstTopics();
            return TeaModel.build(map, self);
        }

        public QueryTopicRouteTableResponseDstTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
