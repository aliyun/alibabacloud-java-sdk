// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddPipelineResponseBody extends TeaModel {
    /**
     * <p>The MPS queue.</p>
     */
    @NameInMap("Pipeline")
    public AddPipelineResponseBodyPipeline pipeline;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CFEA608A-5A1C-4C83-A54B-6197BC250D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineResponseBody self = new AddPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPipelineResponseBody setPipeline(AddPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public AddPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
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
         * <p>example1</p>
         */
        @NameInMap("MqTopic")
        public String mqTopic;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>mts-queue-1</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>mts-topic-1</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static AddPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddPipelineResponseBodyPipelineNotifyConfig self = new AddPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public AddPipelineResponseBodyPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
        }

        public AddPipelineResponseBodyPipelineNotifyConfig setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public AddPipelineResponseBodyPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public AddPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class AddPipelineResponseBodyPipeline extends TeaModel {
        /**
         * <p>The ID of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>ed450ea0bfbd41e29f80a401fb4d****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Media Fingerprint</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The MNS configuration.</p>
         */
        @NameInMap("NotifyConfig")
        public AddPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        /**
         * <p>The quota that is allocated to the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QuotaAllocate")
        public Long quotaAllocate;

        /**
         * <p>The role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunMTSDefaultRole</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The type of the MPS queue.</p>
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
         * <p>The state of the MPS queue.</p>
         * <ul>
         * <li>Active: The MPS queue is active. The jobs in the MPS queue are scheduled and transcoded by MPS.</li>
         * <li>Paused: The MPS queue is paused. Jobs in the MPS queue are no longer scheduled for transcoding by MPS. All of the jobs in the MPS queue remain in the Submitted state. Jobs that are being transcoded are not affected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("State")
        public String state;

        public static AddPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddPipelineResponseBodyPipeline self = new AddPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPipelineResponseBodyPipeline setNotifyConfig(AddPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public AddPipelineResponseBodyPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

        public AddPipelineResponseBodyPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AddPipelineResponseBodyPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public AddPipelineResponseBodyPipeline setSpeedLevel(Long speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        public AddPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
