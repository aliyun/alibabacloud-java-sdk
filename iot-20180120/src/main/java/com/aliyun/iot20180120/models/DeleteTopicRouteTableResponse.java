// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteTopicRouteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("IsAllSucceed")
    @Validation(required = true)
    public Boolean isAllSucceed;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("FailureTopics")
    @Validation(required = true)
    public DeleteTopicRouteTableResponseFailureTopics failureTopics;

    public static DeleteTopicRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRouteTableResponse self = new DeleteTopicRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRouteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTopicRouteTableResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteTopicRouteTableResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTopicRouteTableResponse setIsAllSucceed(Boolean isAllSucceed) {
        this.isAllSucceed = isAllSucceed;
        return this;
    }
    public Boolean getIsAllSucceed() {
        return this.isAllSucceed;
    }

    public DeleteTopicRouteTableResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteTopicRouteTableResponse setFailureTopics(DeleteTopicRouteTableResponseFailureTopics failureTopics) {
        this.failureTopics = failureTopics;
        return this;
    }
    public DeleteTopicRouteTableResponseFailureTopics getFailureTopics() {
        return this.failureTopics;
    }

    public static class DeleteTopicRouteTableResponseFailureTopics extends TeaModel {
        @NameInMap("Topic")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> topic;

        public static DeleteTopicRouteTableResponseFailureTopics build(java.util.Map<String, ?> map) throws Exception {
            DeleteTopicRouteTableResponseFailureTopics self = new DeleteTopicRouteTableResponseFailureTopics();
            return TeaModel.build(map, self);
        }

        public DeleteTopicRouteTableResponseFailureTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
