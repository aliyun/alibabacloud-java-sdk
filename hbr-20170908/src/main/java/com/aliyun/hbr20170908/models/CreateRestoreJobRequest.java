// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateRestoreJobRequest extends TeaModel {
    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
     * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELF_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>158975xxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The paths to the files that you do not want to restore. No files in the specified paths are restored. The value must be 1 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>Details of restoration to local.</p>
     */
    @NameInMap("FailbackDetail")
    public java.util.Map<String, ?> failbackDetail;

    /**
     * <p>The paths to the files that you want to restore. All files in the specified paths are restored. The value must be 1 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>Specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitiatedByAck")
    public Boolean initiatedByAck;

    /**
     * <p>Parameters for restoring a task</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;includes\&quot;:[],\&quot;excludes\&quot;:[],\&quot;conflictPolicy\&quot;:\&quot;OVERWRITE_EXISTING\&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The details about the Tablestore instance.</p>
     */
    @NameInMap("OtsDetail")
    public OtsTableRestoreDetail otsDetail;

    /**
     * <p>The type of the restore destination. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: restores data to Elastic Compute Service (ECS) files.</li>
     * <li><strong>OSS</strong>: restores data to Object Storage Service (OSS) buckets.</li>
     * <li><strong>NAS</strong>: restores data to Apsara File Storage NAS file systems.</li>
     * <li><strong>OTS_TABLE</strong>: restores data to Tablestore instances.</li>
     * <li><strong>UDM_ECS_ROLLBACK</strong>: restores data to ECS instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The hash value of the backup snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>f2fe...</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <p>The ID of the backup snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>s-********************</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: ECS files</li>
     * <li><strong>OSS</strong>: OSS buckets</li>
     * <li><strong>NAS</strong>: NAS file systems</li>
     * <li><strong>OTS_TABLE</strong>: Tablestore instances</li>
     * <li><strong>UDM_ECS</strong>: ECS instances</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the name of the OSS bucket to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    /**
     * <p>The details about the container to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;host\&quot;:\&quot;k8s-node1\&quot;,\&quot;hostPrefix\&quot;:\&quot;/var/lib/kubelet/pods/4acb31fe-8577-40ff-bc8c-eccabd835f73/volumes/kubernetes.io~csi/pvc-b050b00e-ef17-4792-aab1-1642355cf1f4/mount\&quot;,\&quot;pvPath\&quot;:\&quot;/\&quot;}</p>
     */
    @NameInMap("TargetContainer")
    public String targetContainer;

    /**
     * <p>The ID of the container cluster to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-000amjsc7o1h9506oob7</p>
     */
    @NameInMap("TargetContainerClusterId")
    public String targetContainerClusterId;

    /**
     * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the time when the file system is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1554347313</p>
     */
    @NameInMap("TargetCreateTime")
    public Long targetCreateTime;

    /**
     * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the ID of the file system to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("TargetFileSystemId")
    public String targetFileSystemId;

    /**
     * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the ID of the ECS instance to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>i-*********************</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The name of the Tablestore instance to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>instancename</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the destination file path.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>This parameter is required only if the <strong>RestoreType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the prefix of objects that you want to restore.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr</p>
     */
    @NameInMap("TargetPrefix")
    public String targetPrefix;

    /**
     * <p>The name of the table that stores the restored data.</p>
     * 
     * <strong>example:</strong>
     * <p>tablename</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    /**
     * <p>The time when data is restored to the Tablestore instance. The value must be a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1642496881</p>
     */
    @NameInMap("TargetTime")
    public Long targetTime;

    /**
     * <p>The details of ECS instance backup.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sourceInstanceId\&quot;:\&quot;i-uf62te6pm3iwsyxyz66q\&quot;,\&quot;bootAfterRestore\&quot;:false}</p>
     */
    @NameInMap("UdmDetail")
    public java.util.Map<String, ?> udmDetail;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the region to which you want to restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>The ID of the backup vault to which the backup snapshot belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateRestoreJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreJobRequest self = new CreateRestoreJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestoreJobRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateRestoreJobRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateRestoreJobRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateRestoreJobRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public CreateRestoreJobRequest setFailbackDetail(java.util.Map<String, ?> failbackDetail) {
        this.failbackDetail = failbackDetail;
        return this;
    }
    public java.util.Map<String, ?> getFailbackDetail() {
        return this.failbackDetail;
    }

    public CreateRestoreJobRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public CreateRestoreJobRequest setInitiatedByAck(Boolean initiatedByAck) {
        this.initiatedByAck = initiatedByAck;
        return this;
    }
    public Boolean getInitiatedByAck() {
        return this.initiatedByAck;
    }

    public CreateRestoreJobRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateRestoreJobRequest setOtsDetail(OtsTableRestoreDetail otsDetail) {
        this.otsDetail = otsDetail;
        return this;
    }
    public OtsTableRestoreDetail getOtsDetail() {
        return this.otsDetail;
    }

    public CreateRestoreJobRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateRestoreJobRequest setSnapshotHash(String snapshotHash) {
        this.snapshotHash = snapshotHash;
        return this;
    }
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    public CreateRestoreJobRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateRestoreJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateRestoreJobRequest setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }
    public String getTargetBucket() {
        return this.targetBucket;
    }

    public CreateRestoreJobRequest setTargetContainer(String targetContainer) {
        this.targetContainer = targetContainer;
        return this;
    }
    public String getTargetContainer() {
        return this.targetContainer;
    }

    public CreateRestoreJobRequest setTargetContainerClusterId(String targetContainerClusterId) {
        this.targetContainerClusterId = targetContainerClusterId;
        return this;
    }
    public String getTargetContainerClusterId() {
        return this.targetContainerClusterId;
    }

    public CreateRestoreJobRequest setTargetCreateTime(Long targetCreateTime) {
        this.targetCreateTime = targetCreateTime;
        return this;
    }
    public Long getTargetCreateTime() {
        return this.targetCreateTime;
    }

    public CreateRestoreJobRequest setTargetFileSystemId(String targetFileSystemId) {
        this.targetFileSystemId = targetFileSystemId;
        return this;
    }
    public String getTargetFileSystemId() {
        return this.targetFileSystemId;
    }

    public CreateRestoreJobRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateRestoreJobRequest setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    public CreateRestoreJobRequest setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

    public CreateRestoreJobRequest setTargetPrefix(String targetPrefix) {
        this.targetPrefix = targetPrefix;
        return this;
    }
    public String getTargetPrefix() {
        return this.targetPrefix;
    }

    public CreateRestoreJobRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public CreateRestoreJobRequest setTargetTime(Long targetTime) {
        this.targetTime = targetTime;
        return this;
    }
    public Long getTargetTime() {
        return this.targetTime;
    }

    public CreateRestoreJobRequest setUdmDetail(java.util.Map<String, ?> udmDetail) {
        this.udmDetail = udmDetail;
        return this;
    }
    public java.util.Map<String, ?> getUdmDetail() {
        return this.udmDetail;
    }

    public CreateRestoreJobRequest setUdmRegionId(String udmRegionId) {
        this.udmRegionId = udmRegionId;
        return this;
    }
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

    public CreateRestoreJobRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
