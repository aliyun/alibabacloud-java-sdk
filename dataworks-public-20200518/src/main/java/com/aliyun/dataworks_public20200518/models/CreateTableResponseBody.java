// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public CreateTableResponseBodyTaskInfo taskInfo;

    public static CreateTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTableResponseBody self = new CreateTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTableResponseBody setTaskInfo(CreateTableResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public CreateTableResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class CreateTableResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static CreateTableResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTableResponseBodyTaskInfo self = new CreateTableResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public CreateTableResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTableResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public CreateTableResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTableResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
