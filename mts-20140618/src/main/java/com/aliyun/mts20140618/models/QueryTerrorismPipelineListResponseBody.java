// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTerrorismPipelineListResponseBody extends TeaModel {
    @NameInMap("NonExistIds")
    public QueryTerrorismPipelineListResponseBodyNonExistIds nonExistIds;

    @NameInMap("PipelineList")
    public QueryTerrorismPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTerrorismPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTerrorismPipelineListResponseBody self = new QueryTerrorismPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTerrorismPipelineListResponseBody setNonExistIds(QueryTerrorismPipelineListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryTerrorismPipelineListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryTerrorismPipelineListResponseBody setPipelineList(QueryTerrorismPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryTerrorismPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryTerrorismPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTerrorismPipelineListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryTerrorismPipelineListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismPipelineListResponseBodyNonExistIds self = new QueryTerrorismPipelineListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismPipelineListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryTerrorismPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("State")
        public String state;

        public static QueryTerrorismPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismPipelineListResponseBodyPipelineListPipeline self = new QueryTerrorismPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryTerrorismPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryTerrorismPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryTerrorismPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryTerrorismPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryTerrorismPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismPipelineListResponseBodyPipelineList self = new QueryTerrorismPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryTerrorismPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryTerrorismPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
