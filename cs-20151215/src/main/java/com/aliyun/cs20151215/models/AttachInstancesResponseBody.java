// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of node addition information.</p>
     */
    @NameInMap("list")
    public java.util.List<AttachInstancesResponseBodyList> list;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-5a544aff80282e39ea00****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static AttachInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesResponseBody self = new AttachInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachInstancesResponseBody setList(java.util.List<AttachInstancesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AttachInstancesResponseBodyList> getList() {
        return this.list;
    }

    public AttachInstancesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class AttachInstancesResponseBodyList extends TeaModel {
        /**
         * <p>The status code of the node addition result.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze0lgm3y6iylcbt****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The description of the node addition result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("message")
        public String message;

        public static AttachInstancesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            AttachInstancesResponseBodyList self = new AttachInstancesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public AttachInstancesResponseBodyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachInstancesResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachInstancesResponseBodyList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
