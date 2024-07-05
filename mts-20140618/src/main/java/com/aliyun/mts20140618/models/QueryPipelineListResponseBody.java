// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPipelineListResponseBody extends TeaModel {
    /**
     * <p>The IDs of MPS queues that do not exist.</p>
     */
    @NameInMap("NonExistPids")
    public QueryPipelineListResponseBodyNonExistPids nonExistPids;

    /**
     * <p>The MPS queues.</p>
     */
    @NameInMap("PipelineList")
    public QueryPipelineListResponseBodyPipelineList pipelineList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1C538EAA-ACAF-5AD8-B091-A72C63007149</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineListResponseBody self = new QueryPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPipelineListResponseBody setNonExistPids(QueryPipelineListResponseBodyNonExistPids nonExistPids) {
        this.nonExistPids = nonExistPids;
        return this;
    }
    public QueryPipelineListResponseBodyNonExistPids getNonExistPids() {
        return this.nonExistPids;
    }

    public QueryPipelineListResponseBody setPipelineList(QueryPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPipelineListResponseBodyNonExistPids extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryPipelineListResponseBodyNonExistPids build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyNonExistPids self = new QueryPipelineListResponseBodyNonExistPids();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyNonExistPids setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryPipelineListResponseBodyPipelineListPipelineExtendConfig extends TeaModel {
        @NameInMap("IsBoostNew")
        public Boolean isBoostNew;

        @NameInMap("MaxMultiSpeed")
        public Integer maxMultiSpeed;

        @NameInMap("MultiSpeedDowngradePolicy")
        public String multiSpeedDowngradePolicy;

        public static QueryPipelineListResponseBodyPipelineListPipelineExtendConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineListPipelineExtendConfig self = new QueryPipelineListResponseBodyPipelineListPipelineExtendConfig();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineListPipelineExtendConfig setIsBoostNew(Boolean isBoostNew) {
            this.isBoostNew = isBoostNew;
            return this;
        }
        public Boolean getIsBoostNew() {
            return this.isBoostNew;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineExtendConfig setMaxMultiSpeed(Integer maxMultiSpeed) {
            this.maxMultiSpeed = maxMultiSpeed;
            return this;
        }
        public Integer getMaxMultiSpeed() {
            return this.maxMultiSpeed;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineExtendConfig setMultiSpeedDowngradePolicy(String multiSpeedDowngradePolicy) {
            this.multiSpeedDowngradePolicy = multiSpeedDowngradePolicy;
            return this;
        }
        public String getMultiSpeedDowngradePolicy() {
            return this.multiSpeedDowngradePolicy;
        }

    }

    public static class QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        /**
         * <p>The tag string.</p>
         * 
         * <strong>example:</strong>
         * <p>mts-test</p>
         */
        @NameInMap("MqTag")
        public String mqTag;

        /**
         * <p>The queue of messages that are received.</p>
         * 
         * <strong>example:</strong>
         * <p>example1,example2</p>
         */
        @NameInMap("MqTopic")
        public String mqTopic;

        /**
         * <p>The name of the queue that is created in MNS.</p>
         * 
         * <strong>example:</strong>
         * <p>example-queue-****</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The name of the topic that is created in MNS.</p>
         * 
         * <strong>example:</strong>
         * <p>example-topic-****</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("ExtendConfig")
        public QueryPipelineListResponseBodyPipelineListPipelineExtendConfig extendConfig;

        /**
         * <p>The ID of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>d1ce4d3efcb549419193f50f1fcd****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>example-pipeline-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Message Service (MNS) configuration.</p>
         */
        @NameInMap("NotifyConfig")
        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        /**
         * <p>The quota that is allocated to the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QuotaAllocate")
        public Long quotaAllocate;

        /**
         * <p>The role that is assigned to the current RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunMTSDefaultRole</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The type of the MPS queue. Default value: <strong>Standard</strong>. Valid values:</p>
         * <ul>
         * <li><strong>Boost</strong>: MPS queue with transcoding speed boosted</li>
         * <li><strong>Standard</strong>: standard MPS queue</li>
         * <li><strong>NarrowBandHDV2</strong>: MPS queue that supports Narrowband HD 2.0</li>
         * <li><strong>AIVideoCover</strong>: MPS queue for intelligent snapshot capture</li>
         * <li><strong>AIVideoFPShot</strong>: MPS queue for media fingerprinting</li>
         * <li><strong>AIVideoCensor</strong>: MPS queue for automated review</li>
         * <li><strong>AIVideoMCU</strong>: MPS queue for smart tagging</li>
         * <li><strong>AIVideoSummary</strong>: MPS queue for video synopsis</li>
         * <li><strong>AIVideoPorn</strong>: MPS queue for pornography detection in videos</li>
         * <li><strong>AIAudioKWS</strong>: MPS queue for keyword recognition in audio</li>
         * <li><strong>AIAudioASR</strong>: MPS queue for speech-to-text conversion</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <p>The level of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SpeedLevel")
        public Long speedLevel;

        /**
         * <p>The state of the MPS queue. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The MPS queue is active.</li>
         * <li><strong>Paused</strong>: The MPS queue is paused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Paused</p>
         */
        @NameInMap("State")
        public String state;

        public static QueryPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineListPipeline self = new QueryPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setExtendConfig(QueryPipelineListResponseBodyPipelineListPipelineExtendConfig extendConfig) {
            this.extendConfig = extendConfig;
            return this;
        }
        public QueryPipelineListResponseBodyPipelineListPipelineExtendConfig getExtendConfig() {
            return this.extendConfig;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setSpeedLevel(Long speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineList self = new QueryPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
