// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FailureTopics")
    public CreateTopicRouteTableResponseBodyFailureTopics failureTopics;

    @NameInMap("IsAllSucceed")
    public Boolean isAllSucceed;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTopicRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRouteTableResponseBody self = new CreateTopicRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTopicRouteTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTopicRouteTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTopicRouteTableResponseBody setFailureTopics(CreateTopicRouteTableResponseBodyFailureTopics failureTopics) {
        this.failureTopics = failureTopics;
        return this;
    }
    public CreateTopicRouteTableResponseBodyFailureTopics getFailureTopics() {
        return this.failureTopics;
    }

    public CreateTopicRouteTableResponseBody setIsAllSucceed(Boolean isAllSucceed) {
        this.isAllSucceed = isAllSucceed;
        return this;
    }
    public Boolean getIsAllSucceed() {
        return this.isAllSucceed;
    }

    public CreateTopicRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTopicRouteTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTopicRouteTableResponseBodyFailureTopics extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<java.util.Map<String, String>> topic;

        public static CreateTopicRouteTableResponseBodyFailureTopics build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRouteTableResponseBodyFailureTopics self = new CreateTopicRouteTableResponseBodyFailureTopics();
            return TeaModel.build(map, self);
        }

        public CreateTopicRouteTableResponseBodyFailureTopics setTopic(java.util.List<java.util.Map<String, String>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getTopic() {
            return this.topic;
        }

    }

}
