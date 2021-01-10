// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAsrPipelineListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineList")
    public QueryAsrPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("NonExistIds")
    public QueryAsrPipelineListResponseBodyNonExistIds nonExistIds;

    public static QueryAsrPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAsrPipelineListResponseBody self = new QueryAsrPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAsrPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAsrPipelineListResponseBody setPipelineList(QueryAsrPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryAsrPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryAsrPipelineListResponseBody setNonExistIds(QueryAsrPipelineListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryAsrPipelineListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("Topic")
        public String topic;

        public static QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryAsrPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static QueryAsrPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrPipelineListResponseBodyPipelineListPipeline self = new QueryAsrPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryAsrPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAsrPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryAsrPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryAsrPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryAsrPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrPipelineListResponseBodyPipelineList self = new QueryAsrPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryAsrPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryAsrPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryAsrPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

    public static class QueryAsrPipelineListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryAsrPipelineListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrPipelineListResponseBodyNonExistIds self = new QueryAsrPipelineListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryAsrPipelineListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
