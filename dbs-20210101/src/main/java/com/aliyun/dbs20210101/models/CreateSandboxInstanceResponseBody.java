// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateSandboxInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public CreateSandboxInstanceResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateSandboxInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxInstanceResponseBody self = new CreateSandboxInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSandboxInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSandboxInstanceResponseBody setData(CreateSandboxInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSandboxInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateSandboxInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateSandboxInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateSandboxInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSandboxInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSandboxInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSandboxInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the backup plan.</p>
         */
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        /**
         * <p>The ID of the sandbox instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateSandboxInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSandboxInstanceResponseBodyData self = new CreateSandboxInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSandboxInstanceResponseBodyData setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public CreateSandboxInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
