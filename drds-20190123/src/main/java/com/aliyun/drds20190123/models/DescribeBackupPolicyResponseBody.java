// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The information about the backup policy.</p>
     */
    @NameInMap("BackupPolicyDO")
    public DescribeBackupPolicyResponseBodyBackupPolicyDO backupPolicyDO;

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

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupPolicyDO(DescribeBackupPolicyResponseBodyBackupPolicyDO backupPolicyDO) {
        this.backupPolicyDO = backupPolicyDO;
        return this;
    }
    public DescribeBackupPolicyResponseBodyBackupPolicyDO getBackupPolicyDO() {
        return this.backupPolicyDO;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupPolicyResponseBodyBackupPolicyDO extends TeaModel {
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
         * <p>The backup level. Valid values:</p>
         * <br>
         * <p>*   **db**: database backup</p>
         * <p>*   **instance**: instance backup</p>
         */
        @NameInMap("BackupLevel")
        public String backupLevel;

        /**
         * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: The log backup feature is enabled.</p>
         * <p>*   **0**: The log backup feature is disabled.</p>
         */
        @NameInMap("BackupLog")
        public String backupLog;

        /**
         * <p>The backup mode. Valid values:</p>
         * <br>
         * <p>*   **logic**: logical backup</p>
         * <p>*   **phy**: fast backup</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The type of the backup policy. Valid values:</p>
         * <br>
         * <p>*   **DataBackupPolicy**: a data backup policy</p>
         * <p>*   **LogBackupPolicy**: a log backup policy</p>
         */
        @NameInMap("BackupPolicyMode")
        public String backupPolicyMode;

        /**
         * <p>The retention period of backup files. Unit: days.</p>
         */
        @NameInMap("BackupRetentionPeriod")
        public Long backupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The retention period of data backup files. Unit: days.</p>
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
         * <p>No value is returned.</p>
         */
        @NameInMap("HighSpaceUsageProtection")
        public Long highSpaceUsageProtection;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("LocalLogRetentionHours")
        public Long localLogRetentionHours;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("LocalLogRetentionSpace")
        public Long localLogRetentionSpace;

        /**
         * <p>The retention period of log backup files. Unit: days.</p>
         */
        @NameInMap("LogBackupRetentionPeriod")
        public Long logBackupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         */
        @NameInMap("NextBackupActuallyTime")
        public String nextBackupActuallyTime;

        /**
         * <p>The backup cycle. You can specify multiple backup cycles. Separate multiple backup cycles with commas (,). Valid values:</p>
         * <br>
         * <p>*   **0**: every Monday</p>
         * <p>*   **1**: every Tuesday</p>
         * <p>*   **2**: every Wednesday</p>
         * <p>*   **3**: every Thursday</p>
         * <p>*   **4**: every Friday</p>
         * <p>*   **5**: every Saturday</p>
         * <p>*   **6**: every Sunday</p>
         */
        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        /**
         * <p>The time range in which a backup is performed. The time is displayed in UTC.</p>
         */
        @NameInMap("PreferredBackupTime")
        public String preferredBackupTime;

        public static DescribeBackupPolicyResponseBodyBackupPolicyDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyBackupPolicyDO self = new DescribeBackupPolicyResponseBodyBackupPolicyDO();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupAppName(String backupAppName) {
            this.backupAppName = backupAppName;
            return this;
        }
        public String getBackupAppName() {
            return this.backupAppName;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupDbName(String backupDbName) {
            this.backupDbName = backupDbName;
            return this;
        }
        public String getBackupDbName() {
            return this.backupDbName;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }
        public String getBackupLog() {
            return this.backupLog;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupPolicyMode(String backupPolicyMode) {
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }
        public String getBackupPolicyMode() {
            return this.backupPolicyMode;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupRetentionPeriod(Long backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Long getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setDataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }
        public Long getDataBackupRetentionPeriod() {
            return this.dataBackupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setHighSpaceUsageProtection(Long highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }
        public Long getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setLocalLogRetentionHours(Long localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }
        public Long getLocalLogRetentionHours() {
            return this.localLogRetentionHours;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setLocalLogRetentionSpace(Long localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }
        public Long getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public Long getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setNextBackupActuallyTime(String nextBackupActuallyTime) {
            this.nextBackupActuallyTime = nextBackupActuallyTime;
            return this;
        }
        public String getNextBackupActuallyTime() {
            return this.nextBackupActuallyTime;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setPreferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }
        public String getPreferredBackupPeriod() {
            return this.preferredBackupPeriod;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDO setPreferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }
        public String getPreferredBackupTime() {
            return this.preferredBackupTime;
        }

    }

}
