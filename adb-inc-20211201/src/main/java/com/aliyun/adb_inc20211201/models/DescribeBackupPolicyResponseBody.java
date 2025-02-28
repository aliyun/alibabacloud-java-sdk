// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupPolicy")
    public DescribeBackupPolicyResponseBodyBackupPolicy backupPolicy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupPolicy(DescribeBackupPolicyResponseBodyBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }
    public DescribeBackupPolicyResponseBodyBackupPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupPolicyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupPolicyResponseBodyBackupPolicy extends TeaModel {
        @NameInMap("BackupLocationFull")
        public String backupLocationFull;

        @NameInMap("BackupLocationLog")
        public String backupLocationLog;

        @NameInMap("BackupRetentionPeriod")
        public Integer backupRetentionPeriod;

        @NameInMap("ClusterId")
        public Integer clusterId;

        @NameInMap("EnableBackupLog")
        public Boolean enableBackupLog;

        @NameInMap("LogBackupRetentionPeriod")
        public Integer logBackupRetentionPeriod;

        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        @NameInMap("PreferredBackupTime")
        public String preferredBackupTime;

        public static DescribeBackupPolicyResponseBodyBackupPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyBackupPolicy self = new DescribeBackupPolicyResponseBodyBackupPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setBackupLocationFull(String backupLocationFull) {
            this.backupLocationFull = backupLocationFull;
            return this;
        }
        public String getBackupLocationFull() {
            return this.backupLocationFull;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setBackupLocationLog(String backupLocationLog) {
            this.backupLocationLog = backupLocationLog;
            return this;
        }
        public String getBackupLocationLog() {
            return this.backupLocationLog;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setBackupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Integer getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setClusterId(Integer clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Integer getClusterId() {
            return this.clusterId;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setEnableBackupLog(Boolean enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }
        public Boolean getEnableBackupLog() {
            return this.enableBackupLog;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public Integer getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicy setPreferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }
        public String getPreferredBackupTime() {
            return this.preferredBackupTime;
        }

    }

}
