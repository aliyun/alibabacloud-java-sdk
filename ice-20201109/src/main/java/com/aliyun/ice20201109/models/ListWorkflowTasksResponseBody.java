// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListWorkflowTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>C0C02296-113C-5838-8FE9-8F3A32998DDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<ListWorkflowTasksResponseBodyTaskList> taskList;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListWorkflowTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTasksResponseBody self = new ListWorkflowTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowTasksResponseBody setTaskList(java.util.List<ListWorkflowTasksResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<ListWorkflowTasksResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public ListWorkflowTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkflowTasksResponseBodyTaskListWorkflow extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-03-21T01:48:49Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>2025-02-23 10:19:37 +0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>example-workflow-***</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><strong><strong><strong>2491c84dce913da9fe65</strong></strong></strong></p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static ListWorkflowTasksResponseBodyTaskListWorkflow build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowTasksResponseBodyTaskListWorkflow self = new ListWorkflowTasksResponseBodyTaskListWorkflow();
            return TeaModel.build(map, self);
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkflowTasksResponseBodyTaskListWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListWorkflowTasksResponseBodyTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-07-15T09:45:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-12-07T10:53:45Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><em><strong><strong>4c93d2f404f8345b16a965</strong></strong></em></p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;:\&quot;Media\&quot;,\&quot;Media\&quot;:\&quot;<strong><strong>8b40884171efb0d9e7f7f458</strong></strong>\&quot;}</p>
         */
        @NameInMap("TaskInput")
        public String taskInput;

        /**
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        @NameInMap("Workflow")
        public ListWorkflowTasksResponseBodyTaskListWorkflow workflow;

        public static ListWorkflowTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowTasksResponseBodyTaskList self = new ListWorkflowTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListWorkflowTasksResponseBodyTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowTasksResponseBodyTaskList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListWorkflowTasksResponseBodyTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkflowTasksResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListWorkflowTasksResponseBodyTaskList setTaskInput(String taskInput) {
            this.taskInput = taskInput;
            return this;
        }
        public String getTaskInput() {
            return this.taskInput;
        }

        public ListWorkflowTasksResponseBodyTaskList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public ListWorkflowTasksResponseBodyTaskList setWorkflow(ListWorkflowTasksResponseBodyTaskListWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public ListWorkflowTasksResponseBodyTaskListWorkflow getWorkflow() {
            return this.workflow;
        }

    }

}
