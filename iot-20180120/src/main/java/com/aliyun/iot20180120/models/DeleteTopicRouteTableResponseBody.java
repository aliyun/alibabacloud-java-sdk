// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteTopicRouteTableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FailureTopics")
    public DeleteTopicRouteTableResponseBodyFailureTopics failureTopics;

    @NameInMap("IsAllSucceed")
    public Boolean isAllSucceed;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteTopicRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRouteTableResponseBody self = new DeleteTopicRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRouteTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTopicRouteTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteTopicRouteTableResponseBody setFailureTopics(DeleteTopicRouteTableResponseBodyFailureTopics failureTopics) {
        this.failureTopics = failureTopics;
        return this;
    }
    public DeleteTopicRouteTableResponseBodyFailureTopics getFailureTopics() {
        return this.failureTopics;
    }

    public DeleteTopicRouteTableResponseBody setIsAllSucceed(Boolean isAllSucceed) {
        this.isAllSucceed = isAllSucceed;
        return this;
    }
    public Boolean getIsAllSucceed() {
        return this.isAllSucceed;
    }

    public DeleteTopicRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTopicRouteTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteTopicRouteTableResponseBodyFailureTopics extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<java.util.Map<String, ?>> topic;

        public static DeleteTopicRouteTableResponseBodyFailureTopics build(java.util.Map<String, ?> map) throws Exception {
            DeleteTopicRouteTableResponseBodyFailureTopics self = new DeleteTopicRouteTableResponseBodyFailureTopics();
            return TeaModel.build(map, self);
        }

        public DeleteTopicRouteTableResponseBodyFailureTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
