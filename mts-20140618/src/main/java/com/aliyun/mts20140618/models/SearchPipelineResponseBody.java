// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchPipelineResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The details of the MPS queues.</p>
     */
    @NameInMap("PipelineList")
    public SearchPipelineResponseBodyPipelineList pipelineList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
        @NameInMap("MqTag")
        public String mqTag;

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
         * <p>The MNS notification configuration.</p>
         */
        @NameInMap("NotifyConfig")
        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

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
         * <p>*   **Boost**: MPS queue with transcoding speed boosted.</p>
         * <p>*   **Standard**: standard MPS queue.</p>
         * <p>*   **NarrowBandHDV2**: MPS queue that supports Narrowband HD™ 2.0.</p>
         * <p>*   **AIVideoCover**: MPS queue for intelligent snapshot capture.</p>
         * <p>*   **AIVideoFPShot**: MPS queue for media fingerprinting.</p>
         * <p>*   **AIVideoCensor**: MPS queue for automated review.</p>
         * <p>*   **AIVideoMCU**: MPS queue for smart tagging.</p>
         * <p>*   **AIVideoSummary**: MPS queue for video synopsis.</p>
         * <p>*   **AIVideoPorn**: MPS queue for pornography detection in videos.</p>
         * <p>*   **AIAudioKWS**: MPS queue for keyword recognition in audio.</p>
         * <p>*   **AIAudioASR**: MPS queue for speech-to-text conversion.</p>
         */
        @NameInMap("Speed")
        public String speed;

        @NameInMap("SpeedLevel")
        public Long speedLevel;

        /**
         * <p>The status of the pipeline. Valid values:</p>
         * <br>
         * <p>*   **Active**: The MPS queue is active.</p>
         * <p>*   **Paused**: The MPS queue is paused.</p>
         */
        @NameInMap("State")
        public String state;

        public static SearchPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineListPipeline self = new SearchPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
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
