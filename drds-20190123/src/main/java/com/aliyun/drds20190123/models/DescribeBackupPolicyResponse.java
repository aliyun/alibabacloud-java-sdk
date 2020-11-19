// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("BackupPolicyDO")
    @Validation(required = true)
    public DescribeBackupPolicyResponseBackupPolicyDO backupPolicyDO;

    public static DescribeBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponse self = new DescribeBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupPolicyResponse setBackupPolicyDO(DescribeBackupPolicyResponseBackupPolicyDO backupPolicyDO) {
        this.backupPolicyDO = backupPolicyDO;
        return this;
    }
    public DescribeBackupPolicyResponseBackupPolicyDO getBackupPolicyDO() {
        return this.backupPolicyDO;
    }

    public static class DescribeBackupPolicyResponseBackupPolicyDO extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("BackupPolicyMode")
        @Validation(required = true)
        public String backupPolicyMode;

        @NameInMap("BackupType")
        @Validation(required = true)
        public String backupType;

        @NameInMap("BackupLevel")
        @Validation(required = true)
        public String backupLevel;

        @NameInMap("BackupDbName")
        @Validation(required = true)
        public String backupDbName;

        @NameInMap("PreferredBackupTime")
        @Validation(required = true)
        public String preferredBackupTime;

        @NameInMap("PreferredBackupPeriod")
        @Validation(required = true)
        public String preferredBackupPeriod;

        @NameInMap("DataBackupRetentionPeriod")
        @Validation(required = true)
        public Long dataBackupRetentionPeriod;

        @NameInMap("LogBackupRetentionPeriod")
        @Validation(required = true)
        public Long logBackupRetentionPeriod;

        @NameInMap("BackupRetentionPeriod")
        @Validation(required = true)
        public Long backupRetentionPeriod;

        @NameInMap("BackupLog")
        @Validation(required = true)
        public String backupLog;

        @NameInMap("LocalLogRetentionHours")
        @Validation(required = true)
        public Long localLogRetentionHours;

        @NameInMap("LocalLogRetentionSpace")
        @Validation(required = true)
        public Long localLogRetentionSpace;

        @NameInMap("HighSpaceUsageProtection")
        @Validation(required = true)
        public Long highSpaceUsageProtection;

        @NameInMap("BackupAppName")
        @Validation(required = true)
        public String backupAppName;

        @NameInMap("BackupMode")
        @Validation(required = true)
        public String backupMode;

        @NameInMap("NextBackupActuallyTime")
        @Validation(required = true)
        public String nextBackupActuallyTime;

        public static DescribeBackupPolicyResponseBackupPolicyDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBackupPolicyDO self = new DescribeBackupPolicyResponseBackupPolicyDO();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupPolicyMode(String backupPolicyMode) {
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }
        public String getBackupPolicyMode() {
            return this.backupPolicyMode;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupDbName(String backupDbName) {
            this.backupDbName = backupDbName;
            return this;
        }
        public String getBackupDbName() {
            return this.backupDbName;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setPreferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }
        public String getPreferredBackupTime() {
            return this.preferredBackupTime;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setDataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }
        public Long getDataBackupRetentionPeriod() {
            return this.dataBackupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public Long getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupRetentionPeriod(Long backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Long getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }
        public String getBackupLog() {
            return this.backupLog;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setLocalLogRetentionHours(Long localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }
        public Long getLocalLogRetentionHours() {
            return this.localLogRetentionHours;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setLocalLogRetentionSpace(Long localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }
        public Long getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setHighSpaceUsageProtection(Long highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }
        public Long getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupAppName(String backupAppName) {
            this.backupAppName = backupAppName;
            return this;
        }
        public String getBackupAppName() {
            return this.backupAppName;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupPolicyResponseBackupPolicyDO setNextBackupActuallyTime(String nextBackupActuallyTime) {
            this.nextBackupActuallyTime = nextBackupActuallyTime;
            return this;
        }
        public String getNextBackupActuallyTime() {
            return this.nextBackupActuallyTime;
        }

    }

}
