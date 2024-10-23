// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried task.</p>
     */
    @NameInMap("TaskInfo")
    public DescribeTaskInfoResponseBodyTaskInfo taskInfo;

    public static DescribeTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInfoResponseBody self = new DescribeTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskInfoResponseBody setTaskInfo(DescribeTaskInfoResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeTaskInfoResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DescribeTaskInfoResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The start time of the task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-07T07:39:56Z</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The end time of the task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-07T08:08:50Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The progress of the task. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>Waiting</li>
         * <li>Running</li>
         * <li>Finished</li>
         * <li>Failed</li>
         * <li>Closed</li>
         * <li>Cancel</li>
         * <li>Retry</li>
         * <li>Pause</li>
         * <li>Stop</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>225685759</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeTaskInfoResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTaskInfo self = new DescribeTaskInfoResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTaskInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTaskInfoResponseBodyTaskInfo setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTaskInfoResponseBodyTaskInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeTaskInfoResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTaskInfoResponseBodyTaskInfo setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
