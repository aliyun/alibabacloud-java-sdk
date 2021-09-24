// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteViewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public DeleteViewResponseTaskInfo taskInfo;

    public static DeleteViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteViewResponse self = new DeleteViewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteViewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteViewResponse setTaskInfo(DeleteViewResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DeleteViewResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DeleteViewResponseTaskInfo extends TeaModel {
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

        public static DeleteViewResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteViewResponseTaskInfo self = new DeleteViewResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public DeleteViewResponseTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeleteViewResponseTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteViewResponseTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteViewResponseTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

    }

}
