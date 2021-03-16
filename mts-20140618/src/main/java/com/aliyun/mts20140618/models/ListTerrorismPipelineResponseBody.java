// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListTerrorismPipelineResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PipelineList")
    public ListTerrorismPipelineResponseBodyPipelineList pipelineList;

    public static ListTerrorismPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTerrorismPipelineResponseBody self = new ListTerrorismPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTerrorismPipelineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTerrorismPipelineResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTerrorismPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTerrorismPipelineResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTerrorismPipelineResponseBody setPipelineList(ListTerrorismPipelineResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public ListTerrorismPipelineResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public static class ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig extends TeaModel {
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Queue")
        public String queue;

        public static ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig self = new ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig();
            return TeaModel.build(map, self);
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class ListTerrorismPipelineResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("NotifyConfig")
        public ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListTerrorismPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            ListTerrorismPipelineResponseBodyPipelineListPipeline self = new ListTerrorismPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipeline setNotifyConfig(ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public ListTerrorismPipelineResponseBodyPipelineListPipelineNotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTerrorismPipelineResponseBodyPipelineListPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListTerrorismPipelineResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<ListTerrorismPipelineResponseBodyPipelineListPipeline> pipeline;

        public static ListTerrorismPipelineResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            ListTerrorismPipelineResponseBodyPipelineList self = new ListTerrorismPipelineResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public ListTerrorismPipelineResponseBodyPipelineList setPipeline(java.util.List<ListTerrorismPipelineResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<ListTerrorismPipelineResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}
