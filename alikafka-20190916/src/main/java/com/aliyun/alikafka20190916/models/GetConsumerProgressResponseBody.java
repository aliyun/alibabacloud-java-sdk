// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerProgressResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. If the request is successful, 200 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The consumer progress of the consumer group.</p>
     */
    @NameInMap("ConsumerProgress")
    public GetConsumerProgressResponseBodyConsumerProgress consumerProgress;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>252820E1-A2E6-45F2-B4C9-1056B8CE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static class GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList extends TeaModel {
        /**
         * <p>The number of rebalances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Generation")
        public Long generation;

        /**
         * <p>The group ID of the subscriber.</p>
         * 
         * <strong>example:</strong>
         * <p>falcon-uat</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the last rebalance occurred. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1709199270</p>
         */
        @NameInMap("LastRebalanceTimestamp")
        public Long lastRebalanceTimestamp;

        /**
         * <p>The cause of the rebalance.</p>
         * 
         * <strong>example:</strong>
         * <p>removing member consumer-1-cd14eb9c-379b-4b8e-9bbd-76f147f8536f on LeaveGroup</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether new members are added to the consumer group in the rebalance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RebalanceSuccess")
        public Boolean rebalanceSuccess;

        /**
         * <p>The duration of the rebalance. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RebalanceTimeConsuming")
        public Long rebalanceTimeConsuming;

        public static GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList self = new GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList setGeneration(Long generation) {
            this.generation = generation;
            return this;
        }
        public Long getGeneration() {
            return this.generation;
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList setLastRebalanceTimestamp(Long lastRebalanceTimestamp) {
            this.lastRebalanceTimestamp = lastRebalanceTimestamp;
            return this;
        }
        public Long getLastRebalanceTimestamp() {
            return this.lastRebalanceTimestamp;
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList setRebalanceSuccess(Boolean rebalanceSuccess) {
            this.rebalanceSuccess = rebalanceSuccess;
            return this;
        }
        public Boolean getRebalanceSuccess() {
            return this.rebalanceSuccess;
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList setRebalanceTimeConsuming(Long rebalanceTimeConsuming) {
            this.rebalanceTimeConsuming = rebalanceTimeConsuming;
            return this;
        }
        public Long getRebalanceTimeConsuming() {
            return this.rebalanceTimeConsuming;
        }

    }

    public static class GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList extends TeaModel {
        @NameInMap("RebalanceInfoList")
        public java.util.List<GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList> rebalanceInfoList;

        public static GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList self = new GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList setRebalanceInfoList(java.util.List<GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList> rebalanceInfoList) {
            this.rebalanceInfoList = rebalanceInfoList;
            return this;
        }
        public java.util.List<GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoListRebalanceInfoList> getRebalanceInfoList() {
            return this.rebalanceInfoList;
        }

    }

    public static class GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList extends TeaModel {
        /**
         * <p>The latest offset in the partition of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("BrokerOffset")
        public Long brokerOffset;

        /**
         * <p>Client ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>client-id-KafkaConsumerDemo</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.11.3</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The consumer offset in the partition of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("ConsumerOffset")
        public Long consumerOffset;

        /**
         * <p>The time when the last consumed message in the partition was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1566874931649</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>Member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>client-id-KafkaConsumerDemo-70b64883-a911-4882-8084-598b958848b4</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The partition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
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

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
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
         * 
         * <strong>example:</strong>
         * <p>1566874931649</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>The consumer offsets.</p>
         */
        @NameInMap("OffsetList")
        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList offsetList;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-test</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The number of unconsumed messages in the topic to which the consumer group subscribes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * 
         * <strong>example:</strong>
         * <p>1566874931671</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>The details of rebalances in the consumer group.</p>
         */
        @NameInMap("RebalanceInfoList")
        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList rebalanceInfoList;

        /**
         * <p>The consumer progress of each topic to which the consumer group subscribes.</p>
         */
        @NameInMap("TopicList")
        public GetConsumerProgressResponseBodyConsumerProgressTopicList topicList;

        /**
         * <p>The total number of unconsumed messages in all topics to which the consumer group subscribes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public GetConsumerProgressResponseBodyConsumerProgress setRebalanceInfoList(GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList rebalanceInfoList) {
            this.rebalanceInfoList = rebalanceInfoList;
            return this;
        }
        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList getRebalanceInfoList() {
            return this.rebalanceInfoList;
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
