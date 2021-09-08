// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableResponse extends TeaModel {
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
    public CreateTopicRouteTableResponseFailureTopics failureTopics;

    public static CreateTopicRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRouteTableResponse self = new CreateTopicRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTopicRouteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTopicRouteTableResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateTopicRouteTableResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTopicRouteTableResponse setIsAllSucceed(Boolean isAllSucceed) {
        this.isAllSucceed = isAllSucceed;
        return this;
    }
    public Boolean getIsAllSucceed() {
        return this.isAllSucceed;
    }

    public CreateTopicRouteTableResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTopicRouteTableResponse setFailureTopics(CreateTopicRouteTableResponseFailureTopics failureTopics) {
        this.failureTopics = failureTopics;
        return this;
    }
    public CreateTopicRouteTableResponseFailureTopics getFailureTopics() {
        return this.failureTopics;
    }

    public static class CreateTopicRouteTableResponseFailureTopics extends TeaModel {
        @NameInMap("Topic")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> topic;

        public static CreateTopicRouteTableResponseFailureTopics build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRouteTableResponseFailureTopics self = new CreateTopicRouteTableResponseFailureTopics();
            return TeaModel.build(map, self);
        }

        public CreateTopicRouteTableResponseFailureTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
