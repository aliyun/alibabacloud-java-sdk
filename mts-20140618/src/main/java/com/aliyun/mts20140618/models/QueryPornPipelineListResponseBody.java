// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPornPipelineListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineList")
    public QueryPornPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("NonExistIds")
    public QueryPornPipelineListResponseBodyNonExistIds nonExistIds;

    public static QueryPornPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPornPipelineListResponseBody self = new QueryPornPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPornPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPornPipelineListResponseBody setPipelineList(QueryPornPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryPornPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryPornPipelineListResponseBody setNonExistIds(QueryPornPipelineListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryPornPipelineListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class QueryPornPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static QueryPornPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryPornPipelineListResponseBodyPipelineListPipeline self = new QueryPornPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryPornPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryPornPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryPornPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryPornPipelineListResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryPornPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPornPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryPornPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryPornPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryPornPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryPornPipelineListResponseBodyPipelineList self = new QueryPornPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryPornPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryPornPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryPornPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

    public static class QueryPornPipelineListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryPornPipelineListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryPornPipelineListResponseBodyNonExistIds self = new QueryPornPipelineListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryPornPipelineListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
