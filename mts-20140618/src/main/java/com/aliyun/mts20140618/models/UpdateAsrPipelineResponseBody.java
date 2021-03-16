// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateAsrPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public UpdateAsrPipelineResponseBodyPipeline pipeline;

    public static UpdateAsrPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAsrPipelineResponseBody self = new UpdateAsrPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAsrPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAsrPipelineResponseBody setPipeline(UpdateAsrPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdateAsrPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class UpdateAsrPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("Topic")
        public String topic;

        public static UpdateAsrPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAsrPipelineResponseBodyPipelineNotifyConfig self = new UpdateAsrPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAsrPipelineResponseBodyPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateAsrPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateAsrPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public UpdateAsrPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static UpdateAsrPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateAsrPipelineResponseBodyPipeline self = new UpdateAsrPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdateAsrPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateAsrPipelineResponseBodyPipeline setNotifyConfig(UpdateAsrPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdateAsrPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public UpdateAsrPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateAsrPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAsrPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
