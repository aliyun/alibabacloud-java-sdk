// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableResponseBody extends TeaModel {
    @NameInMap("TaskInfo")
    public CreateTableResponseBodyTaskInfo taskInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTableResponseBody self = new CreateTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTableResponseBody setTaskInfo(CreateTableResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public CreateTableResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public CreateTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTableResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Content")
        public String content;

        public static CreateTableResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTableResponseBodyTaskInfo self = new CreateTableResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public CreateTableResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTableResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public CreateTableResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateTableResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
