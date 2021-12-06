// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessAssignmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetPath")
        public String targetPath;

        @NameInMap("TargetPathName")
        public String targetPathName;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TaskId")
        public String taskId;

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
