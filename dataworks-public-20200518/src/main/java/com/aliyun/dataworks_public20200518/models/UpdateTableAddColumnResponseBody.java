// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableAddColumnResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the request task.</p>
     * <p>After the request task is submitted, it is divided into multiple subtasks that are executed in sequence. The next subtask is executed only after the current subtask succeeds. The request task ends when all subtasks are completed. The request task terminates in the following situations. You must resolve the issue based on the error code and resubmit the request task:</p>
     * <ul>
     * <li>The request task fails to be submitted.</li>
     * <li>After the request task is submitted, any subtask fails.</li>
     * </ul>
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
         * <p>The detailed execution status of the current subtask:</p>
         * <ul>
         * <li>If the execution succeeds, &quot;success&quot; is returned.</li>
         * <li>If the execution fails, the corresponding error details are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the subtask to be executed next. If this field is empty, all subtasks have been completed.</p>
         * 
         * <strong>example:</strong>
         * <p>abc1</p>
         */
        @NameInMap("NextTaskId")
        public String nextTaskId;

        /**
         * <p>The status of the current subtask. Valid values:</p>
         * <ul>
         * <li>operating: The subtask is being executed.</li>
         * <li>success: The subtask is executed.</li>
         * <li>failure: The subtask failed to be executed. For detailed error information, see the Content parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the current subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>abc2</p>
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
