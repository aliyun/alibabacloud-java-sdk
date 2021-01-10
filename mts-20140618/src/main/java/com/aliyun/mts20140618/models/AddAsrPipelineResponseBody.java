// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddAsrPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pipeline")
    public AddAsrPipelineResponseBodyPipeline pipeline;

    public static AddAsrPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAsrPipelineResponseBody self = new AddAsrPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAsrPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAsrPipelineResponseBody setPipeline(AddAsrPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public AddAsrPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public static class AddAsrPipelineResponseBodyPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static AddAsrPipelineResponseBodyPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AddAsrPipelineResponseBodyPipelineNotifyConfig self = new AddAsrPipelineResponseBodyPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public AddAsrPipelineResponseBodyPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public AddAsrPipelineResponseBodyPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class AddAsrPipelineResponseBodyPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public AddAsrPipelineResponseBodyPipelineNotifyConfig notifyConfig;

        public static AddAsrPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            AddAsrPipelineResponseBodyPipeline self = new AddAsrPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public AddAsrPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddAsrPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddAsrPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AddAsrPipelineResponseBodyPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddAsrPipelineResponseBodyPipeline setNotifyConfig(AddAsrPipelineResponseBodyPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public AddAsrPipelineResponseBodyPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

    }

}
