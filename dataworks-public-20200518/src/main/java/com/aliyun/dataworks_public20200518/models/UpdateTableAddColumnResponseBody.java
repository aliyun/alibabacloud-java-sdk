// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableAddColumnResponseBody extends TeaModel {
    @NameInMap("TaskInfo")
    public UpdateTableAddColumnResponseBodyTaskInfo taskInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTableAddColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableAddColumnResponseBody self = new UpdateTableAddColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableAddColumnResponseBody setTaskInfo(UpdateTableAddColumnResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public UpdateTableAddColumnResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public UpdateTableAddColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateTableAddColumnResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Content")
        public String content;

        public static UpdateTableAddColumnResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableAddColumnResponseBodyTaskInfo self = new UpdateTableAddColumnResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
