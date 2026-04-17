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
        @NameInMap("Generation")
        public Long generation;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("LastRebalanceTimestamp")
        public Long lastRebalanceTimestamp;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RebalanceSuccess")
        public Boolean rebalanceSuccess;

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
        @NameInMap("Accumulate")
        public Long accumulate;

        @NameInMap("BrokerOffset")
        public Long brokerOffset;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ConsumerOffset")
        public Long consumerOffset;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("Partition")
        public Integer partition;

        public static GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList self = new GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList();
            return TeaModel.build(map, self);
        }

        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetListOffsetList setAccumulate(Long accumulate) {
            this.accumulate = accumulate;
            return this;
        }
        public Long getAccumulate() {
            return this.accumulate;
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
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("OffsetList")
        public GetConsumerProgressResponseBodyConsumerProgressTopicListTopicListOffsetList offsetList;

        @NameInMap("Topic")
        public String topic;

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

        @NameInMap("RebalanceInfoList")
        public GetConsumerProgressResponseBodyConsumerProgressRebalanceInfoList rebalanceInfoList;

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

        @NameInMap("state")
        public String state;

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

        public GetConsumerProgressResponseBodyConsumerProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
