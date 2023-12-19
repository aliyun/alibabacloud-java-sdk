// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpgradeBackupClientsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status of the ECS instance. If the status of an ECS instance cannot meet the requirements to install an HBR client and the value of the InstanceIds parameter is greater than 1, an error message is returned based on the value of this parameter.</p>
     */
    @NameInMap("InstanceStatuses")
    public java.util.List<UpgradeBackupClientsResponseBodyInstanceStatuses> instanceStatuses;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the asynchronous job. You can call the DescribeTask operation to query the execution result of an asynchronous job.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeBackupClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupClientsResponseBody self = new UpgradeBackupClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeBackupClientsResponseBody setInstanceStatuses(java.util.List<UpgradeBackupClientsResponseBodyInstanceStatuses> instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }
    public java.util.List<UpgradeBackupClientsResponseBodyInstanceStatuses> getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public UpgradeBackupClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeBackupClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeBackupClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradeBackupClientsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class UpgradeBackupClientsResponseBodyInstanceStatuses extends TeaModel {
        /**
         * <p>The error code that is returned. Valid values:</p>
         * <br>
         * <p>*   If the value is empty, the call is successful.</p>
         * <p>*   **InstanceNotExists**: The ECS instance does not exist.</p>
         * <p>*   **InstanceNotRunning**: The ECS instance is not running.</p>
         * <p>*   **CloudAssistNotRunningOnInstance**: Cloud Assistant is unavailable.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether an HBR client can be installed on the ECS instance. Valid values:</p>
         * <br>
         * <p>*   true: An HBR client can be installed on the ECS instance.</p>
         * <p>*   false: An HBR client cannot be installed on the ECS instance.</p>
         */
        @NameInMap("ValidInstance")
        public Boolean validInstance;

        public static UpgradeBackupClientsResponseBodyInstanceStatuses build(java.util.Map<String, ?> map) throws Exception {
            UpgradeBackupClientsResponseBodyInstanceStatuses self = new UpgradeBackupClientsResponseBodyInstanceStatuses();
            return TeaModel.build(map, self);
        }

        public UpgradeBackupClientsResponseBodyInstanceStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpgradeBackupClientsResponseBodyInstanceStatuses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpgradeBackupClientsResponseBodyInstanceStatuses setValidInstance(Boolean validInstance) {
            this.validInstance = validInstance;
            return this;
        }
        public Boolean getValidInstance() {
            return this.validInstance;
        }

    }

}
