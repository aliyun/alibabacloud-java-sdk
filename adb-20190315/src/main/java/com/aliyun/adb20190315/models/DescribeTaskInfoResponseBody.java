// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the task.</p>
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
         * <p>The start time of the task. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The end time of the task. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The progress of the task. Unit: %.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the task.</p>
         * <br>
         * <p>*   Waiting</p>
         * <p>*   Running</p>
         * <p>*   Finished</p>
         * <p>*   Failed</p>
         * <p>*   Closed</p>
         * <p>*   Cancel</p>
         * <p>*   Retry</p>
         * <p>*   Pause</p>
         * <p>*   Stop</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
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
