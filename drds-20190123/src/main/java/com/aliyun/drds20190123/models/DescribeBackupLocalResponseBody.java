// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupLocalResponseBody extends TeaModel {
    /**
     * <p>The information about the backup policy.</p>
     */
    @NameInMap("BackupPolicyDO")
    public DescribeBackupLocalResponseBodyBackupPolicyDO backupPolicyDO;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupLocalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLocalResponseBody self = new DescribeBackupLocalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLocalResponseBody setBackupPolicyDO(DescribeBackupLocalResponseBodyBackupPolicyDO backupPolicyDO) {
        this.backupPolicyDO = backupPolicyDO;
        return this;
    }
    public DescribeBackupLocalResponseBodyBackupPolicyDO getBackupPolicyDO() {
        return this.backupPolicyDO;
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

    public static class DescribeBackupLocalResponseBodyBackupPolicyDO extends TeaModel {
        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupAppName")
        public String backupAppName;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupDbName")
        public String backupDbName;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupLevel")
        public String backupLevel;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupLog")
        public String backupLog;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupPolicyMode")
        public String backupPolicyMode;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupRetentionPeriod")
        public Long backupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("DataBackupRetentionPeriod")
        public Long dataBackupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Indicates whether the feature is enabled to forcibly delete binary log files if the used storage space of the instance exceeds 90% of the total storage space or the remaining storage space is less than 5 GB. Valid values:</p>
         * <br>
         * <p>*   1: The feature is enabled.</p>
         * <p>*   0: The feature is disabled.</p>
         */
        @NameInMap("HighSpaceUsageProtection")
        public Long highSpaceUsageProtection;

        /**
         * <p>The number of hours for which log backup files are retained on the instance. Valid values: 0 to 168. Default value: **18**. The value **0** indicates that log backup files are not retained.</p>
         */
        @NameInMap("LocalLogRetentionHours")
        public Long localLogRetentionHours;

        /**
         * <p>The maximum storage usage that is allowed for local log files. Valid values: 0 to 50. Default value: 30.</p>
         */
        @NameInMap("LocalLogRetentionSpace")
        public Long localLogRetentionSpace;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("LogBackupRetentionPeriod")
        public Long logBackupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("NextBackupActuallyTime")
        public String nextBackupActuallyTime;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("PreferredBackupTime")
        public String preferredBackupTime;

        public static DescribeBackupLocalResponseBodyBackupPolicyDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLocalResponseBodyBackupPolicyDO self = new DescribeBackupLocalResponseBodyBackupPolicyDO();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupAppName(String backupAppName) {
            this.backupAppName = backupAppName;
            return this;
        }
        public String getBackupAppName() {
            return this.backupAppName;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupDbName(String backupDbName) {
            this.backupDbName = backupDbName;
            return this;
        }
        public String getBackupDbName() {
            return this.backupDbName;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }
        public String getBackupLog() {
            return this.backupLog;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
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

        public DescribeBackupLocalResponseBodyBackupPolicyDO setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setDataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }
        public Long getDataBackupRetentionPeriod() {
            return this.dataBackupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
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

        public DescribeBackupLocalResponseBodyBackupPolicyDO setLocalLogRetentionHours(Long localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }
        public Long getLocalLogRetentionHours() {
            return this.localLogRetentionHours;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setLocalLogRetentionSpace(Long localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }
        public Long getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public Long getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setNextBackupActuallyTime(String nextBackupActuallyTime) {
            this.nextBackupActuallyTime = nextBackupActuallyTime;
            return this;
        }
        public String getNextBackupActuallyTime() {
            return this.nextBackupActuallyTime;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeBackupLocalResponseBodyBackupPolicyDO setPreferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }
        public String getPreferredBackupTime() {
            return this.preferredBackupTime;
        }

    }

}
