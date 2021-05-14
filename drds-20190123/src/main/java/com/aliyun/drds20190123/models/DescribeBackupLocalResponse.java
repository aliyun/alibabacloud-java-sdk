// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupLocalResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("BackupPolicyDO")
    @Validation(required = true)
    public DescribeBackupLocalResponseBackupPolicyDO backupPolicyDO;

    public static DescribeBackupLocalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLocalResponse self = new DescribeBackupLocalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLocalResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupLocalResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupLocalResponse setBackupPolicyDO(DescribeBackupLocalResponseBackupPolicyDO backupPolicyDO) {
        this.backupPolicyDO = backupPolicyDO;
        return this;
    }
    public DescribeBackupLocalResponseBackupPolicyDO getBackupPolicyDO() {
        return this.backupPolicyDO;
    }

    public static class DescribeBackupLocalResponseBackupPolicyDO extends TeaModel {
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

        public static DescribeBackupLocalResponseBackupPolicyDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLocalResponseBackupPolicyDO self = new DescribeBackupLocalResponseBackupPolicyDO();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLocalResponseBackupPolicyDO setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupPolicyMode(String backupPolicyMode) {
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }
        public String getBackupPolicyMode() {
            return this.backupPolicyMode;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupDbName(String backupDbName) {
            this.backupDbName = backupDbName;
            return this;
        }
        public String getBackupDbName() {
            return this.backupDbName;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setPreferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }
        public String getPreferredBackupTime() {
            return this.preferredBackupTime;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setDataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }
        public Long getDataBackupRetentionPeriod() {
            return this.dataBackupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public Long getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupRetentionPeriod(Long backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Long getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }
        public String getBackupLog() {
            return this.backupLog;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setLocalLogRetentionHours(Long localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }
        public Long getLocalLogRetentionHours() {
            return this.localLogRetentionHours;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setLocalLogRetentionSpace(Long localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }
        public Long getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setHighSpaceUsageProtection(Long highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }
        public Long getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupAppName(String backupAppName) {
            this.backupAppName = backupAppName;
            return this;
        }
        public String getBackupAppName() {
            return this.backupAppName;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupLocalResponseBackupPolicyDO setNextBackupActuallyTime(String nextBackupActuallyTime) {
            this.nextBackupActuallyTime = nextBackupActuallyTime;
            return this;
        }
        public String getNextBackupActuallyTime() {
            return this.nextBackupActuallyTime;
        }

    }

}
