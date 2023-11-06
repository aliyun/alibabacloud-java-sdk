// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupSetsResponseBody extends TeaModel {
    /**
     * <p>The list of backup sets.</p>
     */
    @NameInMap("BackupSets")
    public DescribeBackupSetsResponseBodyBackupSets backupSets;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetsResponseBody self = new DescribeBackupSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetsResponseBody setBackupSets(DescribeBackupSetsResponseBodyBackupSets backupSets) {
        this.backupSets = backupSets;
        return this;
    }
    public DescribeBackupSetsResponseBodyBackupSets getBackupSets() {
        return this.backupSets;
    }

    public DescribeBackupSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs extends TeaModel {
        @NameInMap("backupDb")
        public java.util.List<String> backupDb;

        public static DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs self = new DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs setBackupDb(java.util.List<String> backupDb) {
            this.backupDb = backupDb;
            return this;
        }
        public java.util.List<String> getBackupDb() {
            return this.backupDb;
        }

    }

    public static class DescribeBackupSetsResponseBodyBackupSetsBackupSet extends TeaModel {
        /**
         * <p>Backup Recovery duration.</p>
         */
        @NameInMap("BackupConsitentTime")
        public String backupConsitentTime;

        /**
         * <p>The list of backup databases.</p>
         */
        @NameInMap("BackupDbs")
        public DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs backupDbs;

        /**
         * <p>The end of the backup time which is in timestamp format (measured in millisecond).</p>
         * <br>
         * <p>>  0 indicates not finished.</p>
         */
        @NameInMap("BackupEndTime")
        public Long backupEndTime;

        /**
         * <p>The level of the backup. Valid values:</p>
         * <br>
         * <p>*   db: The database level.</p>
         * <p>*   instance: the instance level.</p>
         */
        @NameInMap("BackupLevel")
        public String backupLevel;

        /**
         * <p>The backup method. Valid values:</p>
         * <br>
         * <p>*   logic: the logical backup.</p>
         * <p>*   phy: fast backup</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The beginning of the backup time which is in timestamp format (measured in millisecond).</p>
         */
        @NameInMap("BackupStartTime")
        public Long backupStartTime;

        /**
         * <p>The size of the backup set. Unit: MB.</p>
         */
        @NameInMap("BackupTotalSize")
        public String backupTotalSize;

        /**
         * <p>The type of the backup. Valid values:</p>
         * <br>
         * <p>*   manual: indicates a manual backup.</p>
         * <p>*   auto: indicates an automatic backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>Indicates whether the backup set can be restored. Valid values:</p>
         */
        @NameInMap("EnableRecovery")
        public Boolean enableRecovery;

        /**
         * <p>The ID of the data backup file you want to use.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The status of the backup instance. Valid values:</p>
         * <br>
         * <p>*   \-1: Failed</p>
         * <p>*   0: Not started</p>
         * <p>*   1: The storage instance is running.</p>
         * <p>*   2: Success</p>
         */
        @NameInMap("Status")
        public Long status;

        public static DescribeBackupSetsResponseBodyBackupSetsBackupSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetsResponseBodyBackupSetsBackupSet self = new DescribeBackupSetsResponseBodyBackupSetsBackupSet();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupConsitentTime(String backupConsitentTime) {
            this.backupConsitentTime = backupConsitentTime;
            return this;
        }
        public String getBackupConsitentTime() {
            return this.backupConsitentTime;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupDbs(DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs backupDbs) {
            this.backupDbs = backupDbs;
            return this;
        }
        public DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs getBackupDbs() {
            return this.backupDbs;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupEndTime(Long backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public Long getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupStartTime(Long backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupTotalSize(String backupTotalSize) {
            this.backupTotalSize = backupTotalSize;
            return this;
        }
        public String getBackupTotalSize() {
            return this.backupTotalSize;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setEnableRecovery(Boolean enableRecovery) {
            this.enableRecovery = enableRecovery;
            return this;
        }
        public Boolean getEnableRecovery() {
            return this.enableRecovery;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBackupSetsResponseBodyBackupSetsBackupSet setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class DescribeBackupSetsResponseBodyBackupSets extends TeaModel {
        @NameInMap("backupSet")
        public java.util.List<DescribeBackupSetsResponseBodyBackupSetsBackupSet> backupSet;

        public static DescribeBackupSetsResponseBodyBackupSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetsResponseBodyBackupSets self = new DescribeBackupSetsResponseBodyBackupSets();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetsResponseBodyBackupSets setBackupSet(java.util.List<DescribeBackupSetsResponseBodyBackupSetsBackupSet> backupSet) {
            this.backupSet = backupSet;
            return this;
        }
        public java.util.List<DescribeBackupSetsResponseBodyBackupSetsBackupSet> getBackupSet() {
            return this.backupSet;
        }

    }

}
