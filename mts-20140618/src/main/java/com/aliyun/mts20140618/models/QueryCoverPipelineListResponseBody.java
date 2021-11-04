// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCoverPipelineListResponseBody extends TeaModel {
    @NameInMap("NonExistIds")
    public QueryCoverPipelineListResponseBodyNonExistIds nonExistIds;

    @NameInMap("PipelineList")
    public QueryCoverPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCoverPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCoverPipelineListResponseBody self = new QueryCoverPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCoverPipelineListResponseBody setNonExistIds(QueryCoverPipelineListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryCoverPipelineListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryCoverPipelineListResponseBody setPipelineList(QueryCoverPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryCoverPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryCoverPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCoverPipelineListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryCoverPipelineListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverPipelineListResponseBodyNonExistIds self = new QueryCoverPipelineListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryCoverPipelineListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("Topic")
        public String topic;

        public static QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryCoverPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        public static QueryCoverPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverPipelineListResponseBodyPipelineListPipeline self = new QueryCoverPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryCoverPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryCoverPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryCoverPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverPipelineListResponseBodyPipelineList self = new QueryCoverPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryCoverPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryCoverPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryCoverPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
