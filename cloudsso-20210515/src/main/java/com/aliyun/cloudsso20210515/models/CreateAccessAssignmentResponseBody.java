// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessAssignmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4726AA56-E138-5C99-85E4-F493536D042F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task information.</p>
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
         * <li>Success: The task succeeded.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task target.</p>
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
         * <p>The target type of the task. Valid value: RD-Account, which indicates that the task target is an account in a resource directory.</p>
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
         * <p>t-sh6tceylhvgejpip****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid value: CreateAccessAssignment, which indicates an authorization task for an account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateAccessAssignment</p>
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

        public CreateAccessAssignmentResponseBodyTask setOriginTargetId(String originTargetId) {
            this.originTargetId = originTargetId;
            return this;
        }
        public String getOriginTargetId() {
            return this.originTargetId;
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
