// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeResponseBody extends TeaModel {
    // The error code.
    @NameInMap("Code")
    public String code;

    // The response parameters.
    @NameInMap("Data")
    public DescribeSandboxRecoveryTimeResponseBodyData data;

    // The error code.
    @NameInMap("ErrCode")
    public String errCode;

    // The error message.
    @NameInMap("ErrMessage")
    public String errMessage;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
    @NameInMap("Success")
    public String success;

    public static DescribeSandboxRecoveryTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxRecoveryTimeResponseBody self = new DescribeSandboxRecoveryTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxRecoveryTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSandboxRecoveryTimeResponseBody setData(DescribeSandboxRecoveryTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSandboxRecoveryTimeResponseBodyData getData() {
        return this.data;
    }

    public DescribeSandboxRecoveryTimeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSandboxRecoveryTimeResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSandboxRecoveryTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSandboxRecoveryTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSandboxRecoveryTimeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSandboxRecoveryTimeResponseBodyData extends TeaModel {
        // The backup schedule of the sandbox instance.
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        // The beginning of the time range during which the sandbox instance can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("RecoveryBeginTime")
        public String recoveryBeginTime;

        // The end of the time range during which the sandbox instance can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("RecoveryEndTime")
        public String recoveryEndTime;

        public static DescribeSandboxRecoveryTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSandboxRecoveryTimeResponseBodyData self = new DescribeSandboxRecoveryTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSandboxRecoveryTimeResponseBodyData setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeSandboxRecoveryTimeResponseBodyData setRecoveryBeginTime(String recoveryBeginTime) {
            this.recoveryBeginTime = recoveryBeginTime;
            return this;
        }
        public String getRecoveryBeginTime() {
            return this.recoveryBeginTime;
        }

        public DescribeSandboxRecoveryTimeResponseBodyData setRecoveryEndTime(String recoveryEndTime) {
            this.recoveryEndTime = recoveryEndTime;
            return this;
        }
        public String getRecoveryEndTime() {
            return this.recoveryEndTime;
        }

    }

}
