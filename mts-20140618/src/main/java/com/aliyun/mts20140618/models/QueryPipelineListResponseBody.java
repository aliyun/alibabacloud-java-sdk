// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPipelineListResponseBody extends TeaModel {
    /**
     * <p>The MPS queue IDs that do not exist. This parameter is not returned if all specified MPS queues are found.  </p>
     * <br>
     * <p>>  This parameter is returned if the specified MPS queue IDs that do not exist are valid. Check whether the user ID (UID) that is used to submit the request is the same as the UID to which the queues belong.</p>
     */
    @NameInMap("NonExistPids")
    public QueryPipelineListResponseBodyNonExistPids nonExistPids;

    /**
     * <p>The details of the MPS queues.</p>
     */
    @NameInMap("PipelineList")
    public QueryPipelineListResponseBodyPipelineList pipelineList;

    /**
     * <p>The ID of the request.</p>
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

    public static class QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        /**
         * <p>The tags of the messages.</p>
         */
        @NameInMap("MqTag")
        public String mqTag;

        /**
         * <p>The queue of messages that are received.</p>
         */
        @NameInMap("MqTopic")
        public String mqTopic;

        /**
         * <p>The name of the queue that is created in MNS.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The name of the topic that is created in MNS.</p>
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
        /**
         * <p>The ID of the MPS queue.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the MPS queue.</p>
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
         */
        @NameInMap("QuotaAllocate")
        public Long quotaAllocate;

        /**
         * <p>The role that is assigned to the current RAM user.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The type of the MPS queue. Default value: **Standard**. Valid values:</p>
         * <br>
         * <p>*   **Boost**: MPS queue with transcoding speed boosted</p>
         * <p>*   **Standard**: standard MPS queue</p>
         * <p>*   **NarrowBandHDV2**: MPS queue that supports Narrowband HD 2.0</p>
         * <p>*   **AIVideoCover**: MPS queue for intelligent snapshot capture</p>
         * <p>*   **AIVideoFPShot**: MPS queue for media fingerprinting</p>
         * <p>*   **AIVideoCensor**: MPS queue for automated review</p>
         * <p>*   **AIVideoMCU**: MPS queue for smart tagging</p>
         * <p>*   **AIVideoSummary**: MPS queue for video synopsis</p>
         * <p>*   **AIVideoPorn**: MPS queue for pornography detection in videos</p>
         * <p>*   **AIAudioKWS**: MPS queue for keyword recognition in audio</p>
         * <p>*   **AIAudioASR**: MPS queue for speech-to-text conversion</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <p>The level of the MPS queue.</p>
         */
        @NameInMap("SpeedLevel")
        public Long speedLevel;

        /**
         * <p>The state of the MPS queue. Valid values:</p>
         * <br>
         * <p>*   **Active**: The MPS queue is active.</p>
         * <p>*   **Paused**: The MPS queue is paused.</p>
         */
        @NameInMap("State")
        public String state;

        public static QueryPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineListPipeline self = new QueryPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
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
