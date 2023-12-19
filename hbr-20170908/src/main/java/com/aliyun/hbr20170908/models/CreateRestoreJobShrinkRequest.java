// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateRestoreJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</p>
     * <p>*   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The paths to the files that you do not want to restore. No files in the specified paths are restored. The value must be 1 to 255 characters in length.</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    @NameInMap("FailbackDetail")
    public String failbackDetailShrink;

    /**
     * <p>The paths to the files that you want to restore. All files in the specified paths are restored. The value must be 1 to 255 characters in length.</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>Specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.</p>
     */
    @NameInMap("InitiatedByAck")
    public Boolean initiatedByAck;

    @NameInMap("Options")
    public String options;

    /**
     * <p>The details about the Tablestore instance.</p>
     */
    @NameInMap("OtsDetail")
    public String otsDetailShrink;

    /**
     * <p>The type of the restore destination. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: restores data to Elastic Compute Service (ECS) files.</p>
     * <p>*   **OSS**: restores data to Object Storage Service (OSS) buckets.</p>
     * <p>*   **NAS**: restores data to Apsara File Storage NAS file systems.</p>
     * <p>*   **OTS_TABLE**: restores data to Tablestore instances.</p>
     * <p>*   **UDM_ECS_ROLLBACK**: restores data to ECS instances.</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The hash value of the backup snapshot.</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <p>The ID of the backup snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: ECS files</p>
     * <p>*   **OSS**: OSS buckets</p>
     * <p>*   **NAS**: NAS file systems</p>
     * <p>*   **OTS_TABLE**: Tablestore instances</p>
     * <p>*   **UDM_ECS**: ECS instances</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if the **RestoreType** parameter is set to **OSS**. This parameter specifies the name of the OSS bucket to which you want to restore data.</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    /**
     * <p>The details about the container to which you want to restore data.</p>
     */
    @NameInMap("TargetContainer")
    public String targetContainer;

    /**
     * <p>The ID of the container cluster to which you want to restore data.</p>
     */
    @NameInMap("TargetContainerClusterId")
    public String targetContainerClusterId;

    /**
     * <p>This parameter is required only if the **RestoreType** parameter is set to **NAS**. This parameter specifies the time when the file system is created.</p>
     */
    @NameInMap("TargetCreateTime")
    public Long targetCreateTime;

    /**
     * <p>This parameter is required only if the **RestoreType** parameter is set to **NAS**. This parameter specifies the ID of the file system to which you want to restore data.</p>
     */
    @NameInMap("TargetFileSystemId")
    public String targetFileSystemId;

    /**
     * <p>This parameter is required only if the **RestoreType** parameter is set to **ECS_FILE**. This parameter specifies the ID of the ECS instance to which you want to restore data.</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The name of the Tablestore instance to which you want to restore data.</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <p>This parameter is required only if the **RestoreType** parameter is set to **ECS_FILE**. This parameter specifies the destination file path.</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>This parameter is required only if the **RestoreType** parameter is set to **OSS**. This parameter specifies the prefix of objects that you want to restore.</p>
     */
    @NameInMap("TargetPrefix")
    public String targetPrefix;

    /**
     * <p>The name of the table that stores the restored data.</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    /**
     * <p>The time when data is restored to the Tablestore instance. The value must be a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("TargetTime")
    public Long targetTime;

    /**
     * <p>The details of ECS instance backup.</p>
     */
    @NameInMap("UdmDetail")
    public String udmDetailShrink;

    /**
     * <p>This parameter is required only if you set the **SourceType** parameter to **UDM_ECS**. This parameter specifies the region to which you want to restore data.</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>The ID of the backup vault to which the backup snapshot belongs.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateRestoreJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreJobShrinkRequest self = new CreateRestoreJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestoreJobShrinkRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateRestoreJobShrinkRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateRestoreJobShrinkRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateRestoreJobShrinkRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public CreateRestoreJobShrinkRequest setFailbackDetailShrink(String failbackDetailShrink) {
        this.failbackDetailShrink = failbackDetailShrink;
        return this;
    }
    public String getFailbackDetailShrink() {
        return this.failbackDetailShrink;
    }

    public CreateRestoreJobShrinkRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public CreateRestoreJobShrinkRequest setInitiatedByAck(Boolean initiatedByAck) {
        this.initiatedByAck = initiatedByAck;
        return this;
    }
    public Boolean getInitiatedByAck() {
        return this.initiatedByAck;
    }

    public CreateRestoreJobShrinkRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateRestoreJobShrinkRequest setOtsDetailShrink(String otsDetailShrink) {
        this.otsDetailShrink = otsDetailShrink;
        return this;
    }
    public String getOtsDetailShrink() {
        return this.otsDetailShrink;
    }

    public CreateRestoreJobShrinkRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateRestoreJobShrinkRequest setSnapshotHash(String snapshotHash) {
        this.snapshotHash = snapshotHash;
        return this;
    }
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    public CreateRestoreJobShrinkRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateRestoreJobShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateRestoreJobShrinkRequest setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }
    public String getTargetBucket() {
        return this.targetBucket;
    }

    public CreateRestoreJobShrinkRequest setTargetContainer(String targetContainer) {
        this.targetContainer = targetContainer;
        return this;
    }
    public String getTargetContainer() {
        return this.targetContainer;
    }

    public CreateRestoreJobShrinkRequest setTargetContainerClusterId(String targetContainerClusterId) {
        this.targetContainerClusterId = targetContainerClusterId;
        return this;
    }
    public String getTargetContainerClusterId() {
        return this.targetContainerClusterId;
    }

    public CreateRestoreJobShrinkRequest setTargetCreateTime(Long targetCreateTime) {
        this.targetCreateTime = targetCreateTime;
        return this;
    }
    public Long getTargetCreateTime() {
        return this.targetCreateTime;
    }

    public CreateRestoreJobShrinkRequest setTargetFileSystemId(String targetFileSystemId) {
        this.targetFileSystemId = targetFileSystemId;
        return this;
    }
    public String getTargetFileSystemId() {
        return this.targetFileSystemId;
    }

    public CreateRestoreJobShrinkRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateRestoreJobShrinkRequest setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    public CreateRestoreJobShrinkRequest setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

    public CreateRestoreJobShrinkRequest setTargetPrefix(String targetPrefix) {
        this.targetPrefix = targetPrefix;
        return this;
    }
    public String getTargetPrefix() {
        return this.targetPrefix;
    }

    public CreateRestoreJobShrinkRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public CreateRestoreJobShrinkRequest setTargetTime(Long targetTime) {
        this.targetTime = targetTime;
        return this;
    }
    public Long getTargetTime() {
        return this.targetTime;
    }

    public CreateRestoreJobShrinkRequest setUdmDetailShrink(String udmDetailShrink) {
        this.udmDetailShrink = udmDetailShrink;
        return this;
    }
    public String getUdmDetailShrink() {
        return this.udmDetailShrink;
    }

    public CreateRestoreJobShrinkRequest setUdmRegionId(String udmRegionId) {
        this.udmRegionId = udmRegionId;
        return this;
    }
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

    public CreateRestoreJobShrinkRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
