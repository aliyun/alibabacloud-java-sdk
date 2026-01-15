// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BatchGetAcpConnectionTicketResponseBody extends TeaModel {
    /**
     * <p>The results of the instance connection tasks.</p>
     */
    @NameInMap("InstanceConnectionModels")
    public java.util.List<BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels> instanceConnectionModels;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-1uzb6heg797z3****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-ajxvwo1u0hqvd****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PersistentAppInstanceId")
        public String persistentAppInstanceId;

        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou@c9f5c2e8-f5c4-4b01-8602-000cae94****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The state of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The ticket used to connect to the cloud phone instance.</p>
         * 
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

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setPersistentAppInstanceId(String persistentAppInstanceId) {
            this.persistentAppInstanceId = persistentAppInstanceId;
            return this;
        }
        public String getPersistentAppInstanceId() {
            return this.persistentAppInstanceId;
        }

        public BatchGetAcpConnectionTicketResponseBodyInstanceConnectionModels setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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
