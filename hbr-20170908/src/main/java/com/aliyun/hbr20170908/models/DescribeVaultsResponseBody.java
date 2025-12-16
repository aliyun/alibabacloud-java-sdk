// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number for pagination, starting from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, with a minimum value of 1, a maximum value of 99, and a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request was successful.</p>
     * <ul>
     * <li>true: Success - false: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Returns the total number of backup repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The backup vaults.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Vault\&quot;: []}</p>
     */
    @NameInMap("Vaults")
    public DescribeVaultsResponseBodyVaults vaults;

    public static DescribeVaultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVaultsResponseBody self = new DescribeVaultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVaultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVaultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVaultsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVaultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVaultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVaultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeVaultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVaultsResponseBody setVaults(DescribeVaultsResponseBodyVaults vaults) {
        this.vaults = vaults;
        return this;
    }
    public DescribeVaultsResponseBodyVaults getVaults() {
        return this.vaults;
    }

    public static class DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics extends TeaModel {
        /**
         * <p>The number of archive plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Archive")
        public Integer archive;

        /**
         * <p>The number of Cloud Parallel File Storage (CPFS) backup plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CommonFileSystem")
        public Integer commonFileSystem;

        /**
         * <p>The number of backup plans for General-purpose NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CommonNas")
        public Integer commonNas;

        /**
         * <p>The number of backup plans for Cloud Storage Gateway (CSG) gateways.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Csg")
        public Integer csg;

        /**
         * <p>The number of backup plans for ECS files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EcsFile")
        public Integer ecsFile;

        /**
         * <p>The number of backup plans for SAP HANA instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EcsHana")
        public Integer ecsHana;

        /**
         * <p>The number of backup plans for Isilon storage systems.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Isilon")
        public Integer isilon;

        /**
         * <p>The number of backup plans for on-premises servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LocalFile")
        public Integer localFile;

        /**
         * <p>The number of backup plans for on-premises virtual machines (VMs).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LocalVm")
        public Integer localVm;

        /**
         * <p>The number of backup plans for MySQL databases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MySql")
        public Integer mySql;

        /**
         * <p>The number of backup plans for NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Nas")
        public Integer nas;

        /**
         * <p>The number of backup plans for Oracle databases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Oracle")
        public Integer oracle;

        /**
         * <p>The number of backup plans for OSS buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Oss")
        public Integer oss;

        /**
         * <p>The number of backup plans for Tablestore instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ots")
        public Integer ots;

        /**
         * <p>The number of backup plans for SQL Server databases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlServer")
        public Integer sqlServer;

        public static DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics self = new DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setArchive(Integer archive) {
            this.archive = archive;
            return this;
        }
        public Integer getArchive() {
            return this.archive;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setCommonFileSystem(Integer commonFileSystem) {
            this.commonFileSystem = commonFileSystem;
            return this;
        }
        public Integer getCommonFileSystem() {
            return this.commonFileSystem;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setCommonNas(Integer commonNas) {
            this.commonNas = commonNas;
            return this;
        }
        public Integer getCommonNas() {
            return this.commonNas;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setCsg(Integer csg) {
            this.csg = csg;
            return this;
        }
        public Integer getCsg() {
            return this.csg;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setEcsFile(Integer ecsFile) {
            this.ecsFile = ecsFile;
            return this;
        }
        public Integer getEcsFile() {
            return this.ecsFile;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setEcsHana(Integer ecsHana) {
            this.ecsHana = ecsHana;
            return this;
        }
        public Integer getEcsHana() {
            return this.ecsHana;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setIsilon(Integer isilon) {
            this.isilon = isilon;
            return this;
        }
        public Integer getIsilon() {
            return this.isilon;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setLocalFile(Integer localFile) {
            this.localFile = localFile;
            return this;
        }
        public Integer getLocalFile() {
            return this.localFile;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setLocalVm(Integer localVm) {
            this.localVm = localVm;
            return this;
        }
        public Integer getLocalVm() {
            return this.localVm;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setMySql(Integer mySql) {
            this.mySql = mySql;
            return this;
        }
        public Integer getMySql() {
            return this.mySql;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setNas(Integer nas) {
            this.nas = nas;
            return this;
        }
        public Integer getNas() {
            return this.nas;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setOracle(Integer oracle) {
            this.oracle = oracle;
            return this;
        }
        public Integer getOracle() {
            return this.oracle;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setOss(Integer oss) {
            this.oss = oss;
            return this;
        }
        public Integer getOss() {
            return this.oss;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setOts(Integer ots) {
            this.ots = ots;
            return this;
        }
        public Integer getOts() {
            return this.ots;
        }

        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics setSqlServer(Integer sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }
        public Integer getSqlServer() {
            return this.sqlServer;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVaultReplicationProgress extends TeaModel {
        /**
         * <p>The progress of historical data synchronization from the backup vault to the mirror vault. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HistoricalReplicationProgress")
        public Integer historicalReplicationProgress;

        /**
         * <p>The latest synchronization time of incremental data in the mirror vault.</p>
         * 
         * <strong>example:</strong>
         * <p>1579413159</p>
         */
        @NameInMap("NewReplicationProgress")
        public Long newReplicationProgress;

        public static DescribeVaultsResponseBodyVaultsVaultReplicationProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultReplicationProgress self = new DescribeVaultsResponseBodyVaultsVaultReplicationProgress();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultReplicationProgress setHistoricalReplicationProgress(Integer historicalReplicationProgress) {
            this.historicalReplicationProgress = historicalReplicationProgress;
            return this;
        }
        public Integer getHistoricalReplicationProgress() {
            return this.historicalReplicationProgress;
        }

        public DescribeVaultsResponseBodyVaultsVaultReplicationProgress setNewReplicationProgress(Long newReplicationProgress) {
            this.newReplicationProgress = newReplicationProgress;
            return this;
        }
        public Long getNewReplicationProgress() {
            return this.newReplicationProgress;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds extends TeaModel {
        @NameInMap("RsTargetAccountId")
        public java.util.List<Long> rsTargetAccountId;

        public static DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds self = new DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds setRsTargetAccountId(java.util.List<Long> rsTargetAccountId) {
            this.rsTargetAccountId = rsTargetAccountId;
            return this;
        }
        public java.util.List<Long> getRsTargetAccountId() {
            return this.rsTargetAccountId;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVaultSourceTypes extends TeaModel {
        @NameInMap("SourceType")
        public java.util.List<String> sourceType;

        public static DescribeVaultsResponseBodyVaultsVaultSourceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultSourceTypes self = new DescribeVaultsResponseBodyVaultsVaultSourceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultSourceTypes setSourceType(java.util.List<String> sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public java.util.List<String> getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVaultTagsTag extends TeaModel {
        /**
         * <p>The tag key of the backup vault. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
         * <li>The tag key cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the backup vault. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
         * <li>The tag value cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>a1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVaultsResponseBodyVaultsVaultTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultTagsTag self = new DescribeVaultsResponseBodyVaultsVaultTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVaultsResponseBodyVaultsVaultTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVaultTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVaultsResponseBodyVaultsVaultTagsTag> tag;

        public static DescribeVaultsResponseBodyVaultsVaultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultTags self = new DescribeVaultsResponseBodyVaultsVaultTags();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultTags setTag(java.util.List<DescribeVaultsResponseBodyVaultsVaultTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVaultsResponseBodyVaultsVaultTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVaultTrialInfo extends TeaModel {
        /**
         * <p>Indicates whether you are billed based on the pay-as-you-go method after the free trial ends.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepAfterTrialExpiration")
        public Boolean keepAfterTrialExpiration;

        /**
         * <p>The expiration time of the free trial.</p>
         * 
         * <strong>example:</strong>
         * <p>1584597600</p>
         */
        @NameInMap("TrialExpireTime")
        public Long trialExpireTime;

        /**
         * <p>The start time of the free trial.</p>
         * 
         * <strong>example:</strong>
         * <p>1579413159</p>
         */
        @NameInMap("TrialStartTime")
        public Long trialStartTime;

        /**
         * <p>The time when the free-trial backup vault is released.</p>
         * 
         * <strong>example:</strong>
         * <p>1594965600</p>
         */
        @NameInMap("TrialVaultReleaseTime")
        public Long trialVaultReleaseTime;

        public static DescribeVaultsResponseBodyVaultsVaultTrialInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultTrialInfo self = new DescribeVaultsResponseBodyVaultsVaultTrialInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVaultTrialInfo setKeepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
            this.keepAfterTrialExpiration = keepAfterTrialExpiration;
            return this;
        }
        public Boolean getKeepAfterTrialExpiration() {
            return this.keepAfterTrialExpiration;
        }

        public DescribeVaultsResponseBodyVaultsVaultTrialInfo setTrialExpireTime(Long trialExpireTime) {
            this.trialExpireTime = trialExpireTime;
            return this;
        }
        public Long getTrialExpireTime() {
            return this.trialExpireTime;
        }

        public DescribeVaultsResponseBodyVaultsVaultTrialInfo setTrialStartTime(Long trialStartTime) {
            this.trialStartTime = trialStartTime;
            return this;
        }
        public Long getTrialStartTime() {
            return this.trialStartTime;
        }

        public DescribeVaultsResponseBodyVaultsVaultTrialInfo setTrialVaultReleaseTime(Long trialVaultReleaseTime) {
            this.trialVaultReleaseTime = trialVaultReleaseTime;
            return this;
        }
        public Long getTrialVaultReleaseTime() {
            return this.trialVaultReleaseTime;
        }

    }

    public static class DescribeVaultsResponseBodyVaultsVault extends TeaModel {
        /**
         * <p>Archival tier backup data volume. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("ArchiveBytesDone")
        public Long archiveBytesDone;

        /**
         * <p>The billable storage usage of the Archive tier. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("ArchiveStorageSize")
        public Long archiveStorageSize;

        /**
         * <p>The statistics of backup plans that use the backup vault.</p>
         */
        @NameInMap("BackupPlanStatistics")
        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics backupPlanStatistics;

        /**
         * <p>The name of the OSS bucket used by the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-0005i51******t58</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The amount of data that is backed up. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The billing method of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The billable storage usage of the archive vault. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("ChargedStorageSize")
        public Long chargedStorageSize;

        /**
         * <p>The encryption algorithm used to compress the backup vault. Valid values:</p>
         * <ul>
         * <li>DISABLED: The backup vault is not compressed.</li>
         * <li>SNAPPY: The backup vault is compressed by using the SNAPPY encryption algorithm.</li>
         * <li>ZSTD: The backup vault is compressed by using Zstandard, a fast lossless compression algorithm.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ZSTD</p>
         */
        @NameInMap("CompressionAlgorithm")
        public String compressionAlgorithm;

        /**
         * <p>The time when the backup vault was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>Indicates whether the deduplication feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Dedup")
        public Boolean dedup;

        /**
         * <p>The description of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>vault description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The encryption type of the backup vault. Valid values:</p>
         * <ul>
         * <li>NONE: The backup vault is not encrypted.</li>
         * <li>HBR_PRIVATE (default): The backup vault is encrypted by using a key provided by Cloud Backup.</li>
         * <li>KMS: The backup vault is encrypted by using a custom master key (CMK) created in Key Management Service (KMS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HBR_PRIVATE</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>Indicates whether indexes are available. Indexes are available when they are not being updated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndexAvailable")
        public Boolean indexAvailable;

        /**
         * <p>The index level.</p>
         * <ul>
         * <li>OFF: No indexes are created.</li>
         * <li>META: Metadata indexes are created.</li>
         * <li>ALL: Full-text indexes are created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("IndexLevel")
        public String indexLevel;

        /**
         * <p>The time when the index was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1639645628</p>
         */
        @NameInMap("IndexUpdateTime")
        public Long indexUpdateTime;

        /**
         * <p>The ID or alias of the CMK created in KMS. This parameter is returned only when EncryptType is set to KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/acs/acm</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The time when the last remote backup was synchronized. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("LatestReplicationTime")
        public Long latestReplicationTime;

        /**
         * <p>The data redundancy type of the backup vault. Valid values:</p>
         * <ul>
         * <li>LRS: Locally redundant storage (LRS) is enabled for the backup vault. Cloud Backup stores the copies of each object on multiple devices of different facilities in the same zone. This way, Cloud Backup ensures data durability and availability even if hardware failures occur.</li>
         * <li>ZRS: Zone-redundant storage (ZRS) is enabled for the backup vault. Cloud Backup uses the multi-zone mechanism to distribute data across three zones within the same region. If a zone fails, the data that is stored in the other two zones is still accessible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        @NameInMap("RedundancyType")
        public String redundancyType;

        /**
         * <p>Indicates whether the backup vault is a remote backup vault. Valid values:</p>
         * <ul>
         * <li>true: The backup vault is a remote backup vault.</li>
         * <li>false: The backup vault is a local backup vault.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Replication")
        public Boolean replication;

        /**
         * <p>The progress of data synchronization from the backup vault to the mirror vault.</p>
         */
        @NameInMap("ReplicationProgress")
        public DescribeVaultsResponseBodyVaultsVaultReplicationProgress replicationProgress;

        @NameInMap("ReplicationSourceOwnerId")
        public Long replicationSourceOwnerId;

        /**
         * <p>The ID of the region in which the source vault resides. This parameter is valid only for remote backup vaults.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        @NameInMap("ReplicationSourceRegionId")
        public String replicationSourceRegionId;

        /**
         * <p>Indicate whether the backup vault is the source vault that corresponds to the remote backup vault. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReplicationSourceVault")
        public Boolean replicationSourceVault;

        /**
         * <p>The ID of the source vault that corresponds to the remote backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        @NameInMap("ReplicationSourceVaultId")
        public String replicationSourceVaultId;

        @NameInMap("ReplicationStatus")
        public String replicationStatus;

        @NameInMap("ReplicationTargetOwnerId")
        public Long replicationTargetOwnerId;

        /**
         * <p>Target region for remote backup repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ReplicationTargetRegionId")
        public String replicationTargetRegionId;

        @NameInMap("ReplicationTargetVaultId")
        public String replicationTargetVaultId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-*********************</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The retention period of the backup vault. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Retention")
        public Long retention;

        @NameInMap("RsTargetAccountIds")
        public DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds rsTargetAccountIds;

        /**
         * <p>Indicates whether the backup search feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SearchEnabled")
        public Boolean searchEnabled;

        /**
         * <p>The number of snapshots in the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SnapshotCount")
        public Long snapshotCount;

        /**
         * <p>The data source types of the backup vault.</p>
         */
        @NameInMap("SourceTypes")
        public DescribeVaultsResponseBodyVaultsVaultSourceTypes sourceTypes;

        /**
         * <p>The status of the backup vault. Valid values:</p>
         * <ul>
         * <li><strong>UNKNOWN</strong>: The backup vault is in an unknown state.</li>
         * <li><strong>INITIALIZING</strong>: The backup vault is being initialized.</li>
         * <li><strong>CREATED</strong>: The backup vault is created.</li>
         * <li><strong>ERROR</strong>: An error occurs on the backup vault.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The usage of the backup vault. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>The tags of the backup vault.</p>
         */
        @NameInMap("Tags")
        public DescribeVaultsResponseBodyVaultsVaultTags tags;

        /**
         * <p>The free trial information.</p>
         */
        @NameInMap("TrialInfo")
        public DescribeVaultsResponseBodyVaultsVaultTrialInfo trialInfo;

        /**
         * <p>The time when the backup vault was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        /**
         * <p>The name of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>vaultname</p>
         */
        @NameInMap("VaultName")
        public String vaultName;

        @NameInMap("VaultOwnerId")
        public Long vaultOwnerId;

        /**
         * <p>The ID of the region in which the backup vault resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("VaultRegionId")
        public String vaultRegionId;

        /**
         * <p>The status message that is returned when the backup vault is in the ERROR state. This parameter is valid only for remote backup vaults. Valid values:</p>
         * <ul>
         * <li><strong>UNKNOWN_ERROR</strong>: An unknown error occurs.</li>
         * <li><strong>SOURCE_VAULT_ALREADY_HAS_REPLICATION</strong>: A mirror vault is configured for the source vault.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SOURCE_VAULT_ALREADY_HAS_REPLICATION</p>
         */
        @NameInMap("VaultStatusMessage")
        public String vaultStatusMessage;

        /**
         * <p>The storage class of the backup vault. Valid value: <strong>STANDARD</strong>, which indicates standard storage.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VaultStorageClass")
        public String vaultStorageClass;

        /**
         * <p>The type of the backup vault. Valid value: <strong>STANDARD</strong>, which indicates a standard backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VaultType")
        public String vaultType;

        /**
         * <p>Indicates whether the immutable backup feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WormEnabled")
        public Boolean wormEnabled;

        public static DescribeVaultsResponseBodyVaultsVault build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVault self = new DescribeVaultsResponseBodyVaultsVault();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaultsVault setArchiveBytesDone(Long archiveBytesDone) {
            this.archiveBytesDone = archiveBytesDone;
            return this;
        }
        public Long getArchiveBytesDone() {
            return this.archiveBytesDone;
        }

        public DescribeVaultsResponseBodyVaultsVault setArchiveStorageSize(Long archiveStorageSize) {
            this.archiveStorageSize = archiveStorageSize;
            return this;
        }
        public Long getArchiveStorageSize() {
            return this.archiveStorageSize;
        }

        public DescribeVaultsResponseBodyVaultsVault setBackupPlanStatistics(DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics backupPlanStatistics) {
            this.backupPlanStatistics = backupPlanStatistics;
            return this;
        }
        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics getBackupPlanStatistics() {
            return this.backupPlanStatistics;
        }

        public DescribeVaultsResponseBodyVaultsVault setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeVaultsResponseBodyVaultsVault setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeVaultsResponseBodyVaultsVault setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeVaultsResponseBodyVaultsVault setChargedStorageSize(Long chargedStorageSize) {
            this.chargedStorageSize = chargedStorageSize;
            return this;
        }
        public Long getChargedStorageSize() {
            return this.chargedStorageSize;
        }

        public DescribeVaultsResponseBodyVaultsVault setCompressionAlgorithm(String compressionAlgorithm) {
            this.compressionAlgorithm = compressionAlgorithm;
            return this;
        }
        public String getCompressionAlgorithm() {
            return this.compressionAlgorithm;
        }

        public DescribeVaultsResponseBodyVaultsVault setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeVaultsResponseBodyVaultsVault setDedup(Boolean dedup) {
            this.dedup = dedup;
            return this;
        }
        public Boolean getDedup() {
            return this.dedup;
        }

        public DescribeVaultsResponseBodyVaultsVault setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVaultsResponseBodyVaultsVault setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public DescribeVaultsResponseBodyVaultsVault setIndexAvailable(Boolean indexAvailable) {
            this.indexAvailable = indexAvailable;
            return this;
        }
        public Boolean getIndexAvailable() {
            return this.indexAvailable;
        }

        public DescribeVaultsResponseBodyVaultsVault setIndexLevel(String indexLevel) {
            this.indexLevel = indexLevel;
            return this;
        }
        public String getIndexLevel() {
            return this.indexLevel;
        }

        public DescribeVaultsResponseBodyVaultsVault setIndexUpdateTime(Long indexUpdateTime) {
            this.indexUpdateTime = indexUpdateTime;
            return this;
        }
        public Long getIndexUpdateTime() {
            return this.indexUpdateTime;
        }

        public DescribeVaultsResponseBodyVaultsVault setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public DescribeVaultsResponseBodyVaultsVault setLatestReplicationTime(Long latestReplicationTime) {
            this.latestReplicationTime = latestReplicationTime;
            return this;
        }
        public Long getLatestReplicationTime() {
            return this.latestReplicationTime;
        }

        public DescribeVaultsResponseBodyVaultsVault setRedundancyType(String redundancyType) {
            this.redundancyType = redundancyType;
            return this;
        }
        public String getRedundancyType() {
            return this.redundancyType;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplication(Boolean replication) {
            this.replication = replication;
            return this;
        }
        public Boolean getReplication() {
            return this.replication;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationProgress(DescribeVaultsResponseBodyVaultsVaultReplicationProgress replicationProgress) {
            this.replicationProgress = replicationProgress;
            return this;
        }
        public DescribeVaultsResponseBodyVaultsVaultReplicationProgress getReplicationProgress() {
            return this.replicationProgress;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationSourceOwnerId(Long replicationSourceOwnerId) {
            this.replicationSourceOwnerId = replicationSourceOwnerId;
            return this;
        }
        public Long getReplicationSourceOwnerId() {
            return this.replicationSourceOwnerId;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationSourceRegionId(String replicationSourceRegionId) {
            this.replicationSourceRegionId = replicationSourceRegionId;
            return this;
        }
        public String getReplicationSourceRegionId() {
            return this.replicationSourceRegionId;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationSourceVault(Boolean replicationSourceVault) {
            this.replicationSourceVault = replicationSourceVault;
            return this;
        }
        public Boolean getReplicationSourceVault() {
            return this.replicationSourceVault;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationSourceVaultId(String replicationSourceVaultId) {
            this.replicationSourceVaultId = replicationSourceVaultId;
            return this;
        }
        public String getReplicationSourceVaultId() {
            return this.replicationSourceVaultId;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationStatus(String replicationStatus) {
            this.replicationStatus = replicationStatus;
            return this;
        }
        public String getReplicationStatus() {
            return this.replicationStatus;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationTargetOwnerId(Long replicationTargetOwnerId) {
            this.replicationTargetOwnerId = replicationTargetOwnerId;
            return this;
        }
        public Long getReplicationTargetOwnerId() {
            return this.replicationTargetOwnerId;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationTargetRegionId(String replicationTargetRegionId) {
            this.replicationTargetRegionId = replicationTargetRegionId;
            return this;
        }
        public String getReplicationTargetRegionId() {
            return this.replicationTargetRegionId;
        }

        public DescribeVaultsResponseBodyVaultsVault setReplicationTargetVaultId(String replicationTargetVaultId) {
            this.replicationTargetVaultId = replicationTargetVaultId;
            return this;
        }
        public String getReplicationTargetVaultId() {
            return this.replicationTargetVaultId;
        }

        public DescribeVaultsResponseBodyVaultsVault setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVaultsResponseBodyVaultsVault setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeVaultsResponseBodyVaultsVault setRsTargetAccountIds(DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds rsTargetAccountIds) {
            this.rsTargetAccountIds = rsTargetAccountIds;
            return this;
        }
        public DescribeVaultsResponseBodyVaultsVaultRsTargetAccountIds getRsTargetAccountIds() {
            return this.rsTargetAccountIds;
        }

        public DescribeVaultsResponseBodyVaultsVault setSearchEnabled(Boolean searchEnabled) {
            this.searchEnabled = searchEnabled;
            return this;
        }
        public Boolean getSearchEnabled() {
            return this.searchEnabled;
        }

        public DescribeVaultsResponseBodyVaultsVault setSnapshotCount(Long snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Long getSnapshotCount() {
            return this.snapshotCount;
        }

        public DescribeVaultsResponseBodyVaultsVault setSourceTypes(DescribeVaultsResponseBodyVaultsVaultSourceTypes sourceTypes) {
            this.sourceTypes = sourceTypes;
            return this;
        }
        public DescribeVaultsResponseBodyVaultsVaultSourceTypes getSourceTypes() {
            return this.sourceTypes;
        }

        public DescribeVaultsResponseBodyVaultsVault setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVaultsResponseBodyVaultsVault setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public DescribeVaultsResponseBodyVaultsVault setTags(DescribeVaultsResponseBodyVaultsVaultTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVaultsResponseBodyVaultsVaultTags getTags() {
            return this.tags;
        }

        public DescribeVaultsResponseBodyVaultsVault setTrialInfo(DescribeVaultsResponseBodyVaultsVaultTrialInfo trialInfo) {
            this.trialInfo = trialInfo;
            return this;
        }
        public DescribeVaultsResponseBodyVaultsVaultTrialInfo getTrialInfo() {
            return this.trialInfo;
        }

        public DescribeVaultsResponseBodyVaultsVault setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultName(String vaultName) {
            this.vaultName = vaultName;
            return this;
        }
        public String getVaultName() {
            return this.vaultName;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultOwnerId(Long vaultOwnerId) {
            this.vaultOwnerId = vaultOwnerId;
            return this;
        }
        public Long getVaultOwnerId() {
            return this.vaultOwnerId;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultRegionId(String vaultRegionId) {
            this.vaultRegionId = vaultRegionId;
            return this;
        }
        public String getVaultRegionId() {
            return this.vaultRegionId;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultStatusMessage(String vaultStatusMessage) {
            this.vaultStatusMessage = vaultStatusMessage;
            return this;
        }
        public String getVaultStatusMessage() {
            return this.vaultStatusMessage;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultStorageClass(String vaultStorageClass) {
            this.vaultStorageClass = vaultStorageClass;
            return this;
        }
        public String getVaultStorageClass() {
            return this.vaultStorageClass;
        }

        public DescribeVaultsResponseBodyVaultsVault setVaultType(String vaultType) {
            this.vaultType = vaultType;
            return this;
        }
        public String getVaultType() {
            return this.vaultType;
        }

        public DescribeVaultsResponseBodyVaultsVault setWormEnabled(Boolean wormEnabled) {
            this.wormEnabled = wormEnabled;
            return this;
        }
        public Boolean getWormEnabled() {
            return this.wormEnabled;
        }

    }

    public static class DescribeVaultsResponseBodyVaults extends TeaModel {
        @NameInMap("Vault")
        public java.util.List<DescribeVaultsResponseBodyVaultsVault> vault;

        public static DescribeVaultsResponseBodyVaults build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaults self = new DescribeVaultsResponseBodyVaults();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsResponseBodyVaults setVault(java.util.List<DescribeVaultsResponseBodyVaultsVault> vault) {
            this.vault = vault;
            return this;
        }
        public java.util.List<DescribeVaultsResponseBodyVaultsVault> getVault() {
            return this.vault;
        }

    }

}
