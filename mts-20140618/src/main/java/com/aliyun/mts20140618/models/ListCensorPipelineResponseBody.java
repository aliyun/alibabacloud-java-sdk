// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCensorPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PipelineList")
    public ListCensorPipelineResponseBodyPipelineList pipelineList;

    public static ListCensorPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCensorPipelineResponseBody self = new ListCensorPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCensorPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCensorPipelineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCensorPipelineResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCensorPipelineResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCensorPipelineResponseBody setPipelineList(ListCensorPipelineResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public ListCensorPipelineResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public static class ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig self = new ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class ListCensorPipelineResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("NotifyConfig")
        public ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        public static ListCensorPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            ListCensorPipelineResponseBodyPipelineListPipeline self = new ListCensorPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public ListCensorPipelineResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCensorPipelineResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCensorPipelineResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCensorPipelineResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListCensorPipelineResponseBodyPipelineListPipeline setNotifyConfig(ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public ListCensorPipelineResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

    }

    public static class ListCensorPipelineResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<ListCensorPipelineResponseBodyPipelineListPipeline> pipeline;

        public static ListCensorPipelineResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            ListCensorPipelineResponseBodyPipelineList self = new ListCensorPipelineResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public ListCensorPipelineResponseBodyPipelineList setPipeline(java.util.List<ListCensorPipelineResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<ListCensorPipelineResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
