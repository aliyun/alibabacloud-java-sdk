// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateViewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public CreateViewResponseTaskInfo taskInfo;

    public static CreateViewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateViewResponse self = new CreateViewResponse();
        return TeaModel.build(map, self);
    }

    public CreateViewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateViewResponse setTaskInfo(CreateViewResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public CreateViewResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class CreateViewResponseTaskInfo extends TeaModel {
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

        public static CreateViewResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateViewResponseTaskInfo self = new CreateViewResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public CreateViewResponseTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateViewResponseTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateViewResponseTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateViewResponseTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

    }

}
