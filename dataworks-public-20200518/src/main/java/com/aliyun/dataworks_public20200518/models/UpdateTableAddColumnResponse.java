// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableAddColumnResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public UpdateTableAddColumnResponseTaskInfo taskInfo;

    public static UpdateTableAddColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableAddColumnResponse self = new UpdateTableAddColumnResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableAddColumnResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTableAddColumnResponse setTaskInfo(UpdateTableAddColumnResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public UpdateTableAddColumnResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class UpdateTableAddColumnResponseTaskInfo extends TeaModel {
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

        public static UpdateTableAddColumnResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableAddColumnResponseTaskInfo self = new UpdateTableAddColumnResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTableAddColumnResponseTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateTableAddColumnResponseTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTableAddColumnResponseTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTableAddColumnResponseTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

    }

}
