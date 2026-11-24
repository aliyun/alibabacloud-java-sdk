// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibDistributeTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         * <p>The time when the task was created. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782268092</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test_task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>test software</p>
         */
        @NameInMap("SoftwareName")
        public String softwareName;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: Enabled.</li>
         * <li><strong>disabled</strong>: Disabled.</li>
         * </ul>
         * <p>After a task is created, its initial status is disabled.</p>
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
         * <li><strong>Mac(Apple)</strong>: macOS on Apple silicon.</li>
         * <li><strong>Mac(Intel)</strong>: macOS on Intel processors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("SupportOs")
        public String supportOs;

        /**
         * <p>The ID of the task. You can use the ID to query the task execution result.</p>
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
