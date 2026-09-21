// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateCloudPhoneNodeSystemImageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-ehs0yoedj0xe9****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("Tasks")
    public UpdateCloudPhoneNodeSystemImageResponseBodyTasks tasks;

    public static UpdateCloudPhoneNodeSystemImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudPhoneNodeSystemImageResponseBody self = new UpdateCloudPhoneNodeSystemImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudPhoneNodeSystemImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudPhoneNodeSystemImageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateCloudPhoneNodeSystemImageResponseBody setTasks(UpdateCloudPhoneNodeSystemImageResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public UpdateCloudPhoneNodeSystemImageResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The child task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks self = new UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks();
            return TeaModel.build(map, self);
        }

        public UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class UpdateCloudPhoneNodeSystemImageResponseBodyTasks extends TeaModel {
        /**
         * <p>The child tasks.</p>
         */
        @NameInMap("ChildTasks")
        public java.util.List<UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks> childTasks;

        /**
         * <p>The parent task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-xxxx</p>
         */
        @NameInMap("ParentTaskId")
        public String parentTaskId;

        public static UpdateCloudPhoneNodeSystemImageResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudPhoneNodeSystemImageResponseBodyTasks self = new UpdateCloudPhoneNodeSystemImageResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public UpdateCloudPhoneNodeSystemImageResponseBodyTasks setChildTasks(java.util.List<UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks> childTasks) {
            this.childTasks = childTasks;
            return this;
        }
        public java.util.List<UpdateCloudPhoneNodeSystemImageResponseBodyTasksChildTasks> getChildTasks() {
            return this.childTasks;
        }

        public UpdateCloudPhoneNodeSystemImageResponseBodyTasks setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

    }

}
