// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BatchGetAcpConnectionTicketRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>ag-25nt4kk9whjh****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("InstanceTasks")
    public java.util.List<BatchGetAcpConnectionTicketRequestInstanceTasks> instanceTasks;

    public static BatchGetAcpConnectionTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetAcpConnectionTicketRequest self = new BatchGetAcpConnectionTicketRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetAcpConnectionTicketRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public BatchGetAcpConnectionTicketRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public BatchGetAcpConnectionTicketRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public BatchGetAcpConnectionTicketRequest setInstanceTasks(java.util.List<BatchGetAcpConnectionTicketRequestInstanceTasks> instanceTasks) {
        this.instanceTasks = instanceTasks;
        return this;
    }
    public java.util.List<BatchGetAcpConnectionTicketRequestInstanceTasks> getInstanceTasks() {
        return this.instanceTasks;
    }

    public static class BatchGetAcpConnectionTicketRequestInstanceTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-fkuit0cmyfvzz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou@c9f5c2e8-f5c4-4b01-8602-000cae94****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BatchGetAcpConnectionTicketRequestInstanceTasks build(java.util.Map<String, ?> map) throws Exception {
            BatchGetAcpConnectionTicketRequestInstanceTasks self = new BatchGetAcpConnectionTicketRequestInstanceTasks();
            return TeaModel.build(map, self);
        }

        public BatchGetAcpConnectionTicketRequestInstanceTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchGetAcpConnectionTicketRequestInstanceTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
