// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAsrPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PipelineList")
    public ListAsrPipelineResponseBodyPipelineList pipelineList;

    public static ListAsrPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsrPipelineResponseBody self = new ListAsrPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsrPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsrPipelineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListAsrPipelineResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAsrPipelineResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAsrPipelineResponseBody setPipelineList(ListAsrPipelineResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public ListAsrPipelineResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public static class ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("QueueName")
        public String queueName;

        public static ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig self = new ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class ListAsrPipelineResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("NotifyConfig")
        public ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        public static ListAsrPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            ListAsrPipelineResponseBodyPipelineListPipeline self = new ListAsrPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public ListAsrPipelineResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAsrPipelineResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAsrPipelineResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAsrPipelineResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListAsrPipelineResponseBodyPipelineListPipeline setNotifyConfig(ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public ListAsrPipelineResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

    }

    public static class ListAsrPipelineResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<ListAsrPipelineResponseBodyPipelineListPipeline> pipeline;

        public static ListAsrPipelineResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            ListAsrPipelineResponseBodyPipelineList self = new ListAsrPipelineResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public ListAsrPipelineResponseBodyPipelineList setPipeline(java.util.List<ListAsrPipelineResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<ListAsrPipelineResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
