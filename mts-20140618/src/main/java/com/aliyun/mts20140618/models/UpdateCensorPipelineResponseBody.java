// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateCensorPipelineResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    public UpdateCensorPipelineResponseBodyPipeline pipeline;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCensorPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCensorPipelineResponseBody self = new UpdateCensorPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCensorPipelineResponseBody setPipeline(UpdateCensorPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdateCensorPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public UpdateCensorPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateCensorPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static UpdateCensorPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCensorPipelineResponseBodyPipelineNotifyConfig self = new UpdateCensorPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateCensorPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("State")
        public String state;

        public static UpdateCensorPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateCensorPipelineResponseBodyPipeline self = new UpdateCensorPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdateCensorPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCensorPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCensorPipelineResponseBodyPipeline setNotifyConfig(UpdateCensorPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public UpdateCensorPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateCensorPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
