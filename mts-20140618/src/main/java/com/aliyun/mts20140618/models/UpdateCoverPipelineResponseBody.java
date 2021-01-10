// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateCoverPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public UpdateCoverPipelineResponseBodyPipeline pipeline;

    public static UpdateCoverPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoverPipelineResponseBody self = new UpdateCoverPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCoverPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCoverPipelineResponseBody setPipeline(UpdateCoverPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdateCoverPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class UpdateCoverPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static UpdateCoverPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCoverPipelineResponseBodyPipelineNotifyConfig self = new UpdateCoverPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCoverPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateCoverPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class UpdateCoverPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Role")
        public String role;

        @NameInMap("NotifyConfig")
        public UpdateCoverPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        public static UpdateCoverPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateCoverPipelineResponseBodyPipeline self = new UpdateCoverPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdateCoverPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCoverPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCoverPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateCoverPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateCoverPipelineResponseBodyPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateCoverPipelineResponseBodyPipeline setNotifyConfig(UpdateCoverPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public UpdateCoverPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

    }

}
