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
     * 
     * <strong>example:</strong>
     * <p>8FAF3989-79CD-4A67-8FFD-97899B64****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BackupAppName")
        public String backupAppName;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BackupDbName")
        public String backupDbName;

        /**
         * <p>The backup level. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: database backup</li>
         * <li><strong>instance</strong>: instance backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("BackupLevel")
        public String backupLevel;

        /**
         * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The log backup feature is enabled.</li>
         * <li><strong>0</strong>: The log backup feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackupLog")
        public String backupLog;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>logic</strong>: logical backup</li>
         * <li><strong>phy</strong>: fast backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>phy</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The type of the backup policy. Valid values:</p>
         * <ul>
         * <li><strong>DataBackupPolicy</strong>: a data backup policy</li>
         * <li><strong>LogBackupPolicy</strong>: a log backup policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataBackupPolicy</p>
         */
        @NameInMap("BackupPolicyMode")
        public String backupPolicyMode;

        /**
         * <p>The retention period of backup files. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupRetentionPeriod")
        public Long backupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The retention period of data backup files. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataBackupRetentionPeriod")
        public Long dataBackupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HighSpaceUsageProtection")
        public Long highSpaceUsageProtection;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LocalLogRetentionHours")
        public Long localLogRetentionHours;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LocalLogRetentionSpace")
        public Long localLogRetentionSpace;

        /**
         * <p>The retention period of log backup files. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LogBackupRetentionPeriod")
        public Long logBackupRetentionPeriod;

        /**
         * <p>No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NextBackupActuallyTime")
        public String nextBackupActuallyTime;

        /**
         * <p>The backup cycle. You can specify multiple backup cycles. Separate multiple backup cycles with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: every Monday</li>
         * <li><strong>1</strong>: every Tuesday</li>
         * <li><strong>2</strong>: every Wednesday</li>
         * <li><strong>3</strong>: every Thursday</li>
         * <li><strong>4</strong>: every Friday</li>
         * <li><strong>5</strong>: every Saturday</li>
         * <li><strong>6</strong>: every Sunday</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,4</p>
         */
        @NameInMap("PreferredBackupPeriod")
        public String preferredBackupPeriod;

        /**
         * <p>The time range in which a backup is performed. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>22:00:00-23:00:00</p>
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
