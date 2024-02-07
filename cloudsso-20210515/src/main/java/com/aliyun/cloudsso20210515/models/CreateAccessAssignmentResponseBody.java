// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessAssignmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried task.</p>
     */
    @NameInMap("Task")
    public CreateAccessAssignmentResponseBodyTask task;

    public static CreateAccessAssignmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessAssignmentResponseBody self = new CreateAccessAssignmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessAssignmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessAssignmentResponseBody setTask(CreateAccessAssignmentResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public CreateAccessAssignmentResponseBodyTask getTask() {
        return this.task;
    }

    public static class CreateAccessAssignmentResponseBodyTask extends TeaModel {
        /**
         * <p>The ID of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The ID of the CloudSSO identity.</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The name of the CloudSSO identity.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the CloudSSO identity. Valid values:</p>
         * <br>
         * <p>*   User</p>
         * <p>*   Group</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The task status. Valid values:</p>
         * <br>
         * <p>*   InProgress: The task is running.</p>
         * <p>*   Success: The task is successful.</p>
         * <p>*   Failed: The task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task object.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the task object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path ID of the task object in the resource directory.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The path name of the task object in the resource directory.</p>
         */
        @NameInMap("TargetPathName")
        public String targetPathName;

        /**
         * <p>The type of the task object. The value is fixed as RD-Account, which indicates the accounts in the resource directory.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. The value is fixed as CreateAccessAssignment, which indicates that access permissions on an account in your resource directory are assigned.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static CreateAccessAssignmentResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessAssignmentResponseBodyTask self = new CreateAccessAssignmentResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public CreateAccessAssignmentResponseBodyTask setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public CreateAccessAssignmentResponseBodyTask setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public CreateAccessAssignmentResponseBodyTask setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public CreateAccessAssignmentResponseBodyTask setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public CreateAccessAssignmentResponseBodyTask setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public CreateAccessAssignmentResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAccessAssignmentResponseBodyTask setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public CreateAccessAssignmentResponseBodyTask setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public CreateAccessAssignmentResponseBodyTask setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public CreateAccessAssignmentResponseBodyTask setTargetPathName(String targetPathName) {
            this.targetPathName = targetPathName;
            return this;
        }
        public String getTargetPathName() {
            return this.targetPathName;
        }

        public CreateAccessAssignmentResponseBodyTask setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateAccessAssignmentResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateAccessAssignmentResponseBodyTask setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
