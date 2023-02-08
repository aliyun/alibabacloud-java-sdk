// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdatePipelineResponseBody extends TeaModel {
    /**
     * <p>The details of the MPS queue.</p>
     */
    @NameInMap("Pipeline")
    public UpdatePipelineResponseBodyPipeline pipeline;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineResponseBody self = new UpdatePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineResponseBody setPipeline(UpdatePipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdatePipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public UpdatePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePipelineResponseBodyPipelineNotifyConfig extends TeaModel {
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
         * <p>The queue that is created in MNS.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The topic that is created in MNS.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static UpdatePipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineResponseBodyPipelineNotifyConfig self = new UpdatePipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineResponseBodyPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
        }

        public UpdatePipelineResponseBodyPipelineNotifyConfig setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public UpdatePipelineResponseBodyPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdatePipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdatePipelineResponseBodyPipeline extends TeaModel {
        /**
         * <p>The ID of the MPS queue.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The new name of the MPS queue.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The MNS configuration.</p>
         */
        @NameInMap("NotifyConfig")
        public UpdatePipelineResponseBodyPipelineNotifyConfig notifyConfig;

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

        /**
         * <p>The status of the pipeline. Valid values:</p>
         * <br>
         * <p>*   **Active**: The MPS queue is active.</p>
         * <p>*   **Paused**: The MPS queue is paused.</p>
         */
        @NameInMap("State")
        public String state;

        public static UpdatePipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineResponseBodyPipeline self = new UpdatePipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePipelineResponseBodyPipeline setNotifyConfig(UpdatePipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdatePipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public UpdatePipelineResponseBodyPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

        public UpdatePipelineResponseBodyPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdatePipelineResponseBodyPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public UpdatePipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
