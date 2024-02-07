// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("Task")
    public DeleteAccessAssignmentResponseBodyTask task;

    public static DeleteAccessAssignmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessAssignmentResponseBody self = new DeleteAccessAssignmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessAssignmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAccessAssignmentResponseBody setTask(DeleteAccessAssignmentResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public DeleteAccessAssignmentResponseBodyTask getTask() {
        return this.task;
    }

    public static class DeleteAccessAssignmentResponseBodyTask extends TeaModel {
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
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. The value is fixed as DeleteAccessAssignment, which indicates that access permissions on an account in your resource directory are removed.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DeleteAccessAssignmentResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            DeleteAccessAssignmentResponseBodyTask self = new DeleteAccessAssignmentResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public DeleteAccessAssignmentResponseBodyTask setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public DeleteAccessAssignmentResponseBodyTask setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public DeleteAccessAssignmentResponseBodyTask setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public DeleteAccessAssignmentResponseBodyTask setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public DeleteAccessAssignmentResponseBodyTask setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public DeleteAccessAssignmentResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteAccessAssignmentResponseBodyTask setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DeleteAccessAssignmentResponseBodyTask setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DeleteAccessAssignmentResponseBodyTask setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public DeleteAccessAssignmentResponseBodyTask setTargetPathName(String targetPathName) {
            this.targetPathName = targetPathName;
            return this;
        }
        public String getTargetPathName() {
            return this.targetPathName;
        }

        public DeleteAccessAssignmentResponseBodyTask setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DeleteAccessAssignmentResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeleteAccessAssignmentResponseBodyTask setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
