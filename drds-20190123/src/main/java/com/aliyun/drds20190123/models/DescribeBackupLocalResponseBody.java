// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupLocalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("BackupPolicyDO")
    public DescribeBackupLocalResponseBodyBackupPolicyDO backupPolicyDO;

    public static DescribeBackupLocalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLocalResponseBody self = new DescribeBackupLocalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLocalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupLocalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupLocalResponseBody setBackupPolicyDO(DescribeBackupLocalResponseBodyBackupPolicyDO backupPolicyDO) {
        this.backupPolicyDO = backupPolicyDO;
        return this;
    }
    public DescribeBackupLocalResponseBodyBackupPolicyDO getBackupPolicyDO() {
        return this.backupPolicyDO;
    }

    public static class DescribeBackupLocalResponseBodyBackupPolicyDO extends TeaModel {
        @NameInMap("BackupDbName")
        public String backupDbName;

        @NameInMap("LogBackupRetentionPeriod")
        public Long logBackupRetentionPeriod;

        @NameInMap("DataBackupRetentionPeriod")
        public Long dataBackupRetentionPeriod;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupLevel")
        public String backupLevel;

        @NameInMap("LocalLogRetentionHours")
        public Long localLogRetentionHours;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HighSpaceUsageProtection")
        public Long highSpaceUsageProtection;

        @NameInMap("BackupPolicyMode")
        public String backupPolicyMode;

        @NameInMap("BackupRetentionPeriod")
        public Long backupRetentionPeriod;

        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        @NameInMap("LocalLogRetentionSpace")
        public Long localLogRetentionSpace;

        @NameInMap("BackupAppName")
        public String backupAppName;

        @NameInMap("PreferredBackupTime")
        public String preferredBackupTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupLog")
        public String backupLog;

        @NameInMap("NextBackupActuallyTime")
        public String nextBackupActuallyTime;

        public static DescribeBackupLocalResponseBodyBackupPolicyDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLocalResponseBodyBackupPolicyDO self = new DescribeBackupLocalResponseBodyBackupPolicyDO();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupDbName(String backupDbName) {
            this.backupDbName = backupDbName;
            return this;
        }
        public String getBackupDbName() {
            return this.backupDbName;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public Long getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setDataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }
        public Long getDataBackupRetentionPeriod() {
            return this.dataBackupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setLocalLogRetentionHours(Long localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }
        public Long getLocalLogRetentionHours() {
            return this.localLogRetentionHours;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setHighSpaceUsageProtection(Long highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }
        public Long getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupPolicyMode(String backupPolicyMode) {
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }
        public String getBackupPolicyMode() {
            return this.backupPolicyMode;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupRetentionPeriod(Long backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Long getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setLocalLogRetentionSpace(Long localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }
        public Long getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupAppName(String backupAppName) {
            this.backupAppName = backupAppName;
            return this;
        }
        public String getBackupAppName() {
            return this.backupAppName;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setPreferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }
        public String getPreferredBackupTime() {
            return this.preferredBackupTime;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }
        public String getBackupLog() {
            return this.backupLog;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setNextBackupActuallyTime(String nextBackupActuallyTime) {
            this.nextBackupActuallyTime = nextBackupActuallyTime;
            return this;
        }
        public String getNextBackupActuallyTime() {
            return this.nextBackupActuallyTime;
        }

    }

}
