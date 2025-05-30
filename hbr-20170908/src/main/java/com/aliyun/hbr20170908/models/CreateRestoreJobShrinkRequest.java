// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateRestoreJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the role created in the RAM of the original account for cross-account backup managed by the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Cross-account backup type. Supported values:</p>
     * <ul>
     * <li>SELF_ACCOUNT: Backup within the same account</li>
     * <li>CROSS_ACCOUNT: Cross-account backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELF_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The original account ID managed by the current account for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>158975xxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The path not to be restored. All documents under this path will not be restored. Maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>Details of restoring to the local environment.</p>
     */
    @NameInMap("FailbackDetail")
    public String failbackDetailShrink;

    /**
     * <p>The path to be restored. All documents under this path will be restored. Maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>Indicates whether it is called by the container service. Default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitiatedByAck")
    public Boolean initiatedByAck;

    /**
     * <p>Parameters for the restore job.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;includes\&quot;:[],\&quot;excludes\&quot;:[],\&quot;conflictPolicy\&quot;:\&quot;OVERWRITE_EXISTING\&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>Details of the Table Store instance.</p>
     */
    @NameInMap("OtsDetail")
    public String otsDetailShrink;

    /**
     * <p>The type of the restore destination data source. Possible values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Restore to ECS file.</li>
     * <li><strong>OSS</strong>: Restore to Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: Restore to Alibaba Cloud NAS.</li>
     * <li><strong>OTS_TABLE</strong>: Restore to Alibaba Cloud OTS.</li>
     * <li><strong>UDM_ECS_ROLLBACK</strong>: Restore to Alibaba Cloud ECS whole machine.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The HASH value of the backup snapshot.</p>
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
     * <p>The type of the data source. Possible values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Restore ECS file.</li>
     * <li><strong>OSS</strong>: Restore Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: Restore Alibaba Cloud NAS.</li>
     * <li><strong>OTS_TABLE</strong>: Restore to Alibaba Cloud OTS.</li>
     * <li><strong>UDM_ECS</strong>: Restore to Alibaba Cloud ECS whole machine.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Valid only when <strong>RestoreType</strong> is <strong>OSS</strong>. Indicates the name of the OSS bucket at the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    /**
     * <p>Details of the target container.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;host\&quot;:\&quot;k8s-node1\&quot;,\&quot;hostPrefix\&quot;:\&quot;/var/lib/kubelet/pods/4acb31fe-8577-40ff-bc8c-eccabd835f73/volumes/kubernetes.io~csi/pvc-b050b00e-ef17-4792-aab1-1642355cf1f4/mount\&quot;,\&quot;pvPath\&quot;:\&quot;/\&quot;}</p>
     */
    @NameInMap("TargetContainer")
    public String targetContainer;

    /**
     * <p>The ID of the target container cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-000amjsc7o1h9506oob7</p>
     */
    @NameInMap("TargetContainerClusterId")
    public String targetContainerClusterId;

    /**
     * <p>Valid only when <strong>RestoreType</strong> is <strong>NAS</strong>. Indicates the creation time of the file system at the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>1554347313</p>
     */
    @NameInMap("TargetCreateTime")
    public Long targetCreateTime;

    /**
     * <p>Valid only when <strong>RestoreType</strong> is <strong>NAS</strong>. Indicates the ID of the file system at the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("TargetFileSystemId")
    public String targetFileSystemId;

    /**
     * <p>Valid only when <strong>RestoreType</strong> is <strong>ECS_FILE</strong>. Indicates the ECS instance ID at the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>i-*********************</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The name of the target Table Store instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instancename</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <p>Valid only when <strong>RestoreType</strong> is <strong>ECS_FILE</strong>. Indicates the file path at the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>Valid only when <strong>RestoreType</strong> is <strong>OSS</strong>. Indicates the object prefix at the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr</p>
     */
    @NameInMap("TargetPrefix")
    public String targetPrefix;

    /**
     * <p>The name of the data table in the target Table Store.</p>
     * 
     * <strong>example:</strong>
     * <p>tablename</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    /**
     * <p>The time of the Table Store to be restored. UNIX timestamp, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1642496881</p>
     */
    @NameInMap("TargetTime")
    public Long targetTime;

    /**
     * <p>The parameter is valid only when the SourceType is set to UDM_ECS. It represents the details of the entire machine backup and is a JSON string. Depending on the value of RestoreType, different details must be passed as follows:</p>
     * <ul>
     * <li><strong>UDM_ECS_DISK</strong>: ECS disk cloning.<ul>
     * <li><strong>targetInstanceId</strong>: string (required). Specifies the target ECS instance ID to which the cloned disk will be attached.</li>
     * <li><strong>diskCategory</strong>: string (required). Specifies the type of the target disk.</li>
     * <li><strong>diskPerformanceLevel</strong>: string. When diskCategory is &quot;essd&quot;, this indicates the disk performance level, supporting PL0, PL1, PL2, and PL3, with PL1 as the default.</li>
     * </ul>
     * </li>
     * <li><strong>UDM_ECS_DISK_ROLLBACK</strong>: ECS disk rollback.<ul>
     * <li><strong>sourceInstanceId</strong>: string (required). Specifies the source ECS instance ID.</li>
     * <li><strong>forceRestore</strong>: bool (default: false). Indicates whether to force restore. NOTE: If forceRestore is set to true, the disk restoration will proceed even if the backup disk has been unmounted from the original ECS instance or mounted to another instance. Exercise caution when using this option.</li>
     * <li><strong>bootAfterRestore</strong>: bool (default: false). Indicates whether to start the ECS instance after restoration.</li>
     * </ul>
     * </li>
     * <li><strong>UDM_ECS</strong>: Full ECS cloning.<ul>
     * <li><strong>bootAfterRestore</strong>: bool (default: false). Indicates whether to start the ECS instance after restoration.</li>
     * <li><strong>diskCategory</strong>: string (required). Specifies the type of the target disk.</li>
     * <li><strong>diskPerformanceLevel</strong>: string. When diskCategory is &quot;essd&quot;, this indicates the disk performance level (PL0/PL1/PL2/PL3), defaulting to PL1.</li>
     * <li><strong>instanceType</strong>: string (required). Specifies the specification of the target ECS instance.</li>
     * <li><strong>restoredNetwork</strong>: string (required). Specifies the vSwitch ID for the target ECS instance.</li>
     * <li><strong>securityGroup</strong>: string (required). Specifies the security group ID for the target ECS instance.</li>
     * <li><strong>restoredName:</strong> string (required). Specifies the instance name of the target ECS instance.</li>
     * <li><strong>restoredHostName</strong>: string (required). Specifies the host name of the target ECS instance.</li>
     * <li><strong>allocatePublicIp</strong>: bool (default: false). Indicates whether to assign a public IP to the target ECS instance.</li>
     * <li><strong>privateIpAddress</strong>: string. Specifies the internal IP address of the target ECS instance. If not specified, an IP will be assigned via DHCP.</li>
     * </ul>
     * </li>
     * <li><strong>UDM_ECS_ROLLBACK</strong>: Full ECS rollback.<ul>
     * <li><strong>sourceInstanceId</strong>: string (required). Specifies the source ECS instance ID.</li>
     * <li><strong>forceRestore</strong>: bool (default: false). Indicates whether to force restore. NOTE: If forceRestore is set to true, the disk restoration will proceed even if the backup disk has been unmounted from the original ECS instance or mounted to another instance. Exercise caution when using this option.</li>
     * <li><strong>bootAfterRestore</strong>: bool (default: false). Indicates whether to start the ECS instance after restoration.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sourceInstanceId\&quot;:\&quot;i-uf62te6pm3iwsyxyz66q\&quot;,\&quot;bootAfterRestore\&quot;:false}</p>
     */
    @NameInMap("UdmDetail")
    public String udmDetailShrink;

    /**
     * <p>Valid only when <strong>SourceType</strong> is <strong>UDM_ECS</strong>. Indicates the target region for the restore.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>The ID of the backup vault that the snapshot belongs to.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
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
