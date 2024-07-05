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
     * 
     * <strong>example:</strong>
     * <p>1FE0F96B-544D-4244-9D83-DFCFB0E5A231</p>
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
         * <p>The queue that is created in MNS.</p>
         * 
         * <strong>example:</strong>
         * <p>example-queue-****</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The topic that is created in MNS.</p>
         * 
         * <strong>example:</strong>
         * <p>example-topic-****</p>
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
         * 
         * <strong>example:</strong>
         * <p>d1ce4d3efcb549419193f50f1fcd****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The new name of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>example-pipeline-****</p>
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
         * <p>AliyunMTSExampleRole</p>
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
