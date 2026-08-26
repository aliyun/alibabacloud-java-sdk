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
     * <p>The number of records per page.</p>
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
     * <p>The list of task information.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeLivePullToPushListResponseBodyTaskList> taskList;

    /**
     * <p>The total number of query results.</p>
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
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The HTTP callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p>hahaha.com</p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The destination ingest URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://qd.push.lgg.alivecdn.com/testhsc/streamhsc?live_rtmp_*******</p>
         */
        @NameInMap("DstUrl")
        public String dstUrl;

        /**
         * <p>The task end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-30T14:30:00Z</p>
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
         * <p>The start offset, which is the start offset value of the video file. Unit: seconds. The value must be greater than 0.</p>
         * <blockquote>
         * <ul>
         * <li>Indicates the position to start reading from, relative to the first frame.</li>
         * <li>Valid only for video-on-demand resources or video files.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The number of times to repeat playback after the playlist finishes. Valid values:</p>
         * <ul>
         * <li>0 (default): Do not repeat.</li>
         * <li>-1: Loop indefinitely.</li>
         * <li>Other positive integers: The number of times to repeat playback after the playlist finishes.</li>
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
         * <p>flv</p>
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
         * <p>The source stream URL addresses.</p>
         */
        @NameInMap("SourceUrls")
        public java.util.List<String> sourceUrls;

        /**
         * <p>The task start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
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

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
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

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setNotifyItemSwitch(String notifyItemSwitch) {
            this.notifyItemSwitch = notifyItemSwitch;
            return this;
        }
        public String getNotifyItemSwitch() {
            return this.notifyItemSwitch;
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

        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo setReqAuth(String reqAuth) {
            this.reqAuth = reqAuth;
            return this;
        }
        public String getReqAuth() {
            return this.reqAuth;
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
         * <p>The currently effective playlist sequence offset.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentFileIndex")
        public Integer currentFileIndex;

        /**
         * <p>The currently effective video playback offset.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentOffset")
        public Integer currentOffset;

        /**
         * <p>The reason why the task exited. Valid values:</p>
         * <ul>
         * <li>TriggerByUser: Actively ended by the user.</li>
         * <li>OverEndTime: Exceeded the preset end time.</li>
         * </ul>
         * <blockquote>
         * <p>Returned only when the task is in the exited state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TriggerByUser</p>
         */
        @NameInMap("TaskExitReason")
        public String taskExitReason;

        /**
         * <p>The task exit time, in Unix seconds timestamp.</p>
         * <blockquote>
         * <p>Returned only when the task is in the exited state.</p>
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
         * <p>The task information.</p>
         */
        @NameInMap("TaskInfo")
        public DescribeLivePullToPushListResponseBodyTaskListTaskInfo taskInfo;

        /**
         * <p>The reason why the task stopped running. Valid values:</p>
         * <ul>
         * <li>PullStreamFailed: Source stream pulling exception. Retrying.</li>
         * <li>PushStreamFailed: Destination stream pushing exception. Retrying.</li>
         * <li>UnknownError: Unknown exception.</li>
         * </ul>
         * <blockquote>
         * <p>Returned only when the task is in the stopped state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PullStreamFailed</p>
         */
        @NameInMap("TaskInvalidReason")
        public String taskInvalidReason;

        /**
         * <p>The current task status. Valid values:</p>
         * <ul>
         * <li>0: Not started (the start time has not been reached).</li>
         * <li>1: Running normally (stream pulling and pushing are normal).</li>
         * <li>2: Running abnormally.</li>
         * <li>3: Stopped (stream pulling or pushing is abnormal, or the task was actively stopped by calling an operation).</li>
         * <li>-1: Exited.</li>
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
