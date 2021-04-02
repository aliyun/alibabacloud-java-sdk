// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public UpdateTableResponseTaskInfo taskInfo;

    public static UpdateTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableResponse self = new UpdateTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTableResponse setTaskInfo(UpdateTableResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public UpdateTableResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class UpdateTableResponseTaskInfo extends TeaModel {
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

        public static UpdateTableResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableResponseTaskInfo self = new UpdateTableResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTableResponseTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateTableResponseTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTableResponseTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTableResponseTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

    }

}
