// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSandboxRecoveryTimeResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        @NameInMap("RecoveryBeginTime")
        public String recoveryBeginTime;

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
