// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibDistributeTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B608C6AE-623D-55C4-9454-601B88AE937E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the created task.</p>
     */
    @NameInMap("Task")
    public CreateSoftwarelibDistributeTaskResponseBodyTask task;

    public static CreateSoftwarelibDistributeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSoftwarelibDistributeTaskResponseBody self = new CreateSoftwarelibDistributeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSoftwarelibDistributeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSoftwarelibDistributeTaskResponseBody setTask(CreateSoftwarelibDistributeTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public CreateSoftwarelibDistributeTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class CreateSoftwarelibDistributeTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The task creation time as a second-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782268092</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>test software</p>
         */
        @NameInMap("SoftwareName")
        public String softwareName;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: enabled.</li>
         * <li><strong>disabled</strong>: disabled.</li>
         * </ul>
         * <p>The initial status of a task after creation is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The operating system to which the task applies. Valid values:</p>
         * <ul>
         * <li><strong>Windows</strong>: Windows.</li>
         * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
         * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("SupportOs")
        public String supportOs;

        /**
         * <p>The task ID, which is used to query the task execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-distribute-task-911dd7898bc2****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateSoftwarelibDistributeTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            CreateSoftwarelibDistributeTaskResponseBodyTask self = new CreateSoftwarelibDistributeTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public CreateSoftwarelibDistributeTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateSoftwarelibDistributeTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSoftwarelibDistributeTaskResponseBodyTask setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public CreateSoftwarelibDistributeTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateSoftwarelibDistributeTaskResponseBodyTask setSupportOs(String supportOs) {
            this.supportOs = supportOs;
            return this;
        }
        public String getSupportOs() {
            return this.supportOs;
        }

        public CreateSoftwarelibDistributeTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
