// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public ResetAndroidInstancesInGroupResponseBodyTasks tasks;

    public static ResetAndroidInstancesInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAndroidInstancesInGroupResponseBody self = new ResetAndroidInstancesInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAndroidInstancesInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetAndroidInstancesInGroupResponseBody setTasks(ResetAndroidInstancesInGroupResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public ResetAndroidInstancesInGroupResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class ResetAndroidInstancesInGroupResponseBodyTasksChildTasks extends TeaModel {
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

        public static ResetAndroidInstancesInGroupResponseBodyTasksChildTasks build(java.util.Map<String, ?> map) throws Exception {
            ResetAndroidInstancesInGroupResponseBodyTasksChildTasks self = new ResetAndroidInstancesInGroupResponseBodyTasksChildTasks();
            return TeaModel.build(map, self);
        }

        public ResetAndroidInstancesInGroupResponseBodyTasksChildTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ResetAndroidInstancesInGroupResponseBodyTasksChildTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ResetAndroidInstancesInGroupResponseBodyTasks extends TeaModel {
        @NameInMap("ChildTasks")
        public java.util.List<ResetAndroidInstancesInGroupResponseBodyTasksChildTasks> childTasks;

        /**
         * <strong>example:</strong>
         * <p>t-xxxx</p>
         */
        @NameInMap("ParentTaskId")
        public String parentTaskId;

        public static ResetAndroidInstancesInGroupResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ResetAndroidInstancesInGroupResponseBodyTasks self = new ResetAndroidInstancesInGroupResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ResetAndroidInstancesInGroupResponseBodyTasks setChildTasks(java.util.List<ResetAndroidInstancesInGroupResponseBodyTasksChildTasks> childTasks) {
            this.childTasks = childTasks;
            return this;
        }
        public java.util.List<ResetAndroidInstancesInGroupResponseBodyTasksChildTasks> getChildTasks() {
            return this.childTasks;
        }

        public ResetAndroidInstancesInGroupResponseBodyTasks setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

    }

}
