// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullToPushResponseBody extends TeaModel {
    /**
     * <p>The current effective playlist sequence offset.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CurrentFileIndex")
    public Integer currentFileIndex;

    /**
     * <p>The current effective video playback offset.</p>
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
     * <p>a05e6b15-15af-405b-a4a2-0152245d****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return code.</p>
     * <blockquote>
     * <ul>
     * <li>&quot;0&quot; is returned in normal cases.</li>
     * <li>For error cases, refer to the error code list below.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>The reason why the task exited. Valid values:</p>
     * <ul>
     * <li>TriggerByUser: The task was actively ended by the user.</li>
     * <li>OverEndTime: The preset end time was exceeded.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when the task is in the exited state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TriggerByUser</p>
     */
    @NameInMap("TaskExitReason")
    public String taskExitReason;

    /**
     * <p>The time when the task exited. The value is a UNIX timestamp in seconds.</p>
     * <blockquote>
     * <p>This parameter is returned only when the task is in the exited state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1726354625</p>
     */
    @NameInMap("TaskExitTime")
    public Integer taskExitTime;

    /**
     * <p>The ID of the node returned when you create task.</p>
     * 
     * <strong>example:</strong>
     * <p>fb0d4ac7-c7e3-4978-9743-0bf2f6e8****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("TaskInfo")
    public DescribeLivePullToPushResponseBodyTaskInfo taskInfo;

    /**
     * <p>The reason why the task stopped running. Valid values:</p>
     * <ul>
     * <li>PullStreamFailed: Source stream pulling is abnormal. Retrying.</li>
     * <li>PushStreamFailed: Destination stream pushing is abnormal. Retrying.</li>
     * <li>UnknownError: Unknown error.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when the task is in the stopped state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PullStreamFailed</p>
     */
    @NameInMap("TaskInvalidReason")
    public String taskInvalidReason;

    /**
     * <p>The current status of the task. Valid values:</p>
     * <ul>
     * <li>0: Not started (the start time has not been reached).</li>
     * <li>1: Running normally (stream pulling and pushing are both normal).</li>
     * <li>2: Running abnormally.</li>
     * <li>3: Stopped (stream pulling or pushing is abnormal, or the task was actively stopped by calling an API operation).</li>
     * <li>-1: Exited.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The HTTP callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The destination ingest URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://pushtest.********.aliyunlive.com/pulltest493/pulltest-w434</p>
         */
        @NameInMap("DstUrl")
        public String dstUrl;

        /**
         * <p>The end time of the task. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-27T14:30:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The file index. Playback starts from the nth file.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FileIndex")
        public Integer fileIndex;

        @NameInMap("NotifyItemSwitch")
        public String notifyItemSwitch;

        /**
         * <p>The start offset of the video file. Unit: seconds. The value must be greater than 0.</p>
         * <blockquote>
         * <ul>
         * <li>Indicates the position from which reading starts, relative to the first frame.</li>
         * <li>This parameter is valid only for video-on-demand resources or video files.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The number of times playback repeats after completion. Valid values:</p>
         * <ul>
         * <li>0 (default): No repeat playback.</li>
         * <li>-1: Infinite loop.</li>
         * <li>Other positive integers: the number of times playback repeats after completion.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to video-on-demand or third-party video streams.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RepeatNumber")
        public Integer repeatNumber;

        @NameInMap("ReqAuth")
        public String reqAuth;

        /**
         * <p>The number of retries.</p>
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
         * <p>The source stream protocol name.</p>
         * 
         * <strong>example:</strong>
         * <p>RTMP</p>
         */
        @NameInMap("SourceProtocol")
        public String sourceProtocol;

        /**
         * <p>The source stream type. Valid values:</p>
         * <ul>
         * <li>live: live stream.</li>
         * <li>vod: ApsaraVideo VOD resource.</li>
         * <li>url: third-party video file resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The source stream URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://pulltest.****.aliyunlive.com/pulltest493/pulltest-w434</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        /**
         * <p>The start time of the task. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
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

        public DescribeLivePullToPushResponseBodyTaskInfo setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
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

        public DescribeLivePullToPushResponseBodyTaskInfo setNotifyItemSwitch(String notifyItemSwitch) {
            this.notifyItemSwitch = notifyItemSwitch;
            return this;
        }
        public String getNotifyItemSwitch() {
            return this.notifyItemSwitch;
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

        public DescribeLivePullToPushResponseBodyTaskInfo setReqAuth(String reqAuth) {
            this.reqAuth = reqAuth;
            return this;
        }
        public String getReqAuth() {
            return this.reqAuth;
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
