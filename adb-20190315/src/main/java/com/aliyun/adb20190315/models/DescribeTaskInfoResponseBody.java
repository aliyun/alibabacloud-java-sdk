// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponseBody extends TeaModel {
    @NameInMap("TaskInfo")
    public DescribeTaskInfoResponseBodyTaskInfo taskInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInfoResponseBody self = new DescribeTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInfoResponseBody setTaskInfo(DescribeTaskInfoResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeTaskInfoResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public DescribeTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTaskInfoResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeTaskInfoResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTaskInfo self = new DescribeTaskInfoResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeTaskInfoResponseBodyTaskInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
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
