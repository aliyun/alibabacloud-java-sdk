// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Backups")
    public DescribeBackupsResponseBodyBackups backups;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setBackups(DescribeBackupsResponseBodyBackups backups) {
        this.backups = backups;
        return this;
    }
    public DescribeBackupsResponseBodyBackups getBackups() {
        return this.backups;
    }

    public static class DescribeBackupsResponseBodyBackupsBackup extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        public static DescribeBackupsResponseBodyBackupsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyBackupsBackup self = new DescribeBackupsResponseBodyBackupsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyBackupsBackup setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBackupsResponseBodyBackupsBackup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupsResponseBodyBackupsBackup setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupsResponseBodyBackupsBackup setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyBackupsBackup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeBackupsResponseBodyBackupsBackup setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

    }

    public static class DescribeBackupsResponseBodyBackups extends TeaModel {
        @NameInMap("Backup")
        public java.util.List<DescribeBackupsResponseBodyBackupsBackup> backup;

        public static DescribeBackupsResponseBodyBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyBackups self = new DescribeBackupsResponseBodyBackups();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyBackups setBackup(java.util.List<DescribeBackupsResponseBodyBackupsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyBackupsBackup> getBackup() {
            return this.backup;
        }

    }

}
