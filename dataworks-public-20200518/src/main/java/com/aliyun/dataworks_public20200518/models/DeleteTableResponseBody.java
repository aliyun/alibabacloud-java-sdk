// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the task that is used to delete the table.</p>
     */
    @NameInMap("TaskInfo")
    public DeleteTableResponseBodyTaskInfo taskInfo;

    public static DeleteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableResponseBody self = new DeleteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTableResponseBody setTaskInfo(DeleteTableResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DeleteTableResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DeleteTableResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The content of the task.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the task that is running.</p>
         */
        @NameInMap("NextTaskId")
        public String nextTaskId;

        /**
         * <p>The status of the task that is complete.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task that is complete.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DeleteTableResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteTableResponseBodyTaskInfo self = new DeleteTableResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DeleteTableResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteTableResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public DeleteTableResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteTableResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
