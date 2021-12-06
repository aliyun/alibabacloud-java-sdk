// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeprovisionAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<DeprovisionAccessConfigurationResponseBodyTasks> tasks;

    public static DeprovisionAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionAccessConfigurationResponseBody self = new DeprovisionAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeprovisionAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeprovisionAccessConfigurationResponseBody setTasks(java.util.List<DeprovisionAccessConfigurationResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DeprovisionAccessConfigurationResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class DeprovisionAccessConfigurationResponseBodyTasks extends TeaModel {
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

        public static DeprovisionAccessConfigurationResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DeprovisionAccessConfigurationResponseBodyTasks self = new DeprovisionAccessConfigurationResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTargetPathName(String targetPathName) {
            this.targetPathName = targetPathName;
            return this;
        }
        public String getTargetPathName() {
            return this.targetPathName;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeprovisionAccessConfigurationResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
