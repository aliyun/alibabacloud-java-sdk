// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ProvisionAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ProvisionAccessConfigurationResponseBodyTasks> tasks;

    public static ProvisionAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProvisionAccessConfigurationResponseBody self = new ProvisionAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ProvisionAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProvisionAccessConfigurationResponseBody setTasks(java.util.List<ProvisionAccessConfigurationResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ProvisionAccessConfigurationResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ProvisionAccessConfigurationResponseBodyTasks extends TeaModel {
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

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

        public static ProvisionAccessConfigurationResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ProvisionAccessConfigurationResponseBodyTasks self = new ProvisionAccessConfigurationResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ProvisionAccessConfigurationResponseBodyTasks setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTargetPathName(String targetPathName) {
            this.targetPathName = targetPathName;
            return this;
        }
        public String getTargetPathName() {
            return this.targetPathName;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ProvisionAccessConfigurationResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
