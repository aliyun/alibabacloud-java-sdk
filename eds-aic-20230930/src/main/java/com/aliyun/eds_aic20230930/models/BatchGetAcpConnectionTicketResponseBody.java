// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BatchGetAcpConnectionTicketResponseBody extends TeaModel {
    @NameInMap("InstanceConnectionModels")
    public java.util.List<BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels> instanceConnectionModels;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetAcpConnectionTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetAcpConnectionTicketResponseBody self = new BatchGetAcpConnectionTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetAcpConnectionTicketResponseBody setInstanceConnectionModels(java.util.List<BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels> instanceConnectionModels) {
        this.instanceConnectionModels = instanceConnectionModels;
        return this;
    }
    public java.util.List<BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels> getInstanceConnectionModels() {
        return this.instanceConnectionModels;
    }

    public BatchGetAcpConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aig-1uzb6heg797z3****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <strong>example:</strong>
         * <p>acp-ajxvwo1u0hqvd****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou@c9f5c2e8-f5c4-4b01-8602-000cae94****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>piVE58_AdmVSVW7SEW3<em>AE5</em>p8mmO5gvItsNOmv4S_f_cNpoU_BOTwChTBoNM1ZJeedfK9zxYnbN5hossqIZCr6t7SGxRigm2Cb4fGaCdBZWIzmgdHq6sXXZQg4KFWufyvpeV<em>0</em>Cm58slMT1tJw3****</p>
         */
        @NameInMap("Ticket")
        public String ticket;

        public static BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels build(java.util.Map<String, ?> map) throws Exception {
            BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels self = new BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels();
            return TeaModel.build(map, self);
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

    }

}
