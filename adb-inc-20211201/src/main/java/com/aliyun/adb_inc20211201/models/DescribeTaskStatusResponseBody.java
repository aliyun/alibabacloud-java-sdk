// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public DescribeTaskStatusResponseBodyTaskInfo taskInfo;

    public static DescribeTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskStatusResponseBody self = new DescribeTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskStatusResponseBody setTaskInfo(DescribeTaskStatusResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeTaskStatusResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DescribeTaskStatusResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public Long taskId;

        public static DescribeTaskStatusResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskStatusResponseBodyTaskInfo self = new DescribeTaskStatusResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTaskStatusResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTaskStatusResponseBodyTaskInfo setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
