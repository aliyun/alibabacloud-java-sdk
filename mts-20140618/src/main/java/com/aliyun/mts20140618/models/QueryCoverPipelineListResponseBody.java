// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCoverPipelineListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineList")
    public QueryCoverPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("NonExistIds")
    public QueryCoverPipelineListResponseBodyNonExistIds nonExistIds;

    public static QueryCoverPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCoverPipelineListResponseBody self = new QueryCoverPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCoverPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCoverPipelineListResponseBody setPipelineList(QueryCoverPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryCoverPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryCoverPipelineListResponseBody setNonExistIds(QueryCoverPipelineListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryCoverPipelineListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class QueryCoverPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public QueryCoverPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Role")
        public String role;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static QueryCoverPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverPipelineListResponseBodyPipelineListPipeline self = new QueryCoverPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCoverPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

}
