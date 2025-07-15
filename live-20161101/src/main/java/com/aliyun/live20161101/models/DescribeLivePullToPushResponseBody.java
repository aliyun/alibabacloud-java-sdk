// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullToPushResponseBody extends TeaModel {
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
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3271ACD2-F143-1204-AFDB-9A87C131****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code that is returned for the request.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>0 is returned if the request is normal.</p>
     * </li>
     * <li><p>For information about codes that are returned when exceptions occur, see the following Error codes table.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>The reason why the task is stopped.</p>
     * <ul>
     * <li>TriggerByUser: You proactively stopped the task.</li>
     * <li>OverEndTime: The specified end time was exceeded.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only if the task is stopped.</p>
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
     * <p>1724740200</p>
     */
    @NameInMap("TaskExitTime")
    public Integer taskExitTime;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fd245384-4067-4f91-9d75-9666a6bc9****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The information about the task.</p>
     */
    @NameInMap("TaskInfo")
    public DescribeLivePullToPushResponseBodyTaskInfo taskInfo;

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
     * <p>UnknownError</p>
     */
    @NameInMap("TaskInvalidReason")
    public String taskInvalidReason;

    /**
     * <p>The current status of the task.</p>
     * <ul>
     * <li>0: not started.</li>
     * <li>1: running. Stream pulling and stream relay are normal.</li>
     * <li>2: abnormal.</li>
     * <li>3: stopped. It may be because exceptions occur during stream pulling or stream relay or you proactively call the StopLivePullToPush operation.</li>
     * <li>\-1: exited.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    public static DescribeLivePullToPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullToPushResponseBody self = new DescribeLivePullToPushResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullToPushResponseBody setCurrentFileIndex(Integer currentFileIndex) {
        this.currentFileIndex = currentFileIndex;
        return this;
    }
    public Integer getCurrentFileIndex() {
        return this.currentFileIndex;
    }

    public DescribeLivePullToPushResponseBody setCurrentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
        return this;
    }
    public Integer getCurrentOffset() {
        return this.currentOffset;
    }

    public DescribeLivePullToPushResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLivePullToPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLivePullToPushResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public DescribeLivePullToPushResponseBody setTaskExitReason(String taskExitReason) {
        this.taskExitReason = taskExitReason;
        return this;
    }
    public String getTaskExitReason() {
        return this.taskExitReason;
    }

    public DescribeLivePullToPushResponseBody setTaskExitTime(Integer taskExitTime) {
        this.taskExitTime = taskExitTime;
        return this;
    }
    public Integer getTaskExitTime() {
        return this.taskExitTime;
    }

    public DescribeLivePullToPushResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeLivePullToPushResponseBody setTaskInfo(DescribeLivePullToPushResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeLivePullToPushResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public DescribeLivePullToPushResponseBody setTaskInvalidReason(String taskInvalidReason) {
        this.taskInvalidReason = taskInvalidReason;
        return this;
    }
    public String getTaskInvalidReason() {
        return this.taskInvalidReason;
    }

    public DescribeLivePullToPushResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public static class DescribeLivePullToPushResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The HTTP callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The destination URL to which the stream is relayed.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://pushtest.********.aliyunlive.com/pulltest493/pulltest-w434</p>
         */
        @NameInMap("DstUrl")
        public String dstUrl;

        /**
         * <p>The end time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-27T14:30:00Z</p>
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
         * <p>2</p>
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
         * <p>RTMP</p>
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
         * <p>live</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The source URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://pulltest.****.aliyunlive.com/pulltest493/pulltest-w434</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        /**
         * <p>The start time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-26T10:30:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd245384-4067-4f91-9d75-9666a6bc9****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static DescribeLivePullToPushResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePullToPushResponseBodyTaskInfo self = new DescribeLivePullToPushResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setDstUrl(String dstUrl) {
            this.dstUrl = dstUrl;
            return this;
        }
        public String getDstUrl() {
            return this.dstUrl;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setFileIndex(Integer fileIndex) {
            this.fileIndex = fileIndex;
            return this;
        }
        public Integer getFileIndex() {
            return this.fileIndex;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setRepeatNumber(Integer repeatNumber) {
            this.repeatNumber = repeatNumber;
            return this;
        }
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setSourceProtocol(String sourceProtocol) {
            this.sourceProtocol = sourceProtocol;
            return this;
        }
        public String getSourceProtocol() {
            return this.sourceProtocol;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setSourceUrls(java.util.List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeLivePullToPushResponseBodyTaskInfo setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
