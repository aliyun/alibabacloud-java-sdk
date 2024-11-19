// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnsubscribeTopicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The unsub topic list is empty.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FailureTopics")
    public UnsubscribeTopicResponseBodyFailureTopics failureTopics;

    /**
     * <strong>example:</strong>
     * <p>E55<em><strong>B7-4</strong></em>-4***-8***-D3******F565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UnsubscribeTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeTopicResponseBody self = new UnsubscribeTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public UnsubscribeTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnsubscribeTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnsubscribeTopicResponseBody setFailureTopics(UnsubscribeTopicResponseBodyFailureTopics failureTopics) {
        this.failureTopics = failureTopics;
        return this;
    }
    public UnsubscribeTopicResponseBodyFailureTopics getFailureTopics() {
        return this.failureTopics;
    }

    public UnsubscribeTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnsubscribeTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnsubscribeTopicResponseBodyFailureTopics extends TeaModel {
        @NameInMap("topic")
        public java.util.List<java.util.Map<String, ?>> topic;

        public static UnsubscribeTopicResponseBodyFailureTopics build(java.util.Map<String, ?> map) throws Exception {
            UnsubscribeTopicResponseBodyFailureTopics self = new UnsubscribeTopicResponseBodyFailureTopics();
            return TeaModel.build(map, self);
        }

        public UnsubscribeTopicResponseBodyFailureTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
