// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddTerrorismPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public AddTerrorismPipelineResponseBodyPipeline pipeline;

    public static AddTerrorismPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTerrorismPipelineResponseBody self = new AddTerrorismPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTerrorismPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTerrorismPipelineResponseBody setPipeline(AddTerrorismPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddTerrorismPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class AddTerrorismPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static AddTerrorismPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddTerrorismPipelineResponseBodyPipelineNotifyConfig self = new AddTerrorismPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public AddTerrorismPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public AddTerrorismPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class AddTerrorismPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public AddTerrorismPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static AddTerrorismPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddTerrorismPipelineResponseBodyPipeline self = new AddTerrorismPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddTerrorismPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddTerrorismPipelineResponseBodyPipeline setNotifyConfig(AddTerrorismPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddTerrorismPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public AddTerrorismPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AddTerrorismPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddTerrorismPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
