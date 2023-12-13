// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupsResponseBody extends TeaModel {
    /**
     * <p>The cluster backup sets. A cluster backup file contains the backup sets of each node.</p>
     */
    @NameInMap("ClusterBackups")
    public java.util.List<DescribeClusterBackupsResponseBodyClusterBackups> clusterBackups;

    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, an empty string is returned.</p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end of the backup time range. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup set.</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The URL that is used to download the backup set over an internal network. If the backup set cannot be downloaded, null is returned.</p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The backup name.</p>
         */
        @NameInMap("BackupName")
        public String backupName;

        /**
         * <p>The size of the backup file. Unit: bytes.</p>
         */
        @NameInMap("BackupSize")
        public String backupSize;

        /**
         * <p>The beginning of the backup time range. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup task. Valid values:</p>
         * <br>
         * <p>*   **Success**: The backup task is successful.</p>
         * <p>*   **Failed**: The backup task failed.</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The name of the shard.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <br>
         * <p>*   **0**: unavailable</p>
         * <p>*   **1**: available</p>
         */
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
        /**
         * <p>Indicates whether the cluster backups are from the historical backup sets. If the value of this parameter is **1**, the cluster backups are migrated from the historical backup sets.</p>
         */
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
        /**
         * <p>The collection of the backup sets of each child node in a cluster backup set.</p>
         */
        @NameInMap("Backups")
        public java.util.List<DescribeClusterBackupsResponseBodyClusterBackupsBackups> backups;

        /**
         * <p>The end of the time range within which the cluster backup is performed.</p>
         */
        @NameInMap("ClusterBackupEndTime")
        public String clusterBackupEndTime;

        /**
         * <p>The ID of the cluster backup set.</p>
         */
        @NameInMap("ClusterBackupId")
        public String clusterBackupId;

        /**
         * <p>The cluster backup mode.</p>
         */
        @NameInMap("ClusterBackupMode")
        public String clusterBackupMode;

        /**
         * <p>The size of the cluster backup set. Unit: bytes.</p>
         */
        @NameInMap("ClusterBackupSize")
        public String clusterBackupSize;

        /**
         * <p>The beginning of the time range within which the cluster backup is performed.</p>
         */
        @NameInMap("ClusterBackupStartTime")
        public String clusterBackupStartTime;

        /**
         * <p>The status of the cluster backup set.</p>
         */
        @NameInMap("ClusterBackupStatus")
        public String clusterBackupStatus;

        /**
         * <p>The additional information in JSON format.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo extraInfo;

        /**
         * <p>Indicates whether the cluster backup sets take effect. Valid values:</p>
         * <br>
         * <p>*   **1**: The cluster backup sets take effect.</p>
         * <p>*   **0**: The backup sets of child nodes are incomplete or fail.</p>
         */
        @NameInMap("IsAvail")
        public Integer isAvail;

        /**
         * <p>The progress of the backup task. Unit: %. The progress is returned only for running backup tasks.</p>
         */
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
