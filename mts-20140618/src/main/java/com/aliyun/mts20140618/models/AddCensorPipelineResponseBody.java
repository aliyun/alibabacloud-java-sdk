// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddCensorPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public AddCensorPipelineResponseBodyPipeline pipeline;

    public static AddCensorPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCensorPipelineResponseBody self = new AddCensorPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCensorPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCensorPipelineResponseBody setPipeline(AddCensorPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddCensorPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class AddCensorPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static AddCensorPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddCensorPipelineResponseBodyPipelineNotifyConfig self = new AddCensorPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public AddCensorPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public AddCensorPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class AddCensorPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public AddCensorPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static AddCensorPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddCensorPipelineResponseBodyPipeline self = new AddCensorPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddCensorPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddCensorPipelineResponseBodyPipeline setNotifyConfig(AddCensorPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddCensorPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public AddCensorPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AddCensorPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddCensorPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
