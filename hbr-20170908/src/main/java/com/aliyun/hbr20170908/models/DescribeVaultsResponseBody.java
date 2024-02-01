// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("CommonNas")
        public Integer commonNas;

        @NameInMap("Csg")
        public Integer csg;

        @NameInMap("EcsFile")
        public Integer ecsFile;

        @NameInMap("EcsHana")
        public Integer ecsHana;

        @NameInMap("Isilon")
        public Integer isilon;

        @NameInMap("LocalFile")
        public Integer localFile;

        @NameInMap("LocalVm")
        public Integer localVm;

        @NameInMap("MySql")
        public Integer mySql;

        @NameInMap("Nas")
        public Integer nas;

        @NameInMap("Oracle")
        public Integer oracle;

        @NameInMap("Oss")
        public Integer oss;

        @NameInMap("Ots")
        public Integer ots;

        @NameInMap("SqlServer")
        public Integer sqlServer;

        public static DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics self = new DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics();
            return TeaModel.build(map, self);
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
        @NameInMap("HistoricalReplicationProgress")
        public Integer historicalReplicationProgress;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("KeepAfterTrialExpiration")
        public Boolean keepAfterTrialExpiration;

        @NameInMap("TrialExpireTime")
        public Long trialExpireTime;

        @NameInMap("TrialStartTime")
        public Long trialStartTime;

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
        @NameInMap("ArchiveBytesDone")
        public Long archiveBytesDone;

        @NameInMap("ArchiveStorageSize")
        public Long archiveStorageSize;

        @NameInMap("BackupPlanStatistics")
        public DescribeVaultsResponseBodyVaultsVaultBackupPlanStatistics backupPlanStatistics;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("BytesDone")
        public Long bytesDone;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ChargedStorageSize")
        public Long chargedStorageSize;

        @NameInMap("CompressionAlgorithm")
        public String compressionAlgorithm;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Dedup")
        public Boolean dedup;

        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("IndexAvailable")
        public Boolean indexAvailable;

        @NameInMap("IndexLevel")
        public String indexLevel;

        @NameInMap("IndexUpdateTime")
        public Long indexUpdateTime;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("LatestReplicationTime")
        public Long latestReplicationTime;

        @NameInMap("RedundancyType")
        public String redundancyType;

        @NameInMap("Replication")
        public Boolean replication;

        @NameInMap("ReplicationProgress")
        public DescribeVaultsResponseBodyVaultsVaultReplicationProgress replicationProgress;

        @NameInMap("ReplicationSourceRegionId")
        public String replicationSourceRegionId;

        @NameInMap("ReplicationSourceVault")
        public Boolean replicationSourceVault;

        @NameInMap("ReplicationSourceVaultId")
        public String replicationSourceVaultId;

        @NameInMap("ReplicationTargetRegionId")
        public String replicationTargetRegionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("SearchEnabled")
        public Boolean searchEnabled;

        @NameInMap("SnapshotCount")
        public Long snapshotCount;

        @NameInMap("SourceTypes")
        public DescribeVaultsResponseBodyVaultsVaultSourceTypes sourceTypes;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("Tags")
        public DescribeVaultsResponseBodyVaultsVaultTags tags;

        @NameInMap("TrialInfo")
        public DescribeVaultsResponseBodyVaultsVaultTrialInfo trialInfo;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("VaultId")
        public String vaultId;

        @NameInMap("VaultName")
        public String vaultName;

        @NameInMap("VaultRegionId")
        public String vaultRegionId;

        @NameInMap("VaultStatusMessage")
        public String vaultStatusMessage;

        @NameInMap("VaultStorageClass")
        public String vaultStorageClass;

        @NameInMap("VaultType")
        public String vaultType;

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

        public DescribeVaultsResponseBodyVaultsVault setReplicationTargetRegionId(String replicationTargetRegionId) {
            this.replicationTargetRegionId = replicationTargetRegionId;
            return this;
        }
        public String getReplicationTargetRegionId() {
            return this.replicationTargetRegionId;
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
