// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public DeleteTableResponseTaskInfo taskInfo;

    public static DeleteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableResponse self = new DeleteTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTableResponse setTaskInfo(DeleteTableResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DeleteTableResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DeleteTableResponseTaskInfo extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("NextTaskId")
        @Validation(required = true)
        public String nextTaskId;

        public static DeleteTableResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteTableResponseTaskInfo self = new DeleteTableResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public DeleteTableResponseTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeleteTableResponseTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteTableResponseTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteTableResponseTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

    }

}
