// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BatchGetAcpConnectionTicketRequest extends TeaModel {
    /**
     * <p>The connection mode.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The ID of the assigned user. If you do not specify this parameter, the system user assigned in the background is used to obtain the ticket.</p>
     * <p>&lt;props=&quot;china&quot;&gt;
     * The usage of this parameter varies based on the Cloud Phone edition and the instance streaming mode:</p>
     * <ul>
     * <li>Cloud Phone Instance Edition or Cloud Phone Matrix Edition (preemptive mode): You can obtain a <code>Ticket</code> only by using the same <code>EnduserId</code>.</li>
     * <li>Cloud Phone Matrix Edition (collaborative mode): You can pass different <code>EnduserId</code> values to obtain <code>Ticket</code> values and stream for different users (up to 5) at the same time. You can pass only one <code>EnduserId</code> at a time.</li>
     * </ul>
     * <blockquote>
     * <p>You can define the instance streaming mode by using the <code>StreamMode</code> parameter of the <code>ModifyCloudPhoneNode</code> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The instance group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-25nt4kk9whjh****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    /**
     * <p>The list of Cloud Phone instance IDs. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The instance connection tasks. This parameter is used to query whether the ticket retrieval task is completed.</p>
     */
    @NameInMap("InstanceTasks")
    public java.util.List<BatchGetAcpConnectionTicketRequestInstanceTasks> instanceTasks;

    /**
     * <p>The list of custom connection ports.</p>
     */
    @NameInMap("Ports")
    public java.util.List<String> ports;

    public static BatchGetAcpConnectionTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetAcpConnectionTicketRequest self = new BatchGetAcpConnectionTicketRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetAcpConnectionTicketRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
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

    public BatchGetAcpConnectionTicketRequest setPorts(java.util.List<String> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<String> getPorts() {
        return this.ports;
    }

    public static class BatchGetAcpConnectionTicketRequestInstanceTasks extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-fkuit0cmyfvzz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The task ID.</p>
         * 
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
