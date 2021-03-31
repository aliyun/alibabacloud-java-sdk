// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableResponseBody extends TeaModel {
    @NameInMap("TaskInfo")
    public UpdateTableResponseBodyTaskInfo taskInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableResponseBody self = new UpdateTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableResponseBody setTaskInfo(UpdateTableResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public UpdateTableResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public UpdateTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateTableResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Content")
        public String content;

        public static UpdateTableResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableResponseBodyTaskInfo self = new UpdateTableResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTableResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTableResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public UpdateTableResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateTableResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
