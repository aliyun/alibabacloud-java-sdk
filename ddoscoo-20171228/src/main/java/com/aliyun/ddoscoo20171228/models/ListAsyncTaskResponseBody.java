// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListAsyncTaskResponseBody extends TeaModel {
    @NameInMap("AsyncTasks")
    public java.util.List<ListAsyncTaskResponseBodyAsyncTasks> asyncTasks;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTaskResponseBody self = new ListAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsyncTaskResponseBody setAsyncTasks(java.util.List<ListAsyncTaskResponseBodyAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<ListAsyncTaskResponseBodyAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public ListAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsyncTaskResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAsyncTaskResponseBodyAsyncTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1533866201000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1533866201000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;: &quot;ddoscoo-1234-qrq2134&quot;}</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;: &quot;ddoscoo-1234-qrq2134&quot;, &quot;url&quot;: &quot;<a href="https://oss.xxx.xxx%22%7D">https://oss.xxx.xxx&quot;}</a></p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static ListAsyncTaskResponseBodyAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListAsyncTaskResponseBodyAsyncTasks self = new ListAsyncTaskResponseBodyAsyncTasks();
            return TeaModel.build(map, self);
        }

        public ListAsyncTaskResponseBodyAsyncTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
