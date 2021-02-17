// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoTasksResponseBody extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<ListVideoTasksResponseBodyTasks> tasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextMarker")
    public String nextMarker;

    public static ListVideoTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVideoTasksResponseBody self = new ListVideoTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVideoTasksResponseBody setTasks(java.util.List<ListVideoTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListVideoTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListVideoTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVideoTasksResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static class ListVideoTasksResponseBodyTasks extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("NotifyEndpoint")
        public String notifyEndpoint;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("Result")
        public String result;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("NotifyTopicName")
        public String notifyTopicName;

        public static ListVideoTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListVideoTasksResponseBodyTasks self = new ListVideoTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListVideoTasksResponseBodyTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListVideoTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVideoTasksResponseBodyTasks setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListVideoTasksResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListVideoTasksResponseBodyTasks setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListVideoTasksResponseBodyTasks setNotifyEndpoint(String notifyEndpoint) {
            this.notifyEndpoint = notifyEndpoint;
            return this;
        }
        public String getNotifyEndpoint() {
            return this.notifyEndpoint;
        }

        public ListVideoTasksResponseBodyTasks setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListVideoTasksResponseBodyTasks setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListVideoTasksResponseBodyTasks setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListVideoTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVideoTasksResponseBodyTasks setNotifyTopicName(String notifyTopicName) {
            this.notifyTopicName = notifyTopicName;
            return this;
        }
        public String getNotifyTopicName() {
            return this.notifyTopicName;
        }

    }

}
