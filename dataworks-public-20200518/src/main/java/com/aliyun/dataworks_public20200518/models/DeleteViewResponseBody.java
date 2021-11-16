// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteViewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public DeleteViewResponseBodyTaskInfo taskInfo;

    public static DeleteViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteViewResponseBody self = new DeleteViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteViewResponseBody setTaskInfo(DeleteViewResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DeleteViewResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DeleteViewResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static DeleteViewResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteViewResponseBodyTaskInfo self = new DeleteViewResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DeleteViewResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteViewResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public DeleteViewResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteViewResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
