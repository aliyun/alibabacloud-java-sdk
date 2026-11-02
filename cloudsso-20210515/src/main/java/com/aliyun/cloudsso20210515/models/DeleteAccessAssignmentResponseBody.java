// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C9D0CF4-5CE8-5CE6-932A-826EF4ADD007</p>
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
         * <p>The access configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The access configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS-Admin</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The Alibaba Cloud account ID of the authorization target.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        @NameInMap("OriginTargetId")
        public String originTargetId;

        /**
         * <p>The CloudSSO identity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The CloudSSO identity name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The CloudSSO identity type. Valid values:</p>
         * <ul>
         * <li>User: user</li>
         * <li>Group: group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>InProgress: The task is in progress.</li>
         * <li>Success: The task is successful.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The target ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the task target.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-test</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path ID of the task target in the resource directory.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The path name of the task target in the resource directory.</p>
         */
        @NameInMap("TargetPathName")
        public String targetPathName;

        /**
         * <p>The target type of the task. Valid values:</p>
         * <ul>
         * <li>RD-Account: The task target is an account in a resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-shfqw1u1edszvxw5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>DeleteAccessAssignment: The task removes an authorization from an account in a resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeleteAccessAssignment</p>
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

        public DeleteAccessAssignmentResponseBodyTask setOriginTargetId(String originTargetId) {
            this.originTargetId = originTargetId;
            return this;
        }
        public String getOriginTargetId() {
            return this.originTargetId;
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
