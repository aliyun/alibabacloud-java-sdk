// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupSetsResponseBody extends TeaModel {
    @NameInMap("BackupSets")
    public DescribeBackupSetsResponseBodyBackupSets backupSets;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BackupConsitentTime")
        public String backupConsitentTime;

        @NameInMap("BackupDbs")
        public DescribeBackupSetsResponseBodyBackupSetsBackupSetBackupDbs backupDbs;

        @NameInMap("BackupEndTime")
        public Long backupEndTime;

        @NameInMap("BackupLevel")
        public String backupLevel;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupStartTime")
        public Long backupStartTime;

        @NameInMap("BackupTotalSize")
        public String backupTotalSize;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("EnableRecovery")
        public Boolean enableRecovery;

        @NameInMap("Id")
        public String id;

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
