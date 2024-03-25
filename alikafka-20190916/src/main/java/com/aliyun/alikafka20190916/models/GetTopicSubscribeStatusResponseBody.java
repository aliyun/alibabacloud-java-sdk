// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicSubscribeStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The subscription details.</p>
     */
    @NameInMap("TopicSubscribeStatus")
    public GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus topicSubscribeStatus;

    public static GetTopicSubscribeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicSubscribeStatusResponseBody self = new GetTopicSubscribeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicSubscribeStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTopicSubscribeStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicSubscribeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicSubscribeStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicSubscribeStatusResponseBody setTopicSubscribeStatus(GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus topicSubscribeStatus) {
        this.topicSubscribeStatus = topicSubscribeStatus;
        return this;
    }
    public GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus getTopicSubscribeStatus() {
        return this.topicSubscribeStatus;
    }

    public static class GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus extends TeaModel {
        /**
         * <p>The groups that subscribe to the topic.</p>
         */
        @NameInMap("ConsumerGroups")
        public java.util.List<String> consumerGroups;

        /**
         * <p>The topic name.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus self = new GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus();
            return TeaModel.build(map, self);
        }

        public GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus setConsumerGroups(java.util.List<String> consumerGroups) {
            this.consumerGroups = consumerGroups;
            return this;
        }
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        public GetTopicSubscribeStatusResponseBodyTopicSubscribeStatus setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
