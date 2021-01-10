// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPipelineListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineList")
    public QueryPipelineListResponseBodyPipelineList pipelineList;

    @NameInMap("NonExistPids")
    public QueryPipelineListResponseBodyNonExistPids nonExistPids;

    public static QueryPipelineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineListResponseBody self = new QueryPipelineListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPipelineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPipelineListResponseBody setPipelineList(QueryPipelineListResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public QueryPipelineListResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public QueryPipelineListResponseBody setNonExistPids(QueryPipelineListResponseBodyNonExistPids nonExistPids) {
        this.nonExistPids = nonExistPids;
        return this;
    }
    public QueryPipelineListResponseBodyNonExistPids getNonExistPids() {
        return this.nonExistPids;
    }

    public static class QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("MqTopic")
        public String mqTopic;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("MqTag")
        public String mqTag;

        @NameInMap("Topic")
        public String topic;

        public static QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig self = new QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setMqTag(String mqTag) {
            this.mqTag = mqTag;
            return this;
        }
        public String getMqTag() {
            return this.mqTag;
        }

        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryPipelineListResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Speed")
        public String speed;

        @NameInMap("State")
        public String state;

        @NameInMap("SpeedLevel")
        public Long speedLevel;

        @NameInMap("NotifyConfig")
        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Role")
        public String role;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("QuotaAllocate")
        public Long quotaAllocate;

        public static QueryPipelineListResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineListPipeline self = new QueryPipelineListResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setSpeedLevel(Long speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setNotifyConfig(QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public QueryPipelineListResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryPipelineListResponseBodyPipelineListPipeline setQuotaAllocate(Long quotaAllocate) {
            this.quotaAllocate = quotaAllocate;
            return this;
        }
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

    }

    public static class QueryPipelineListResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<QueryPipelineListResponseBodyPipelineListPipeline> pipeline;

        public static QueryPipelineListResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyPipelineList self = new QueryPipelineListResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyPipelineList setPipeline(java.util.List<QueryPipelineListResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<QueryPipelineListResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

    public static class QueryPipelineListResponseBodyNonExistPids extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryPipelineListResponseBodyNonExistPids build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineListResponseBodyNonExistPids self = new QueryPipelineListResponseBodyNonExistPids();
            return TeaModel.build(map, self);
        }

        public QueryPipelineListResponseBodyNonExistPids setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
