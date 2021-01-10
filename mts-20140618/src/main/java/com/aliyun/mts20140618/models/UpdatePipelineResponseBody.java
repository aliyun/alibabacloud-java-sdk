// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdatePipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public UpdatePipelineResponseBodyPipeline pipeline;

    public static UpdatePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineResponseBody self = new UpdatePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePipelineResponseBody setPipeline(UpdatePipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdatePipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class UpdatePipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("MqTopic")
        public String mqTopic;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("MqTag")
        public String mqTag;

        @NameInMap("Topic")
        public String topic;

        public static UpdatePipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineResponseBodyPipelineNotifyConfig self = new UpdatePipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
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

        public UpdatePipelineResponseBodyPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
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
        @NameInMap("Speed")
        public String speed;

        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public UpdatePipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("Id")
        public String id;

        @NameInMap("QuotaAllocate")
        public Long quotaAllocate;

        public static UpdatePipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineResponseBodyPipeline self = new UpdatePipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
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

        public UpdatePipelineResponseBodyPipeline setNotifyConfig(UpdatePipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdatePipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public UpdatePipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePipelineResponseBodyPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdatePipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePipelineResponseBodyPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

    }

}
