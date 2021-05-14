// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupSetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("BackupSets")
    @Validation(required = true)
    public DescribeBackupSetsResponseBackupSets backupSets;

    public static DescribeBackupSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetsResponse self = new DescribeBackupSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSetsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupSetsResponse setBackupSets(DescribeBackupSetsResponseBackupSets backupSets) {
        this.backupSets = backupSets;
        return this;
    }
    public DescribeBackupSetsResponseBackupSets getBackupSets() {
        return this.backupSets;
    }

    public static class DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs extends TeaModel {
        // backupDb
        @NameInMap("backupDb")
        @Validation(required = true)
        public java.util.List<String> backupDb;

        public static DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs self = new DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs setBackupDb(java.util.List<String> backupDb) {
            this.backupDb = backupDb;
            return this;
        }
        public java.util.List<String> getBackupDb() {
            return this.backupDb;
        }

    }

    public static class DescribeBackupSetsResponseBackupSetsBackupSet extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("BackupStartTime")
        @Validation(required = true)
        public Long backupStartTime;

        @NameInMap("BackupEndTime")
        @Validation(required = true)
        public Long backupEndTime;

        @NameInMap("BackupMode")
        @Validation(required = true)
        public String backupMode;

        @NameInMap("BackupLevel")
        @Validation(required = true)
        public String backupLevel;

        @NameInMap("BackupType")
        @Validation(required = true)
        public String backupType;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        @NameInMap("EnableRecovery")
        @Validation(required = true)
        public Boolean enableRecovery;

        @NameInMap("BackupTotalSize")
        @Validation(required = true)
        public String backupTotalSize;

        @NameInMap("BackupConsitentTime")
        @Validation(required = true)
        public String backupConsitentTime;

        @NameInMap("BackupDbs")
        @Validation(required = true)
        public DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs backupDbs;

        public static DescribeBackupSetsResponseBackupSetsBackupSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetsResponseBackupSetsBackupSet self = new DescribeBackupSetsResponseBackupSetsBackupSet();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupStartTime(Long backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupEndTime(Long backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public Long getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupLevel(String backupLevel) {
            this.backupLevel = backupLevel;
            return this;
        }
        public String getBackupLevel() {
            return this.backupLevel;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setEnableRecovery(Boolean enableRecovery) {
            this.enableRecovery = enableRecovery;
            return this;
        }
        public Boolean getEnableRecovery() {
            return this.enableRecovery;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupTotalSize(String backupTotalSize) {
            this.backupTotalSize = backupTotalSize;
            return this;
        }
        public String getBackupTotalSize() {
            return this.backupTotalSize;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupConsitentTime(String backupConsitentTime) {
            this.backupConsitentTime = backupConsitentTime;
            return this;
        }
        public String getBackupConsitentTime() {
            return this.backupConsitentTime;
        }

        public DescribeBackupSetsResponseBackupSetsBackupSet setBackupDbs(DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs backupDbs) {
            this.backupDbs = backupDbs;
            return this;
        }
        public DescribeBackupSetsResponseBackupSetsBackupSetBackupDbs getBackupDbs() {
            return this.backupDbs;
        }

    }

    public static class DescribeBackupSetsResponseBackupSets extends TeaModel {
        @NameInMap("backupSet")
        @Validation(required = true)
        public java.util.List<DescribeBackupSetsResponseBackupSetsBackupSet> backupSet;

        public static DescribeBackupSetsResponseBackupSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetsResponseBackupSets self = new DescribeBackupSetsResponseBackupSets();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetsResponseBackupSets setBackupSet(java.util.List<DescribeBackupSetsResponseBackupSetsBackupSet> backupSet) {
            this.backupSet = backupSet;
            return this;
        }
        public java.util.List<DescribeBackupSetsResponseBackupSetsBackupSet> getBackupSet() {
            return this.backupSet;
        }

    }

}
