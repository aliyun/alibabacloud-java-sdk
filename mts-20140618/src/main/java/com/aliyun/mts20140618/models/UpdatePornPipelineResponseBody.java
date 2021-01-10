// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdatePornPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public UpdatePornPipelineResponseBodyPipeline pipeline;

    public static UpdatePornPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePornPipelineResponseBody self = new UpdatePornPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePornPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePornPipelineResponseBody setPipeline(UpdatePornPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdatePornPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class UpdatePornPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static UpdatePornPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePornPipelineResponseBodyPipelineNotifyConfig self = new UpdatePornPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePornPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdatePornPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class UpdatePornPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("NotifyConfig")
        public UpdatePornPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        public static UpdatePornPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdatePornPipelineResponseBodyPipeline self = new UpdatePornPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdatePornPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePornPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePornPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdatePornPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdatePornPipelineResponseBodyPipeline setNotifyConfig(UpdatePornPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdatePornPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

    }

}
