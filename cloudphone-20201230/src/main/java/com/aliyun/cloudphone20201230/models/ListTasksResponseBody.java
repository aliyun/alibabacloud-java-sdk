// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries that is returned on each page. Valid values: 1 to 200. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Tasks")
    public ListTasksResponseBodyTasks tasks;

    /**
     * <p>The total number of tasks.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(ListTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public ListTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTasksTask extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The content that is returned after the task is executed. The content can be up to 1,024 bytes in length.</p>
         */
        @NameInMap("ExecuteMsg")
        public String executeMsg;

        /**
         * <p>The time when the task ended.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The task progress.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task state.</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The task type.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static ListTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasksTask self = new ListTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasksTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyTasksTask setExecuteMsg(String executeMsg) {
            this.executeMsg = executeMsg;
            return this;
        }
        public String getExecuteMsg() {
            return this.executeMsg;
        }

        public ListTasksResponseBodyTasksTask setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ListTasksResponseBodyTasksTask setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTasksResponseBodyTasksTask setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListTasksResponseBodyTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyTasksTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListTasksResponseBodyTasksTask setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<ListTasksResponseBodyTasksTask> task;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setTask(java.util.List<ListTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<ListTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
