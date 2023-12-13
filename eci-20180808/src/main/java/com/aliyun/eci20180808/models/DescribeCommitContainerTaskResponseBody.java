// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeCommitContainerTaskResponseBody extends TeaModel {
    /**
     * <p>Details of the task.</p>
     */
    @NameInMap("CommitTasks")
    public java.util.List<DescribeCommitContainerTaskResponseBodyCommitTasks> commitTasks;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The query token that is returned in this request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCommitContainerTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommitContainerTaskResponseBody self = new DescribeCommitContainerTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommitContainerTaskResponseBody setCommitTasks(java.util.List<DescribeCommitContainerTaskResponseBodyCommitTasks> commitTasks) {
        this.commitTasks = commitTasks;
        return this;
    }
    public java.util.List<DescribeCommitContainerTaskResponseBodyCommitTasks> getCommitTasks() {
        return this.commitTasks;
    }

    public DescribeCommitContainerTaskResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeCommitContainerTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCommitContainerTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommitContainerTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos extends TeaModel {
        /**
         * <p>The message about the phase.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The phase name. Valid values:</p>
         * <br>
         * <p>*   PullBaseImage: Pull the original container image.</p>
         * <p>*   CommitContainer: Commit the container to generate an image.</p>
         * <p>*   PushCommittedImage: Push the image to Container Registry.</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The record time of the phase.</p>
         */
        @NameInMap("RecordTime")
        public String recordTime;

        /**
         * <p>The state of the phase.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos self = new DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos setRecordTime(String recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public String getRecordTime() {
            return this.recordTime;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCommitContainerTaskResponseBodyCommitTasks extends TeaModel {
        /**
         * <p>The information about the phase that the task arrives.</p>
         */
        @NameInMap("CommitPhaseInfos")
        public java.util.List<DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos> commitPhaseInfos;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The message about the state.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The time when the task was started.</p>
         */
        @NameInMap("TaskCreationTime")
        public String taskCreationTime;

        /**
         * <p>The time when the task was complete.</p>
         */
        @NameInMap("TaskFinishedTime")
        public String taskFinishedTime;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The progress of the task in percentage.</p>
         */
        @NameInMap("TaskProgress")
        public String taskProgress;

        /**
         * <p>The state of the task. Valid values:</p>
         * <br>
         * <p>*   Running</p>
         * <p>*   Succeeded</p>
         * <p>*   Failed</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeCommitContainerTaskResponseBodyCommitTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommitContainerTaskResponseBodyCommitTasks self = new DescribeCommitContainerTaskResponseBodyCommitTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setCommitPhaseInfos(java.util.List<DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos> commitPhaseInfos) {
            this.commitPhaseInfos = commitPhaseInfos;
            return this;
        }
        public java.util.List<DescribeCommitContainerTaskResponseBodyCommitTasksCommitPhaseInfos> getCommitPhaseInfos() {
            return this.commitPhaseInfos;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setTaskCreationTime(String taskCreationTime) {
            this.taskCreationTime = taskCreationTime;
            return this;
        }
        public String getTaskCreationTime() {
            return this.taskCreationTime;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setTaskFinishedTime(String taskFinishedTime) {
            this.taskFinishedTime = taskFinishedTime;
            return this;
        }
        public String getTaskFinishedTime() {
            return this.taskFinishedTime;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setTaskProgress(String taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }
        public String getTaskProgress() {
            return this.taskProgress;
        }

        public DescribeCommitContainerTaskResponseBodyCommitTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
