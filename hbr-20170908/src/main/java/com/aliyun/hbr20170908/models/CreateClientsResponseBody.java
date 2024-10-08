// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateClientsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status of the ECS instance. If you specify more than one instance IDs in the request and the status of an ECS instance does not meet the requirements to install an HBR client, an error message is returned based on the value of this parameter.</p>
     */
    @NameInMap("InstanceStatuses")
    public CreateClientsResponseBodyInstanceStatuses instanceStatuses;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4A8A9AE4-F798-5E6D-853E-10F9F5A1BD4E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the asynchronous job. You can call the DescribeTask operation to query the execution result of an asynchronous job.</p>
     * 
     * <strong>example:</strong>
     * <p>t-000h9x5t02vhyksf1x7k</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientsResponseBody self = new CreateClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateClientsResponseBody setInstanceStatuses(CreateClientsResponseBodyInstanceStatuses instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }
    public CreateClientsResponseBodyInstanceStatuses getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public CreateClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateClientsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class CreateClientsResponseBodyInstanceStatusesInstanceStatus extends TeaModel {
        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zegp3cdu******uj9i</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether an HBR client can be installed on the ECS instance. Valid values:</p>
         * <ul>
         * <li>true: An HBR client can be installed on the ECS instance.</li>
         * <li>false: An HBR client cannot be installed on the ECS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ValidInstance")
        public Boolean validInstance;

        public static CreateClientsResponseBodyInstanceStatusesInstanceStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateClientsResponseBodyInstanceStatusesInstanceStatus self = new CreateClientsResponseBodyInstanceStatusesInstanceStatus();
            return TeaModel.build(map, self);
        }

        public CreateClientsResponseBodyInstanceStatusesInstanceStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateClientsResponseBodyInstanceStatusesInstanceStatus setValidInstance(Boolean validInstance) {
            this.validInstance = validInstance;
            return this;
        }
        public Boolean getValidInstance() {
            return this.validInstance;
        }

    }

    public static class CreateClientsResponseBodyInstanceStatuses extends TeaModel {
        @NameInMap("InstanceStatus")
        public java.util.List<CreateClientsResponseBodyInstanceStatusesInstanceStatus> instanceStatus;

        public static CreateClientsResponseBodyInstanceStatuses build(java.util.Map<String, ?> map) throws Exception {
            CreateClientsResponseBodyInstanceStatuses self = new CreateClientsResponseBodyInstanceStatuses();
            return TeaModel.build(map, self);
        }

        public CreateClientsResponseBodyInstanceStatuses setInstanceStatus(java.util.List<CreateClientsResponseBodyInstanceStatusesInstanceStatus> instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public java.util.List<CreateClientsResponseBodyInstanceStatusesInstanceStatus> getInstanceStatus() {
            return this.instanceStatus;
        }

    }

}
