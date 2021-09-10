// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateViewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public CreateViewResponseBodyTaskInfo taskInfo;

    public static CreateViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateViewResponseBody self = new CreateViewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateViewResponseBody setTaskInfo(CreateViewResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public CreateViewResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class CreateViewResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Content")
        public String content;

        public static CreateViewResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateViewResponseBodyTaskInfo self = new CreateViewResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public CreateViewResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateViewResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public CreateViewResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateViewResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
