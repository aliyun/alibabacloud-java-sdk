// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The list of topics returned if the call fails.</p>
     */
    @NameInMap("FailureTopics")
    public CreateTopicRouteTableResponseBodyFailureTopics failureTopics;

    /**
     * <p>Indicates whether all the message routing relationships between topics are established.</p>
     * <br>
     * <p>*   **true**: All the message routing relationships between topics are established.</p>
     * <p>*   **false**: Not all the message routing relationships between topics are established.</p>
     */
    @NameInMap("IsAllSucceed")
    public Boolean isAllSucceed;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
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
        public java.util.List<java.util.Map<String, ?>> topic;

        public static CreateTopicRouteTableResponseBodyFailureTopics build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRouteTableResponseBodyFailureTopics self = new CreateTopicRouteTableResponseBodyFailureTopics();
            return TeaModel.build(map, self);
        }

        public CreateTopicRouteTableResponseBodyFailureTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
