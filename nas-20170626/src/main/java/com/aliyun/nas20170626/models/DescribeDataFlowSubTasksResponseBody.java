// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowSubTasksResponseBody extends TeaModel {
    /**
     * <p>The details about data streaming tasks.</p>
     */
    @NameInMap("DataFlowSubTask")
    public DescribeDataFlowSubTasksResponseBodyDataFlowSubTask dataFlowSubTask;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>pUJaUwAAAABhdGUyNTk1MQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataFlowSubTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowSubTasksResponseBody self = new DescribeDataFlowSubTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowSubTasksResponseBody setDataFlowSubTask(DescribeDataFlowSubTasksResponseBodyDataFlowSubTask dataFlowSubTask) {
        this.dataFlowSubTask = dataFlowSubTask;
        return this;
    }
    public DescribeDataFlowSubTasksResponseBodyDataFlowSubTask getDataFlowSubTask() {
        return this.dataFlowSubTask;
    }

    public DescribeDataFlowSubTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDataFlowSubTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail extends TeaModel {
        /**
         * <p>The checksum. Format example: crc64:123456.</p>
         * 
         * <strong>example:</strong>
         * <p>crc64:850309505450944****</p>
         */
        @NameInMap("Checksum")
        public String checksum;

        /**
         * <p>The time when the file was modified. The value is a UNIX timestamp. Unit: ns.</p>
         * 
         * <strong>example:</strong>
         * <p>1721167603</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The file size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail self = new DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats extends TeaModel {
        /**
         * <p>The actual amount of data for which the data flow task is complete. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        /**
         * <p>The average flow velocity. Unit: bytes/s.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("AverageSpeed")
        public Long averageSpeed;

        /**
         * <p>The amount of data (including skipped data) for which the data flow task is complete. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The amount of data scanned on the source. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        public static DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats self = new DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats setAverageSpeed(Long averageSpeed) {
            this.averageSpeed = averageSpeed;
            return this;
        }
        public Long getAverageSpeed() {
            return this.averageSpeed;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

    }

    public static class DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask extends TeaModel {
        /**
         * <p>The time when the data streaming task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-01 19:59:29</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the data flow.</p>
         * 
         * <strong>example:</strong>
         * <p>df-194433a5be31****</p>
         */
        @NameInMap("DataFlowId")
        public String dataFlowId;

        /**
         * <p>The ID of the data streaming task.</p>
         * 
         * <strong>example:</strong>
         * <p>subTaskId-370kyfmyknxcyzw****</p>
         */
        @NameInMap("DataFlowSubTaskId")
        public String dataFlowSubTaskId;

        /**
         * <p>The ID of the data flow task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38aa8e890f45****</p>
         */
        @NameInMap("DataFlowTaskId")
        public String dataFlowTaskId;

        /**
         * <p>The path of the destination file. Limits:</p>
         * <ul>
         * <li>The path must be 1 to 1,023 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * <li>The path must start with a forward slash (/).</li>
         * <li>The path must end with the file name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/mnt/file.png</p>
         */
        @NameInMap("DstFilePath")
        public String dstFilePath;

        /**
         * <p>The time when the data streaming task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-04 11:14:22</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The error message returned when the task failed.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The file information.</p>
         */
        @NameInMap("FileDetail")
        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail fileDetail;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-370lx1ev9ss27o0****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The progress of the data streaming task. Valid values: 0 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The progress information about data streaming tasks.</p>
         */
        @NameInMap("ProgressStats")
        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats progressStats;

        /**
         * <p>The path of the source file. Limits:</p>
         * <ul>
         * <li>The path must be 1 to 1,023 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * <li>The path must start with a forward slash (/).</li>
         * <li>The path must end with the file name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/test/file.png</p>
         */
        @NameInMap("SrcFilePath")
        public String srcFilePath;

        /**
         * <p>The time when the data streaming task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-03 10:43:16</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the data streaming task. Valid values:</p>
         * <ul>
         * <li>EXPIRED: The task is terminated.</li>
         * <li>CREATED: The task is created.</li>
         * <li>RUNNING: The task is running.</li>
         * <li>COMPLETE: The task is complete.</li>
         * <li>CANCELING: The task is being canceled.</li>
         * <li>FAILED: The task failed to be executed.</li>
         * <li>CANCELED: The task is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask self = new DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setDataFlowId(String dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }
        public String getDataFlowId() {
            return this.dataFlowId;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setDataFlowSubTaskId(String dataFlowSubTaskId) {
            this.dataFlowSubTaskId = dataFlowSubTaskId;
            return this;
        }
        public String getDataFlowSubTaskId() {
            return this.dataFlowSubTaskId;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setDataFlowTaskId(String dataFlowTaskId) {
            this.dataFlowTaskId = dataFlowTaskId;
            return this;
        }
        public String getDataFlowTaskId() {
            return this.dataFlowTaskId;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setDstFilePath(String dstFilePath) {
            this.dstFilePath = dstFilePath;
            return this;
        }
        public String getDstFilePath() {
            return this.dstFilePath;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setFileDetail(DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail fileDetail) {
            this.fileDetail = fileDetail;
            return this;
        }
        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskFileDetail getFileDetail() {
            return this.fileDetail;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setProgressStats(DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats progressStats) {
            this.progressStats = progressStats;
            return this;
        }
        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTaskProgressStats getProgressStats() {
            return this.progressStats;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setSrcFilePath(String srcFilePath) {
            this.srcFilePath = srcFilePath;
            return this;
        }
        public String getSrcFilePath() {
            return this.srcFilePath;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDataFlowSubTasksResponseBodyDataFlowSubTask extends TeaModel {
        @NameInMap("DataFlowSubTask")
        public java.util.List<DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask> dataFlowSubTask;

        public static DescribeDataFlowSubTasksResponseBodyDataFlowSubTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowSubTasksResponseBodyDataFlowSubTask self = new DescribeDataFlowSubTasksResponseBodyDataFlowSubTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowSubTasksResponseBodyDataFlowSubTask setDataFlowSubTask(java.util.List<DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask> dataFlowSubTask) {
            this.dataFlowSubTask = dataFlowSubTask;
            return this;
        }
        public java.util.List<DescribeDataFlowSubTasksResponseBodyDataFlowSubTaskDataFlowSubTask> getDataFlowSubTask() {
            return this.dataFlowSubTask;
        }

    }

}
