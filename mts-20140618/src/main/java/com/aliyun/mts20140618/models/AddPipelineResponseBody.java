// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public AddPipelineResponseBodyPipeline pipeline;

    public static AddPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineResponseBody self = new AddPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddPipelineResponseBody setPipeline(AddPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class AddPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("MqTopic")
        public String mqTopic;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("MqTag")
        public String mqTag;

        @NameInMap("Topic")
        public String topic;

        public static AddPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddPipelineResponseBodyPipelineNotifyConfig self = new AddPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
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

        public AddPipelineResponseBodyPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
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
        @NameInMap("Speed")
        public String speed;

        @NameInMap("State")
        public String state;

        @NameInMap("SpeedLevel")
        public Long speedLevel;

        @NameInMap("NotifyConfig")
        public AddPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Role")
        public String role;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("QuotaAllocate")
        public Long quotaAllocate;

        public static AddPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddPipelineResponseBodyPipeline self = new AddPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddPipelineResponseBodyPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public AddPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddPipelineResponseBodyPipeline setSpeedLevel(Long speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        public AddPipelineResponseBodyPipeline setNotifyConfig(AddPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public AddPipelineResponseBodyPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AddPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddPipelineResponseBodyPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

    }

}
