// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupsResponseBody extends TeaModel {
    /**
     * <p>The cluster backup sets. A cluster backup set contains the backup sets of all nodes.</p>
     */
    @NameInMap("ClusterBackups")
    public java.util.List<DescribeClusterBackupsResponseBodyClusterBackups> clusterBackups;

    /**
     * <p>The maximum number of entries returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F42BB4E-461F-5B55-A37C-53B1141C****</p>
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

    public static class DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo extends TeaModel {
        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.4x.large.d</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-2ze75ab1fa5d****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The storage space of the node. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>20480</p>
         */
        @NameInMap("StorageSize")
        public String storageSize;

        public static DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo self = new DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeClusterBackupsResponseBodyClusterBackupsBackups extends TeaModel {
        /**
         * <p>The public endpoint used to download the backup file. If the backup file cannot be downloaded, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.com/xxx">http://oss.com/xxx</a></p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end time of the backup. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T19:33:20Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>738025367</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The internal endpoint used to download the backup file. If the backup file cannot be downloaded, a null value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.com/xxx">http://oss.com/xxx</a></p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The backup name.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678.tar.gz</p>
         */
        @NameInMap("BackupName")
        public String backupName;

        /**
         * <p>The size of the backup file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>77544597650</p>
         */
        @NameInMap("BackupSize")
        public String backupSize;

        /**
         * <p>The start time of the backup. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T19:33:20Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The backup status. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The backup is successful.</li>
         * <li><strong>Failed</strong>: The backup fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The information about the instance node associated with the backup.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo extraInfo;

        /**
         * <p>The name of the MongoDB shard.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp16cb162771****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unavailable.</li>
         * <li><strong>1</strong>: available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public DescribeClusterBackupsResponseBodyClusterBackupsBackups setExtraInfo(DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeClusterBackupsResponseBodyClusterBackupsBackupsExtraInfo getExtraInfo() {
            return this.extraInfo;
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
         * <p>Indicates whether the backup set is migrated from a historical backup set. A value of <strong>1</strong> indicates that the backup set is migrated from a historical backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The status of the attached log backup. Valid values:</p>
         * <ul>
         * <li><strong>Init</strong>: The attached log backup is being initialized.</li>
         * <li><strong>No_Need</strong>: No attached log backup is required.</li>
         * <li><strong>Running</strong>: The attached log backup is in progress.</li>
         * <li><strong>Ready</strong>: The attached log backup is complete.</li>
         * <li><strong>Failed</strong>: The attached log backup fails.</li>
         * </ul>
         * <blockquote>
         * <p>When the <strong>ClusterBackupStatus</strong> parameter is set to OK, it only indicates that the full backup phase is successful. For cluster instances with log backup enabled, the attached log backup must be complete to perform point-in-time recovery or achieve consistent recovery.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("AttachLogStatus")
        public String attachLogStatus;

        /**
         * <p>The expire time of the backup. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>Notice: A value of &quot;9999-01-01T00:00:00Z&quot; indicates long-term retention (LTR).</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-03-29T03:47:12Z</p>
         */
        @NameInMap("BackupExpireTime")
        public String backupExpireTime;

        /**
         * <p>The backup sets of child nodes in a single cluster backup set.</p>
         */
        @NameInMap("Backups")
        public java.util.List<DescribeClusterBackupsResponseBodyClusterBackupsBackups> backups;

        /**
         * <p>The end time of the cluster backup. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T19:33:20Z</p>
         */
        @NameInMap("ClusterBackupEndTime")
        public String clusterBackupEndTime;

        /**
         * <p>The cluster backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb-o8c2ugnxo26kx***</p>
         */
        @NameInMap("ClusterBackupId")
        public String clusterBackupId;

        /**
         * <p>The cluster backup mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("ClusterBackupMode")
        public String clusterBackupMode;

        /**
         * <p>The size of the cluster backup set. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("ClusterBackupSize")
        public String clusterBackupSize;

        /**
         * <p>The start time of the cluster backup. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T19:33:20Z</p>
         */
        @NameInMap("ClusterBackupStartTime")
        public String clusterBackupStartTime;

        /**
         * <p>The status of the cluster backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ClusterBackupStatus")
        public String clusterBackupStatus;

        /**
         * <p>The instance version at the time of backup. Valid values:</p>
         * <ul>
         * <li><strong>7.0</strong></li>
         * <li><strong>6.0</strong></li>
         * <li><strong>5.0</strong></li>
         * <li><strong>4.4</strong></li>
         * <li><strong>4.2</strong></li>
         * <li><strong>4.0</strong></li>
         * <li><strong>3.4</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4.2</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The supplementary information in JSON format.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeClusterBackupsResponseBodyClusterBackupsExtraInfo extraInfo;

        /**
         * <p>Indicates whether the cluster backup set is valid. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The cluster backup set is valid.</li>
         * <li><strong>0</strong>: The backup sets of the child nodes are incomplete or failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAvail")
        public Integer isAvail;

        /**
         * <p>The backup progress. Unit: %.
         * The progress is displayed only for running backups.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Progress")
        public String progress;

        public static DescribeClusterBackupsResponseBodyClusterBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupsResponseBodyClusterBackups self = new DescribeClusterBackupsResponseBodyClusterBackups();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setAttachLogStatus(String attachLogStatus) {
            this.attachLogStatus = attachLogStatus;
            return this;
        }
        public String getAttachLogStatus() {
            return this.attachLogStatus;
        }

        public DescribeClusterBackupsResponseBodyClusterBackups setBackupExpireTime(String backupExpireTime) {
            this.backupExpireTime = backupExpireTime;
            return this;
        }
        public String getBackupExpireTime() {
            return this.backupExpireTime;
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

        public DescribeClusterBackupsResponseBodyClusterBackups setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
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
