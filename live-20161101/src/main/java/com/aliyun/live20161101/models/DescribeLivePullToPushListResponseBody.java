// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullToPushListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a05e6b15-15af-405b-a4a2-0152245*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tasks.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeLivePullToPushListResponseBodyTaskList> taskList;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeLivePullToPushListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullToPushListResponseBody self = new DescribeLivePullToPushListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullToPushListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLivePullToPushListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLivePullToPushListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLivePullToPushListResponseBody setTaskList(java.util.List<DescribeLivePullToPushListResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeLivePullToPushListResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public DescribeLivePullToPushListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeLivePullToPushListResponseBodyTaskListTaskInfo extends TeaModel {
        /**
         * <p>The HTTP callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p>hahaha.com</p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The destination URL to which the stream is relayed.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://qd.push.lgg.alivecdn.com/testhsc/streamhsc?live_rtmp_*******</p>
         */
        @NameInMap("DstUrl")
        public String dstUrl;

        /**
         * <p>The end time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-30T14:30:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The file index, which indicates the sequence of the file where the playback starts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FileIndex")
        public Integer fileIndex;

        /**
         * <p>The offset of the position where the system starts to read the video resource. Unit: seconds. Valid values: positive numbers.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter indicates an offset from the first frame.</p>
         * </li>
         * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The number of playbacks after the first playback is complete. Valid values:</p>
         * <ul>
         * <li>0 (default): specifies that the video list is played only once.</li>
         * <li>\-1: specifies that the video list is played in loop mode.</li>
         * <li>Positive integer: specifies the number of times the video list repeats after the first playback is complete.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RepeatNumber")
        public Integer repeatNumber;

        /**
         * <p>The number of retries allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <p>The retry interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RetryInterval")
        public Integer retryInterval;

        /**
         * <p>The protocol of the source stream.</p>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("SourceProtocol")
        public String sourceProtocol;

        /**
         * <p>The type of the source stream. Valid values:</p>
         * <ul>
         * <li>live: a live stream</li>
         * <li>vod: a list of ApsaraVideo VOD resources</li>
         * <li>url: a list of video resources from a third party</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The source URLs.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        /**
         * <p>The start time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-04T09:16:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fb0d4ac7-c7e3-4978-9743-0bf2f6e8****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>taskname</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static DescribeLivePullToPushListResponseBodyTaskListTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullToPushListResponseBodyTaskListTaskInfo self = new DescribeLivePullToPushListResponseBodyTaskListTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setDstUrl(String dstUrl) {
            this.dstUrl = dstUrl;
            return this;
        }
        public String getDstUrl() {
            return this.dstUrl;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setFileIndex(Integer fileIndex) {
            this.fileIndex = fileIndex;
            return this;
        }
        public Integer getFileIndex() {
            return this.fileIndex;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setRepeatNumber(Integer repeatNumber) {
            this.repeatNumber = repeatNumber;
            return this;
        }
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setSourceProtocol(String sourceProtocol) {
            this.sourceProtocol = sourceProtocol;
            return this;
        }
        public String getSourceProtocol() {
            return this.sourceProtocol;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class DescribeLivePullToPushListResponseBodyTaskList extends TeaModel {
        /**
         * <p>The current file index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentFileIndex")
        public Integer currentFileIndex;

        /**
         * <p>The current offset for video playback.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentOffset")
        public Integer currentOffset;

        /**
         * <p>The reason why the task was exited. Valid values:</p>
         * <ul>
         * <li>TriggerByUser: You proactively ended the task.</li>
         * <li>OverEndTime: The specified end time was exceeded.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the task status is exited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TriggerByUser</p>
         */
        @NameInMap("TaskExitReason")
        public String taskExitReason;

        /**
         * <p>The time when the task was exited. The value is a Unix timestamp in seconds.</p>
         * <blockquote>
         * <p> This parameter is returned only if the task status is exited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1726354625</p>
         */
        @NameInMap("TaskExitTime")
        public Integer taskExitTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fb0d4ac7-c7e3-4978-9743-0bf2f6e8****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("TaskInfo")
        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo taskInfo;

        /**
         * <p>The reason why the task was stopped.</p>
         * <ul>
         * <li>PullStreamFailed: An exception occurred while pulling the source stream. A retry is in progress.</li>
         * <li>PushStreamFailed: An exception occurred while ingesting the stream. A retry is in progress.</li>
         * <li>UnknownError: An unknown exception occurred.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the task status is stopped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PullStreamFailed</p>
         */
        @NameInMap("TaskInvalidReason")
        public String taskInvalidReason;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>0: not started.</li>
         * <li>1: running. Stream pulling and stream relay are normal.</li>
         * <li>2: abnormal.</li>
         * <li>3: stopped. It may be because exceptions occur during stream pulling or stream relay or you proactively call the StopLivePullToPush operation.</li>
         * <li>\-1: exited.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        public static DescribeLivePullToPushListResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullToPushListResponseBodyTaskList self = new DescribeLivePullToPushListResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullToPushListResponseBodyTaskList setCurrentFileIndex(Integer currentFileIndex) {
            this.currentFileIndex = currentFileIndex;
            return this;
        }
        public Integer getCurrentFileIndex() {
            return this.currentFileIndex;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setCurrentOffset(Integer currentOffset) {
            this.currentOffset = currentOffset;
            return this;
        }
        public Integer getCurrentOffset() {
            return this.currentOffset;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setTaskExitReason(String taskExitReason) {
            this.taskExitReason = taskExitReason;
            return this;
        }
        public String getTaskExitReason() {
            return this.taskExitReason;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setTaskExitTime(Integer taskExitTime) {
            this.taskExitTime = taskExitTime;
            return this;
        }
        public Integer getTaskExitTime() {
            return this.taskExitTime;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setTaskInfo(DescribeLivePullToPushListResponseBodyTaskListTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo getTaskInfo() {
            return this.taskInfo;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setTaskInvalidReason(String taskInvalidReason) {
            this.taskInvalidReason = taskInvalidReason;
            return this;
        }
        public String getTaskInvalidReason() {
            return this.taskInvalidReason;
        }

        public DescribeLivePullToPushListResponseBodyTaskList setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

    }

}
