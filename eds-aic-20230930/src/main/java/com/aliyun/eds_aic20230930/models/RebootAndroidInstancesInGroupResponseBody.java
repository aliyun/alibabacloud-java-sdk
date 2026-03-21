// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootAndroidInstancesInGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>227CBB4C-F5DC-589D-A667-C5CA3D52****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public RebootAndroidInstancesInGroupResponseBodyTasks tasks;

    public static RebootAndroidInstancesInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootAndroidInstancesInGroupResponseBody self = new RebootAndroidInstancesInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootAndroidInstancesInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebootAndroidInstancesInGroupResponseBody setTasks(RebootAndroidInstancesInGroupResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public RebootAndroidInstancesInGroupResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class RebootAndroidInstancesInGroupResponseBodyTasksChildTasks extends TeaModel {
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

        public static RebootAndroidInstancesInGroupResponseBodyTasksChildTasks build(java.util.Map<String, ?> map) throws Exception {
            RebootAndroidInstancesInGroupResponseBodyTasksChildTasks self = new RebootAndroidInstancesInGroupResponseBodyTasksChildTasks();
            return TeaModel.build(map, self);
        }

        public RebootAndroidInstancesInGroupResponseBodyTasksChildTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RebootAndroidInstancesInGroupResponseBodyTasksChildTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class RebootAndroidInstancesInGroupResponseBodyTasks extends TeaModel {
        @NameInMap("ChildTasks")
        public java.util.List<RebootAndroidInstancesInGroupResponseBodyTasksChildTasks> childTasks;

        /**
         * <strong>example:</strong>
         * <p>t-xxxx</p>
         */
        @NameInMap("ParentTaskId")
        public String parentTaskId;

        public static RebootAndroidInstancesInGroupResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            RebootAndroidInstancesInGroupResponseBodyTasks self = new RebootAndroidInstancesInGroupResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public RebootAndroidInstancesInGroupResponseBodyTasks setChildTasks(java.util.List<RebootAndroidInstancesInGroupResponseBodyTasksChildTasks> childTasks) {
            this.childTasks = childTasks;
            return this;
        }
        public java.util.List<RebootAndroidInstancesInGroupResponseBodyTasksChildTasks> getChildTasks() {
            return this.childTasks;
        }

        public RebootAndroidInstancesInGroupResponseBodyTasks setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

    }

}
