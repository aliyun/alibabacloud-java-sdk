// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
     */
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

    public static class DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats extends TeaModel {
        @NameInMap("ActualBytes")
        public Long actualBytes;

        @NameInMap("ActualFiles")
        public Long actualFiles;

        @NameInMap("AverageSpeed")
        public Long averageSpeed;

        @NameInMap("BytesDone")
        public Long bytesDone;

        @NameInMap("BytesTotal")
        public Long bytesTotal;

        @NameInMap("FilesDone")
        public Long filesDone;

        @NameInMap("FilesTotal")
        public Long filesTotal;

        @NameInMap("RemainTime")
        public Long remainTime;

        public static DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats self = new DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setActualFiles(Long actualFiles) {
            this.actualFiles = actualFiles;
            return this;
        }
        public Long getActualFiles() {
            return this.actualFiles;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setAverageSpeed(Long averageSpeed) {
            this.averageSpeed = averageSpeed;
            return this;
        }
        public Long getAverageSpeed() {
            return this.averageSpeed;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setFilesDone(Long filesDone) {
            this.filesDone = filesDone;
            return this;
        }
        public Long getFilesDone() {
            return this.filesDone;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setFilesTotal(Long filesTotal) {
            this.filesTotal = filesTotal;
            return this;
        }
        public Long getFilesTotal() {
            return this.filesTotal;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats setRemainTime(Long remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Long getRemainTime() {
            return this.remainTime;
        }

    }

    public static class DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport self = new DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeDataFlowTasksResponseBodyTaskInfoTaskReports extends TeaModel {
        @NameInMap("Report")
        public java.util.List<DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport> report;

        public static DescribeDataFlowTasksResponseBodyTaskInfoTaskReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksResponseBodyTaskInfoTaskReports self = new DescribeDataFlowTasksResponseBodyTaskInfoTaskReports();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTaskReports setReport(java.util.List<DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport> report) {
            this.report = report;
            return this;
        }
        public java.util.List<DescribeDataFlowTasksResponseBodyTaskInfoTaskReportsReport> getReport() {
            return this.report;
        }

    }

    public static class DescribeDataFlowTasksResponseBodyTaskInfoTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>KEEP_LATEST</p>
         */
        @NameInMap("ConflictPolicy")
        public String conflictPolicy;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataFlowId")
        public String dataFlowId;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Directory")
        public String directory;

        @NameInMap("DstDirectory")
        public String dstDirectory;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        @NameInMap("FilesystemId")
        public String filesystemId;

        @NameInMap("FsPath")
        public String fsPath;

        @NameInMap("Includes")
        public String includes;

        @NameInMap("Originator")
        public String originator;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("ProgressStats")
        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats progressStats;

        @NameInMap("ReportPath")
        @Deprecated
        public String reportPath;

        @NameInMap("Reports")
        public DescribeDataFlowTasksResponseBodyTaskInfoTaskReports reports;

        @NameInMap("SourceStorage")
        public String sourceStorage;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TransferFileListPath")
        public String transferFileListPath;

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

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setDstDirectory(String dstDirectory) {
            this.dstDirectory = dstDirectory;
            return this;
        }
        public String getDstDirectory() {
            return this.dstDirectory;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
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

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setIncludes(String includes) {
            this.includes = includes;
            return this;
        }
        public String getIncludes() {
            return this.includes;
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

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setProgressStats(DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats progressStats) {
            this.progressStats = progressStats;
            return this;
        }
        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats getProgressStats() {
            return this.progressStats;
        }

        @Deprecated
        public DescribeDataFlowTasksResponseBodyTaskInfoTask setReportPath(String reportPath) {
            this.reportPath = reportPath;
            return this;
        }
        public String getReportPath() {
            return this.reportPath;
        }

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setReports(DescribeDataFlowTasksResponseBodyTaskInfoTaskReports reports) {
            this.reports = reports;
            return this;
        }
        public DescribeDataFlowTasksResponseBodyTaskInfoTaskReports getReports() {
            return this.reports;
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

        public DescribeDataFlowTasksResponseBodyTaskInfoTask setTransferFileListPath(String transferFileListPath) {
            this.transferFileListPath = transferFileListPath;
            return this;
        }
        public String getTransferFileListPath() {
            return this.transferFileListPath;
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
