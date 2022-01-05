// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

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
