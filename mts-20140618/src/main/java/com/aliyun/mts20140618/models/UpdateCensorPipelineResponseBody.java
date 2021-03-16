// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateCensorPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public UpdateCensorPipelineResponseBodyPipeline pipeline;

    public static UpdateCensorPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCensorPipelineResponseBody self = new UpdateCensorPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCensorPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCensorPipelineResponseBody setPipeline(UpdateCensorPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdateCensorPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class UpdateCensorPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static UpdateCensorPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCensorPipelineResponseBodyPipelineNotifyConfig self = new UpdateCensorPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class UpdateCensorPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public UpdateCensorPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static UpdateCensorPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateCensorPipelineResponseBodyPipeline self = new UpdateCensorPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdateCensorPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

        public UpdateCensorPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCensorPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
