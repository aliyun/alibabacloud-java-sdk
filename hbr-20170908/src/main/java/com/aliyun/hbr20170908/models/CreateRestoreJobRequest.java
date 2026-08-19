// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateRestoreJobRequest extends TeaModel {
    /**
     * <p>The name of the RAM role created in the source account for cross-account backup managed by the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The cross-account backup type. Valid values: </p>
     * <ul>
     * <li>SELF_ACCOUNT: backup within the current account.</li>
     * <li>CROSS_ACCOUNT: cross-account backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELF_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source account for cross-account backup managed by the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>158975xxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The Cloud Backup feature edition. Valid values:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: Standard Edition. This is the default value.</li>
     * <li><strong>BASIC</strong>: Essential Edition. Currently, only ECS File Backup Essential Edition is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The path to exclude from restoration. All files under this path are not restored. Maximum length: 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>The details of the restoration to the local host.</p>
     */
    @NameInMap("FailbackDetail")
    public java.util.Map<String, ?> failbackDetail;

    /**
     * <p>The path to restore. All files under this path are restored. Maximum length: 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>Specifies whether the operation is invoked by Container Service. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitiatedByAck")
    public Boolean initiatedByAck;

    /**
     * <p>The restore job parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;includes\&quot;:[],\&quot;excludes\&quot;:[],\&quot;conflictPolicy\&quot;:\&quot;OVERWRITE_EXISTING\&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The details of the Tablestore instance.</p>
     */
    @NameInMap("OtsDetail")
    public OtsTableRestoreDetail otsDetail;

    /**
     * <p>The data source type of the restore destination. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: restores to an ECS file.</li>
     * <li><strong>OSS</strong>: restores to Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: restores to Alibaba Cloud NAS.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: restores to CPFS.</li>
     * <li><strong>OTS_TABLE</strong>: restores to Alibaba Cloud OTS.</li>
     * <li><strong>UDM_ECS_ROLLBACK</strong>: restores to an Alibaba Cloud ECS instance (full-copy migration).</li>
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
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: restores ECS files.</li>
     * <li><strong>OSS</strong>: restores Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: restores Alibaba Cloud NAS.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: restores to CPFS.</li>
     * <li><strong>OTS_TABLE</strong>: restores to Alibaba Cloud OTS.</li>
     * <li><strong>UDM_ECS</strong>: restores to an Alibaba Cloud ECS instance (full-copy migration).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is valid only when <strong>RestoreType</strong> is set to <strong>OSS</strong>. The name of the destination OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    /**
     * <p>The details of the target container for restoration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;host\&quot;:\&quot;k8s-node1\&quot;,\&quot;hostPrefix\&quot;:\&quot;/var/lib/kubelet/pods/4acb31fe-8577-40ff-bc8c-eccabd835f73/volumes/kubernetes.io~csi/pvc-b050b00e-ef17-4792-aab1-1642355cf1f4/mount\&quot;,\&quot;pvPath\&quot;:\&quot;/\&quot;}</p>
     */
    @NameInMap("TargetContainer")
    public String targetContainer;

    /**
     * <p>The ID of the target container cluster for restoration.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-000amjsc7o1h9506oob7</p>
     */
    @NameInMap("TargetContainerClusterId")
    public String targetContainerClusterId;

    /**
     * <p>This parameter is valid only when <strong>RestoreType</strong> is set to <strong>NAS</strong>. The creation time of the destination file system. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1554347313</p>
     */
    @NameInMap("TargetCreateTime")
    public Long targetCreateTime;

    /**
     * <p>This parameter is valid only when <strong>RestoreType</strong> is set to <strong>NAS</strong>. The file system ID of the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("TargetFileSystemId")
    public String targetFileSystemId;

    /**
     * <p>This parameter is valid only when <strong>RestoreType</strong> is set to <strong>ECS_FILE</strong>. The ECS instance ID of the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>i-*********************</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The name of the target Tablestore instance for restoration.</p>
     * 
     * <strong>example:</strong>
     * <p>instancename</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <p>This parameter is valid only when <strong>RestoreType</strong> is set to <strong>ECS_FILE</strong>. The file path of the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>This parameter is valid only when <strong>RestoreType</strong> is set to <strong>OSS</strong>. The object prefix of the restore destination.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr</p>
     */
    @NameInMap("TargetPrefix")
    public String targetPrefix;

    /**
     * <p>The name of the target data table in Tablestore for restoration.</p>
     * 
     * <strong>example:</strong>
     * <p>tablename</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    /**
     * <p>The point in time to which the Tablestore data is restored. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1642496881</p>
     */
    @NameInMap("TargetTime")
    public Long targetTime;

    /**
     * <p>This parameter is valid only when SourceType is set to UDM_ECS. The details of the full-copy migration backup. This parameter is a JSON string. The details vary depending on the value of RestoreType:</p>
     * <ul>
     * <li><strong>UDM_ECS_DISK</strong>: ECS cloud disk clone.<ul>
     * <li><strong>targetInstanceId</strong>: string type, required. Instance ID of the target ECS instance to which the cloned cloud disk is attached.</li>
     * <li><strong>diskCategory</strong>: string type, required. The type of the target cloud disk.</li>
     * <li><strong>diskPerformanceLevel</strong>: string type. If diskCategory is set to essd, this parameter specifies the performance level (PL) of the cloud disk. Valid values: PL0, PL1, PL2, and PL3. Default value: PL1.</li>
     * </ul>
     * </li>
     * <li><strong>UDM_ECS_DISK_ROLLBACK</strong>: ECS cloud disk restoration.<ul>
     * <li><strong>sourceInstanceId</strong>: string type, required. Instance ID of the source ECS instance.</li>
     * <li><strong>foreceRestore</strong>: bool type. Default value: false. Specifies whether to forcibly restore. If foreceRestore is set to true, the restore job still restores the cloud disk even if the backed-up cloud disk has been unmounted from the original ECS instance or attached to a new ECS instance. Proceed with caution.</li>
     * <li><strong>bootAfterRestore</strong>: bool type. Default value: false. Specifies whether to start the ECS instance after restoration.</li>
     * </ul>
     * </li>
     * <li><strong>UDM_ECS</strong>: ECS full-copy clone.<ul>
     * <li><strong>bootAfterRestore</strong>: bool type. Default value: false. Specifies whether to start the ECS instance after restoration.</li>
     * <li><strong>diskCategory</strong>: string type, required. The type of the target cloud disk.</li>
     * <li><strong>diskPerformanceLevel</strong>: string type. If diskCategory is set to essd, this parameter specifies the performance level (PL) of the cloud disk. Valid values: PL0, PL1, PL2, and PL3. Default value: PL1.</li>
     * <li><strong>instanceType</strong>: string type, required. The instance type of the target ECS instance.</li>
     * <li><strong>restoredNetwork</strong>: string type, required. The vSwitch ID of the target ECS instance.</li>
     * <li><strong>securityGroup</strong>: string type, required. The security group ID of the target ECS instance.</li>
     * <li><strong>restoredName</strong>: string type, required. The instance name of the target ECS instance.</li>
     * <li><strong>restoredHostName</strong>: string type, required. The hostname of the target ECS instance.</li>
     * <li><strong>allocatePublicIp</strong>: bool type. Default value: false. Specifies whether to assign a public IP address to the target ECS instance.</li>
     * <li><strong>privateIpAddress</strong>: string type. The internal IP address of the target ECS instance. If this parameter is not specified, DHCP is used to randomly assign an IP address.</li>
     * </ul>
     * </li>
     * <li><strong>UDM_ECS_ROLLBACK</strong>: ECS full-copy restoration.<ul>
     * <li><strong>sourceInstanceId</strong>: string type, required. Instance ID of the source ECS instance.</li>
     * <li><strong>forceRestore</strong>: bool type. Default value: false. Specifies whether to forcibly restore. If foreceRestore is set to true, the restore job still restores the cloud disk even if the backed-up cloud disk has been unmounted from the original ECS instance or attached to a new ECS instance. Proceed with caution.</li>
     * <li><strong>bootAfterRestore</strong>: bool type. Default value: false. Specifies whether to start the ECS instance after restoration.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sourceInstanceId\&quot;:\&quot;i-uf62te6pm3iwsyxyz66q\&quot;,\&quot;bootAfterRestore\&quot;:false}</p>
     */
    @NameInMap("UdmDetail")
    public java.util.Map<String, ?> udmDetail;

    /**
     * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>UDM_ECS</strong>. The destination region for restoration.</p>
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

    public CreateRestoreJobRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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
