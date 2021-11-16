// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public DeleteTableResponseBodyTaskInfo taskInfo;

    public static DeleteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableResponseBody self = new DeleteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTableResponseBody setTaskInfo(DeleteTableResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DeleteTableResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DeleteTableResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static DeleteTableResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteTableResponseBodyTaskInfo self = new DeleteTableResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DeleteTableResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteTableResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public DeleteTableResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteTableResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
