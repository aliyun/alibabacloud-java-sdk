// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerProgressResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The consumption status of the consumer group.</p>
     */
    @NameInMap("ConsumerProgress")
    public GetConsumerProgressResponseBodyConsumerProgress consumerProgress;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetConsumerProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerProgressResponseBody self = new GetConsumerProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerProgressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetConsumerProgressResponseBody setConsumerProgress(GetConsumerProgressResponseBodyConsumerProgress consumerProgress) {
        this.consumerProgress = consumerProgress;
        return this;
    }
    public GetConsumerProgressResponseBodyConsumerProgress getConsumerProgress() {
        return this.consumerProgress;
    }

    public GetConsumerProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList extends TeaModel {
        /**
         * <p>The latest offset in the partition of the topic.</p>
         */
        @NameInMap("BrokerOffset")
        public Long brokerOffset;

        /**
         * <p>The consumer offset in the partition of the topic.</p>
         */
        @NameInMap("ConsumerOffset")
        public Long consumerOffset;

        /**
         * <p>The time when the last consumed message in the partition was generated.</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>The ID of the partition.</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        public static GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList self = new GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setBrokerOffset(Long brokerOffset) {
            this.brokerOffset = brokerOffset;
            return this;
        }
        public Long getBrokerOffset() {
            return this.brokerOffset;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setConsumerOffset(Long consumerOffset) {
            this.consumerOffset = consumerOffset;
            return this;
        }
        public Long getConsumerOffset() {
            return this.consumerOffset;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

    public static class GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList extends TeaModel {
        @NameInMap("OffsetList")
        public java.util.List<GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList> offsetList;

        public static GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList self = new GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList setOffsetList(java.util.List<GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList> offsetList) {
            this.offsetList = offsetList;
            return this;
        }
        public java.util.List<GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList> getOffsetList() {
            return this.offsetList;
        }

    }

    public static class GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList extends TeaModel {
        /**
         * <p>The time when the last consumed message in the topic was generated.</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>The information about offsets in the topic.</p>
         */
        @NameInMap("OffsetList")
        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList offsetList;

        /**
         * <p>The name of the topic.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The number of messages that were not consumed in the topic. This is also known as the number of accumulated messages in the topic.</p>
         */
        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList self = new GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList setOffsetList(GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList offsetList) {
            this.offsetList = offsetList;
            return this;
        }
        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList getOffsetList() {
            return this.offsetList;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

    public static class GetConsumerProgressResponseBodyConsumerProgressTopicList extends TeaModel {
        @NameInMap("TopicList")
        public java.util.List<GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList> topicList;

        public static GetConsumerProgressResponseBodyConsumerProgressTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressTopicList self = new GetConsumerProgressResponseBodyConsumerProgressTopicList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicList setTopicList(java.util.List<GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList> topicList) {
            this.topicList = topicList;
            return this;
        }
        public java.util.List<GetConsumerProgressResponseBodyConsumerProgressTopicListTopicList> getTopicList() {
            return this.topicList;
        }

    }

    public static class GetConsumerProgressResponseBodyConsumerProgress extends TeaModel {
        /**
         * <p>The time when the last message consumed by the consumer group was generated.</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>The consumption progress of each topic to which the consumer group is subscribed.</p>
         */
        @NameInMap("TopicList")
        public GetConsumerProgressResponseBodyConsumerProgressTopicList topicList;

        /**
         * <p>The number of messages that were not consumed in all topics. This is also known as the number of accumulated messages in all topics.</p>
         */
        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static GetConsumerProgressResponseBodyConsumerProgress build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgress self = new GetConsumerProgressResponseBodyConsumerProgress();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgress setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetConsumerProgressResponseBodyConsumerProgress setTopicList(GetConsumerProgressResponseBodyConsumerProgressTopicList topicList) {
            this.topicList = topicList;
            return this;
        }
        public GetConsumerProgressResponseBodyConsumerProgressTopicList getTopicList() {
            return this.topicList;
        }

        public GetConsumerProgressResponseBodyConsumerProgress setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

}
