// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UninstallBackupClientsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status of the ECS instance.</p>
     */
    @NameInMap("InstanceStatuses")
    public java.util.List<UninstallBackupClientsResponseBodyInstanceStatuses> instanceStatuses;

    /**
     * <p>The message that is returned. If the request is successful, a value of successful is returned. If the request fails, an error message is returned.</p>
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the asynchronous job. You can call the DescribeTask operation to query the execution result of the asynchronous job.</p>
     * 
     * <strong>example:</strong>
     * <p>t-*********************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UninstallBackupClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientsResponseBody self = new UninstallBackupClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UninstallBackupClientsResponseBody setInstanceStatuses(java.util.List<UninstallBackupClientsResponseBodyInstanceStatuses> instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }
    public java.util.List<UninstallBackupClientsResponseBodyInstanceStatuses> getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public UninstallBackupClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UninstallBackupClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallBackupClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UninstallBackupClientsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class UninstallBackupClientsResponseBodyInstanceStatuses extends TeaModel {
        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the value is empty, the request is successful.</li>
         * <li><strong>InstanceNotExists</strong>: The ECS instance does not exist.</li>
         * <li><strong>InstanceNotRunning</strong>: The ECS instance is not running.</li>
         * <li><strong>CloudAssistNotRunningOnInstance</strong>: Cloud Assistant is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-0xi5w***v3j3bh2gj5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether a backup client can be installed on the ECS instance.</p>
         * <ul>
         * <li>true: A backup client can be installed on the ECS instance.</li>
         * <li>false: A backup client cannot be installed on the ECS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ValidInstance")
        public Boolean validInstance;

        public static UninstallBackupClientsResponseBodyInstanceStatuses build(java.util.Map<String, ?> map) throws Exception {
            UninstallBackupClientsResponseBodyInstanceStatuses self = new UninstallBackupClientsResponseBodyInstanceStatuses();
            return TeaModel.build(map, self);
        }

        public UninstallBackupClientsResponseBodyInstanceStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UninstallBackupClientsResponseBodyInstanceStatuses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UninstallBackupClientsResponseBodyInstanceStatuses setValidInstance(Boolean validInstance) {
            this.validInstance = validInstance;
            return this;
        }
        public Boolean getValidInstance() {
            return this.validInstance;
        }

    }

}
