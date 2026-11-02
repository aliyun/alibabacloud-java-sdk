// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ProvisionAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DFDC16B2-4509-5FA6-9FA5-3CD35E4292FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task information.</p>
     */
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
        /**
         * <p>The access configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS-Admin</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the deployment target belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        @NameInMap("OriginTargetId")
        public String originTargetId;

        /**
         * <p>The status of the task. Valid values:</p>
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
         * <p>The ID of the deployment target.</p>
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
         * <p>t-shqlhd8uvt280rtm****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>ProvisionAccessConfiguration: The task provisions an access configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ProvisionAccessConfiguration</p>
         */
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

        public ProvisionAccessConfigurationResponseBodyTasks setOriginTargetId(String originTargetId) {
            this.originTargetId = originTargetId;
            return this;
        }
        public String getOriginTargetId() {
            return this.originTargetId;
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
