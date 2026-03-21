// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-1ljew7on6ay0j****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Tasks")
    public UpdateInstanceImageResponseBodyTasks tasks;

    public static UpdateInstanceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceImageResponseBody self = new UpdateInstanceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceImageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateInstanceImageResponseBody setTasks(UpdateInstanceImageResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public UpdateInstanceImageResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class UpdateInstanceImageResponseBodyTasksChildTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>t-xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateInstanceImageResponseBodyTasksChildTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceImageResponseBodyTasksChildTasks self = new UpdateInstanceImageResponseBodyTasksChildTasks();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceImageResponseBodyTasksChildTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceImageResponseBodyTasksChildTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class UpdateInstanceImageResponseBodyTasks extends TeaModel {
        @NameInMap("ChildTasks")
        public java.util.List<UpdateInstanceImageResponseBodyTasksChildTasks> childTasks;

        /**
         * <strong>example:</strong>
         * <p>t-xxxx</p>
         */
        @NameInMap("ParentTaskId")
        public String parentTaskId;

        public static UpdateInstanceImageResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceImageResponseBodyTasks self = new UpdateInstanceImageResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceImageResponseBodyTasks setChildTasks(java.util.List<UpdateInstanceImageResponseBodyTasksChildTasks> childTasks) {
            this.childTasks = childTasks;
            return this;
        }
        public java.util.List<UpdateInstanceImageResponseBodyTasksChildTasks> getChildTasks() {
            return this.childTasks;
        }

        public UpdateInstanceImageResponseBodyTasks setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

    }

}
