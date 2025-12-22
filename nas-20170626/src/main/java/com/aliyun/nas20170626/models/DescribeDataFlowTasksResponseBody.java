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

    /**
     * <p>The information about dataflow tasks.</p>
     */
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
        /**
         * <p>The actual amount of data for which the dataflow task is complete. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>131092971520</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        /**
         * <p>The actual number of files for which the dataflow task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ActualFiles")
        public Long actualFiles;

        /**
         * <p>The average flow velocity. Unit: bytes/s.</p>
         * 
         * <strong>example:</strong>
         * <p>342279299</p>
         */
        @NameInMap("AverageSpeed")
        public Long averageSpeed;

        /**
         * <p>The amount of data (including skipped data) for which the dataflow task is complete. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>131092971520</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The amount of data scanned on the source. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>131092971520</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>The number of files (including skipped files) for which the dataflow task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FilesDone")
        public Long filesDone;

        /**
         * <p>The number of files scanned on the source.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FilesTotal")
        public Long filesTotal;

        /**
         * <p>The estimated remaining execution time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>437</p>
         */
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
        /**
         * <p>The name of the report.</p>
         * <ul>
         * <li><p>CPFS:</p>
         * <p>TotalFilesReport: task reports.</p>
         * </li>
         * <li><p>CPFS for Lingjun:</p>
         * <ul>
         * <li>FailedFilesReport: failed file reports.</li>
         * <li>SkippedFilesReport: skipped file reports.</li>
         * <li>SuccessFilesReport: successful file reports.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TotalFilesReport</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The report URL.</p>
         */
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
         * <p>The conflict policy for files with the same name. Valid values:</p>
         * <ul>
         * <li>SKIP_THE_FILE: skips files with the same name.</li>
         * <li>KEEP_LATEST: compares the update time and keeps the latest version.</li>
         * <li>OVERWRITE_EXISTING: forcibly overwrites the existing file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KEEP_LATEST</p>
         */
        @NameInMap("ConflictPolicy")
        public String conflictPolicy;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-04 18:27:35</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the dataflow.</p>
         * 
         * <strong>example:</strong>
         * <p>dfid-194433a5be3****</p>
         */
        @NameInMap("DataFlowId")
        public String dataFlowId;

        /**
         * <p>The type of data on which operations are performed by the dataflow task. The following information is displayed:</p>
         * <ul>
         * <li>Metadata: the metadata of a file, including the timestamp, ownership, and permission information of the file. If you select Metadata, only the metadata of the file is imported. You can only query the file. When you access the file data, the file is loaded from the source storage as required.</li>
         * <li>Data: the data blocks of the file.</li>
         * <li>MetaAndData: the metadata and data blocks of the file.</li>
         * </ul>
         * <blockquote>
         * <p> CPFS for Lingjun supports only the MetaAndData type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Metadata</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The directory in which the dataflow task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>/path_in_cpfs/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The directory mapped to the dataflow task.</p>
         * 
         * <strong>example:</strong>
         * <p>/path_in_cpfs/</p>
         */
        @NameInMap("DstDirectory")
        public String dstDirectory;

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-04 18:27:35</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The cause of the task exception.</p>
         * <blockquote>
         * <p> If this parameter is not returned or the return value is empty, no error occurs.</p>
         * </blockquote>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The directory of the fileset in the CPFS file system.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must be 2 to 1024 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>The directory must start and end with a forward slash (/).</li>
         * <li>The directory must be a fileset directory in the CPFS file system.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/a/b/c/</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        @NameInMap("FilesystemId")
        public String filesystemId;

        /**
         * <p>The path of the smart directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/aa/</p>
         */
        @NameInMap("FsPath")
        public String fsPath;

        /**
         * <p>Filters subdirectories and transfers their contents.</p>
         * <blockquote>
         * <p> Only CPFS for Lingjun supports this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/test/&quot;,&quot;/test1/&quot;]</p>
         */
        @NameInMap("Includes")
        public String includes;

        /**
         * <p>The initiator of the dataflow task. The following information is displayed:</p>
         * <ul>
         * <li>User: The task is initiated by a user.</li>
         * <li>System: The task is automatically initiated by CPFS based on the automatic update interval.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <p>The progress of the dataflow task. The number of operations that have been performed by the dataflow task.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>The progress of the dataflow task.</p>
         */
        @NameInMap("ProgressStats")
        public DescribeDataFlowTasksResponseBodyTaskInfoTaskProgressStats progressStats;

        /**
         * <p>The save path of dataflow task reports in the CPFS file system.</p>
         * <ul>
         * <li>The task reports for a CPFS file system are generated in the <code>.dataflow_report</code> directory of the CPFS file system.</li>
         * <li>CPFS for Lingjun returns an OSS download link for you to download the task reports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/path_in_cpfs/reportfile.cvs</p>
         */
        @NameInMap("ReportPath")
        @Deprecated
        public String reportPath;

        /**
         * <p>The reports.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Streaming tasks do not support reports.</p>
         * </li>
         * <li><p>If the WithReport parameter is set to True, the CPFS for Lingjun report data is returned.</p>
         * </li>
         * <li><p>Only CPFS for Lingjun supports the WithReport parameter.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Reports")
        public DescribeDataFlowTasksResponseBodyTaskInfoTaskReports reports;

        /**
         * <p>The access path of the source storage. Format: <code>&lt;storage type&gt;://[&lt;account id&gt;:]&lt;path&gt;</code>.</p>
         * <p>Among them:</p>
         * <ul>
         * <li><p>storage type: Only Object Storage Service (OSS) is supported.</p>
         * </li>
         * <li><p>account id: the UID of the account of the source storage.</p>
         * </li>
         * <li><p>path: the name of the OSS bucket. Limits:</p>
         * <ul>
         * <li>The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.</li>
         * <li>The name can be up to 128 characters in length.</li>
         * <li>The name must be encoded in UTF-8.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The OSS bucket must be an existing bucket in the region.</p>
         * </li>
         * <li><p>Only CPFS for Lingjun V2.6.0 and later support the account id parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1</p>
         */
        @NameInMap("SourceStorage")
        public String sourceStorage;

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-04 18:27:35</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the dataflow task. The following information is displayed:</p>
         * <ul>
         * <li>Pending: The dataflow task has been created and has not started.</li>
         * <li>Executing: The dataflow task is being executed.</li>
         * <li>Failed: The dataflow task failed to be executed. You can view the cause of the failure in the dataflow task report.</li>
         * <li>Completed: The dataflow task is completed. You can check that all the files have been correctly transferred in the dataflow task report.</li>
         * <li>Canceled: The dataflow task is canceled and is not completed.</li>
         * <li>Canceling: The dataflow task is being canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the dataflow task. The following information is displayed:</p>
         * <ul>
         * <li>Import: imports data stored in the source storage to a CPFS file system.</li>
         * <li>Export: exports specified data from a CPFS file system to the source storage.</li>
         * <li>StreamImport: imports the specified data from the source storage to a CPFS file system in streaming mode.</li>
         * <li>StreamExport: exports specified data from a CPFS file system to the source storage in streaming mode.</li>
         * <li>Evict: releases the data blocks of a file in a CPFS file system. After the eviction, only the metadata of the file is retained in the CPFS file system. You can still query the file. However, the data blocks of the file are cleared and do not occupy the storage space in the CPFS file system. When you access the file data, the file is loaded from the source storage as required.</li>
         * <li>Inventory: obtains the inventory list managed by a dataflow from the CPFS file system, providing the cache status of inventories in the dataflow.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS for Lingjun V2.6.0 and later support StreamImport and StreamExport.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Import</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The ID of the dataflow task.</p>
         * 
         * <strong>example:</strong>
         * <p>taskId-12345678</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Specify the OSS directory and synchronize data based on the content of the CSV file in the OSS directory.</p>
         * <blockquote>
         * <p> Only CPFS for Lingjun supports this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/path_in_cpfs/</p>
         */
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
