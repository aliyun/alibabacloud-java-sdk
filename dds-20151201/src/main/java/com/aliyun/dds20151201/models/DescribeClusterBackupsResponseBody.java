// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupsResponseBody extends TeaModel {
    @NameInMap("ClusterBackups")
    public java.util.List<DescribeClusterBackupsResponseBodyClusterBackups> clusterBackups;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBackupsResponseBody self = new DescribeClusterBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBackupsResponseBody setClusterBackups(java.util.List<DescribeClusterBackupsResponseBodyClusterBackups> clusterBackups) {
        this.clusterBackups = clusterBackups;
        return this;
    }
    public java.util.List<DescribeClusterBackupsResponseBodyClusterBackups> getClusterBackups() {
        return this.clusterBackups;
    }

    public DescribeClusterBackupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeClusterBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterBackupsResponseBodyClusterBackupsBackups extends TeaModel {
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        @NameInMap("BackupName")
        public String backupName;

        @NameInMap("BackupSize")
        public String backupSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsAvail")
        public String isAvail;

        public static DescribeClusterBackupsResponseBodyClusterBackupsBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupsResponseBodyClusterBackupsBackups self = new DescribeClusterBackupsResponseBodyClusterBackupsBackups();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupName(String backupName) {
            this.backupName = backupName;
            return this;
        }
        public String getBackupName() {
            return this.backupName;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupSize(String backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public String getBackupSize() {
            return this.backupSize;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setIsAvail(String isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public String getIsAvail() {
            return this.isAvail;
        }

    }

    public static class DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo extends TeaModel {
        @NameInMap("RegistryFromHistory")
        public String registryFromHistory;

        public static DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo self = new DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo setRegistryFromHistory(String registryFromHistory) {
            this.registryFromHistory = registryFromHistory;
            return this;
        }
        public String getRegistryFromHistory() {
            return this.registryFromHistory;
        }

    }

    public static class DescribeClusterBackupsResponseBodyClusterBackups extends TeaModel {
        @NameInMap("Backups")
        public java.util.List<DescribeClusterBackupsResponseBodyClusterBackupsBackups> backups;

        @NameInMap("ClusterBackupEndTime")
        public String clusterBackupEndTime;

        @NameInMap("ClusterBackupId")
        public String clusterBackupId;

        @NameInMap("ClusterBackupMode")
        public String clusterBackupMode;

        @NameInMap("ClusterBackupSize")
        public String clusterBackupSize;

        @NameInMap("ClusterBackupStartTime")
        public String clusterBackupStartTime;

        @NameInMap("ClusterBackupStatus")
        public String clusterBackupStatus;

        @NameInMap("ExtraInfo")
        public DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo extraInfo;

        @NameInMap("IsAvail")
        public Integer isAvail;

        @NameInMap("Progress")
        public String progress;

        public static DescribeClusterBackupsResponseBodyClusterBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupsResponseBodyClusterBackups self = new DescribeClusterBackupsResponseBodyClusterBackups();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setBackups(java.util.List<DescribeClusterBackupsResponseBodyClusterBackupsBackups> backups) {
            this.backups = backups;
            return this;
        }
        public java.util.List<DescribeClusterBackupsResponseBodyClusterBackupsBackups> getBackups() {
            return this.backups;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setClusterBackupEndTime(String clusterBackupEndTime) {
            this.clusterBackupEndTime = clusterBackupEndTime;
            return this;
        }
        public String getClusterBackupEndTime() {
            return this.clusterBackupEndTime;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setClusterBackupId(String clusterBackupId) {
            this.clusterBackupId = clusterBackupId;
            return this;
        }
        public String getClusterBackupId() {
            return this.clusterBackupId;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setClusterBackupMode(String clusterBackupMode) {
            this.clusterBackupMode = clusterBackupMode;
            return this;
        }
        public String getClusterBackupMode() {
            return this.clusterBackupMode;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setClusterBackupSize(String clusterBackupSize) {
            this.clusterBackupSize = clusterBackupSize;
            return this;
        }
        public String getClusterBackupSize() {
            return this.clusterBackupSize;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setClusterBackupStartTime(String clusterBackupStartTime) {
            this.clusterBackupStartTime = clusterBackupStartTime;
            return this;
        }
        public String getClusterBackupStartTime() {
            return this.clusterBackupStartTime;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setClusterBackupStatus(String clusterBackupStatus) {
            this.clusterBackupStatus = clusterBackupStatus;
            return this;
        }
        public String getClusterBackupStatus() {
            return this.clusterBackupStatus;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setExtraInfo(DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
