// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribeSandboxRecoveryTimeResponseBodyData data;

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
        /**
         * <p>The backup schedule of the sandbox instance.</p>
         */
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        /**
         * <p>The beginning of the time range during which the sandbox instance can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("RecoveryBeginTime")
        public String recoveryBeginTime;

        /**
         * <p>The end of the time range during which the sandbox instance can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
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
