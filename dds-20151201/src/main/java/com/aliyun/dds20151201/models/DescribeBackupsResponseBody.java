// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    // Details about backup sets.
    @NameInMap("Backups")
    public DescribeBackupsResponseBodyBackups backups;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of backup sets that were returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setBackups(DescribeBackupsResponseBodyBackups backups) {
        this.backups = backups;
        return this;
    }
    public DescribeBackupsResponseBodyBackups getBackups() {
        return this.backups;
    }

    public DescribeBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupsResponseBodyBackupsBackup extends TeaModel {
        // The name of the database that has been backed up.
        @NameInMap("BackupDBNames")
        public String backupDBNames;

        // The Internet download URL of the backup set. If the download URL is unavailable, this parameter is an empty string.
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        // The end of the backup time range. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format and displayed in UTC.
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        // The ID of the backup set.
        @NameInMap("BackupId")
        public Integer backupId;

        // The internal download URL of the backup set.
        // 
        // >  You can use this URL to download the backup set from on the ECS instance which is on the same network as the ApsaraDB for MongoDB instance.
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        // The backup method. Valid values:
        // 
        // *   **Snapshot**
        // *   **Physical**
        // *   **Logical**
        @NameInMap("BackupMethod")
        public String backupMethod;

        // The backup mode.
        // 
        // *   **Automated**: automatic backup
        // *   **Manual**: manual backup
        @NameInMap("BackupMode")
        public String backupMode;

        // The size of the backup set. Unit: bytes.
        @NameInMap("BackupSize")
        public Long backupSize;

        // The beginning of the backup time range. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format and displayed in UTC.
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        // The status of the backup. Valid values:
        // 
        // *   **Success**: The backup task is successful.
        // *   **Failed**: The backup task failed.
        @NameInMap("BackupStatus")
        public String backupStatus;

        // The backup method.
        // 
        // *   **FullBackup**: a full backup
        // *   **IncrementalBackup**: an incremental backup
        @NameInMap("BackupType")
        public String backupType;

        public static DescribeBackupsResponseBodyBackupsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyBackupsBackup self = new DescribeBackupsResponseBodyBackupsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupDBNames(String backupDBNames) {
            this.backupDBNames = backupDBNames;
            return this;
        }
        public String getBackupDBNames() {
            return this.backupDBNames;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupId(Integer backupId) {
            this.backupId = backupId;
            return this;
        }
        public Integer getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
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
