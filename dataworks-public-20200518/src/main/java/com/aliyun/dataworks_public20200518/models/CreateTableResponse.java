// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public CreateTableResponseTaskInfo taskInfo;

    public static CreateTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTableResponse self = new CreateTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTableResponse setTaskInfo(CreateTableResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public CreateTableResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class CreateTableResponseTaskInfo extends TeaModel {
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

        public static CreateTableResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTableResponseTaskInfo self = new CreateTableResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public CreateTableResponseTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateTableResponseTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTableResponseTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTableResponseTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

    }

}
