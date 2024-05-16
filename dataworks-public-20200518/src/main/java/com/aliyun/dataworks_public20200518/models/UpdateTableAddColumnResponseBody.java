// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableAddColumnResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the request task.</p>
     * <br>
     * <p>After a request task is submitted, it is divided into multiple subtasks that are run in sequence. After the current subtask is complete, the next subtask starts to run. After all subtasks are complete, the request task is complete. If a request task is aborted due to one of the following issues, address the issue based on the error code and initiate the request task again:</p>
     * <br>
     * <p>*   The request task fails to be submitted.</p>
     * <p>*   After the request task is submitted, a subtask fails to run.</p>
     */
    @NameInMap("TaskInfo")
    public UpdateTableAddColumnResponseBodyTaskInfo taskInfo;

    public static UpdateTableAddColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableAddColumnResponseBody self = new UpdateTableAddColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableAddColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTableAddColumnResponseBody setTaskInfo(UpdateTableAddColumnResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public UpdateTableAddColumnResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class UpdateTableAddColumnResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>Details about the status of the current subtask. Valid values:</p>
         * <br>
         * <p>*   If the current subtask succeeds, success is returned.</p>
         * <p>*   If the current subtask fails, the error details are displayed.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the subtask that you want to run. If this parameter is left empty, all subtasks are complete. You can call the [GetDDLJobStatus](https://help.aliyun.com/document_detail/185659.html) operation to query the status of the subtask based on the subtask ID.</p>
         */
        @NameInMap("NextTaskId")
        public String nextTaskId;

        /**
         * <p>The status of the current subtask. Valid values:</p>
         * <br>
         * <p>*   operating: The subtask is running.</p>
         * <p>*   success: The subtask succeeds.</p>
         * <p>*   failure: The subtask fails to run. For more information about the error details, see the Content parameter.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the current subtask.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateTableAddColumnResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableAddColumnResponseBodyTaskInfo self = new UpdateTableAddColumnResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTableAddColumnResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
