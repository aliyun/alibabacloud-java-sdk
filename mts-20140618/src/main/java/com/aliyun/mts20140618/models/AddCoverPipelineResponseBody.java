// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddCoverPipelineResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    public AddCoverPipelineResponseBodyPipeline pipeline;

    @NameInMap("RequestId")
    public String requestId;

    public static AddCoverPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCoverPipelineResponseBody self = new AddCoverPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCoverPipelineResponseBody setPipeline(AddCoverPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddCoverPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public AddCoverPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddCoverPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static AddCoverPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddCoverPipelineResponseBodyPipelineNotifyConfig self = new AddCoverPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public AddCoverPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public AddCoverPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class AddCoverPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public AddCoverPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        public static AddCoverPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddCoverPipelineResponseBodyPipeline self = new AddCoverPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddCoverPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddCoverPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddCoverPipelineResponseBodyPipeline setNotifyConfig(AddCoverPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddCoverPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public AddCoverPipelineResponseBodyPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public AddCoverPipelineResponseBodyPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AddCoverPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
