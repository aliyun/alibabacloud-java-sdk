// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SearchPipelineResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PipelineList")
    public SearchPipelineResponseBodyPipelineList pipelineList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPipelineResponseBody self = new SearchPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPipelineResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchPipelineResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchPipelineResponseBody setPipelineList(SearchPipelineResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public SearchPipelineResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public SearchPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPipelineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchPipelineResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("Topic")
        public String topic;

        public static SearchPipelineResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineListPipelineNotifyConfig self = new SearchPipelineResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class SearchPipelineResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Role")
        public String role;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("SpeedLevel")
        public Long speedLevel;

        @NameInMap("State")
        public String state;

        public static SearchPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineListPipeline self = new SearchPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public SearchPipelineResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setNotifyConfig(SearchPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public SearchPipelineResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setSpeedLevel(Long speedLevel) {
            this.speedLevel = speedLevel;
            return this;
        }
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        public SearchPipelineResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class SearchPipelineResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<SearchPipelineResponseBodyPipelineListPipeline> pipeline;

        public static SearchPipelineResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            SearchPipelineResponseBodyPipelineList self = new SearchPipelineResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public SearchPipelineResponseBodyPipelineList setPipeline(java.util.List<SearchPipelineResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<SearchPipelineResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
