// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddPornPipelineResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    public AddPornPipelineResponseBodyPipeline pipeline;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPornPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPornPipelineResponseBody self = new AddPornPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPornPipelineResponseBody setPipeline(AddPornPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddPornPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public AddPornPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPornPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static AddPornPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddPornPipelineResponseBodyPipelineNotifyConfig self = new AddPornPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public AddPornPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public AddPornPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class AddPornPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public AddPornPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("State")
        public String state;

        public static AddPornPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddPornPipelineResponseBodyPipeline self = new AddPornPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddPornPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddPornPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPornPipelineResponseBodyPipeline setNotifyConfig(AddPornPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddPornPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public AddPornPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AddPornPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
