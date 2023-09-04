// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeprovisionAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the task.</p>
     */
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
         * <p>The status of the task. Valid values:</p>
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
         * <p>The path ID of the task object in your resource directory.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The path name of the task object in your resource directory.</p>
         */
        @NameInMap("TargetPathName")
        public String targetPathName;

        /**
         * <p>The type of the task object. The value is fixed as RD-Account, which indicates an accounts in your resource directory.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. The value is fixed as DeprovisionAccessConfiguration, which indicates that the access configuration is de-provisioned.</p>
         */
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
