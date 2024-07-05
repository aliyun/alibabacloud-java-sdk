// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchPipelineResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The MPS queues.</p>
     */
    @NameInMap("PipelineList")
    public SearchPipelineResponseBodyPipelineList pipelineList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>338CA33A-AE83-5DF4-B6F2-C6D3ED8143F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPipelineResponseBody self = new SearchPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPipelineResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchPipelineResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchPipelineResponseBody setPipelineList(SearchPipelineResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public SearchPipelineResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public SearchPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPipelineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchPipelineResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        /**
         * <p>The tags.</p>
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

        public static SearchPipelineResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineListPipelineNotifyConfig self = new SearchPipelineResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
        }

        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class SearchPipelineResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

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
        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

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
         * <p>1</p>
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

        public static SearchPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineListPipeline self = new SearchPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public SearchPipelineResponseBodyPipelineListPipeline setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setNotifyConfig(SearchPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setSpeedLevel(Long speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class SearchPipelineResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<SearchPipelineResponseBodyPipelineListPipeline> pipeline;

        public static SearchPipelineResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineList self = new SearchPipelineResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public SearchPipelineResponseBodyPipelineList setPipeline(java.util.List<SearchPipelineResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<SearchPipelineResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
