// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public DescribeDataFlowTasksResponseBodyTaskInfo taskInfo;

    public static DescribeDataFlowTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowTasksResponseBody self = new DescribeDataFlowTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDataFlowTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataFlowTasksResponseBody setTaskInfo(DescribeDataFlowTasksResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeDataFlowTasksResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DescribeDataFlowTasksResponseBodyTaskInfoTask extends TeaModel {
        @NameInMap("ConflictPolicy")
        public String conflictPolicy;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataFlowId")
        public String dataFlowId;

        /**
         * <p>null Valid values:</p>
         * <br>
         * <p>*   null null</p>
         * <p>*   null</p>
         * <p>*   null</p>
         */
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The time when the task ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*   null</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        @NameInMap("FilesystemId")
        public String filesystemId;

        /**
         * <p>null</p>
         */
        @NameInMap("FsPath")
        public String fsPath;

        /**
         * <p>null Valid values:</p>
         * <br>
         * <p>*   null</p>
         * <p>*   null</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <p>null null</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>null</p>
         * <br>
         * <p>null``</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   null</p>
         * <p>*   The name must be encoded in UTF-8.</p>
         */
        @NameInMap("ReportPath")
        public String reportPath;

        /**
         * <p>://</p>
         * <br>
         * <p>*</p>
         * <p>*   *</p>
         * <p>    *</p>
         * <p>    *</p>
         * <p>    *   [](http://https://。)</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>****</p>
         */
        @NameInMap("SourceStorage")
        public String sourceStorage;

        /**
         * <p>null</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>null Valid values:</p>
         * <br>
         * <p>*   null</p>
         * <p>*   null</p>
         * <p>*   null</p>
         * <p>*   null</p>
         * <p>*   null</p>
         * <p>*   null</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>null Valid values:</p>
         * <br>
         * <p>*   null</p>
         * <p>*   null</p>
         * <p>*   null null</p>
         * <p>*   null</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeDataFlowTasksResponseBodyTaskInfoTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksResponseBodyTaskInfoTask self = new DescribeDataFlowTasksResponseBodyTaskInfoTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setConflictPolicy(String conflictPolicy) {
            this.conflictPolicy = conflictPolicy;
            return this;
        }
        public String getConflictPolicy() {
            return this.conflictPolicy;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setDataFlowId(String dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }
        public String getDataFlowId() {
            return this.dataFlowId;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setFilesystemId(String filesystemId) {
            this.filesystemId = filesystemId;
            return this;
        }
        public String getFilesystemId() {
            return this.filesystemId;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setFsPath(String fsPath) {
            this.fsPath = fsPath;
            return this;
        }
        public String getFsPath() {
            return this.fsPath;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setReportPath(String reportPath) {
            this.reportPath = reportPath;
            return this;
        }
        public String getReportPath() {
            return this.reportPath;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setSourceStorage(String sourceStorage) {
            this.sourceStorage = sourceStorage;
            return this;
        }
        public String getSourceStorage() {
            return this.sourceStorage;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeDataFlowTasksResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeDataFlowTasksResponseBodyTaskInfoTask> task;

        public static DescribeDataFlowTasksResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksResponseBodyTaskInfo self = new DescribeDataFlowTasksResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksResponseBodyTaskInfo setTask(java.util.List<DescribeDataFlowTasksResponseBodyTaskInfoTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDataFlowTasksResponseBodyTaskInfoTask> getTask() {
            return this.task;
        }

    }

}
