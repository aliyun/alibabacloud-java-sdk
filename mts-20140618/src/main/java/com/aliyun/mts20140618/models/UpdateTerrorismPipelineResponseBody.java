// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateTerrorismPipelineResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    public UpdateTerrorismPipelineResponseBodyPipeline pipeline;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTerrorismPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTerrorismPipelineResponseBody self = new UpdateTerrorismPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTerrorismPipelineResponseBody setPipeline(UpdateTerrorismPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdateTerrorismPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public UpdateTerrorismPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig self = new UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateTerrorismPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("State")
        public String state;

        public static UpdateTerrorismPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateTerrorismPipelineResponseBodyPipeline self = new UpdateTerrorismPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdateTerrorismPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateTerrorismPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTerrorismPipelineResponseBodyPipeline setNotifyConfig(UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdateTerrorismPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public UpdateTerrorismPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateTerrorismPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
