// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupJobShrinkRequest extends TeaModel {
    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>COMPLETE</strong>: full backup</li>
     * <li><strong>INCREMENTAL</strong>: incremental backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INCREMENTAL</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-00068btz******oku</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the cluster. This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>CONTAINER</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-000xxxxxxxxxxxxxxi00</p>
     */
    @NameInMap("ContainerClusterId")
    public String containerClusterId;

    /**
     * <p>The cluster resources. This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>CONTAINER</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;resourceType\&quot;:\&quot;PV\&quot;,\&quot;backupMethod\&quot;:\&quot;FILE\&quot;,\&quot;resourceId\&quot;:\&quot;674dac6d-74cd-47e9-a675-09e2f10d2c45\&quot;,\&quot;resourceInfo\&quot;:\&quot;{\\\&quot;pv_name\\\&quot;:\\\&quot;nas-650dac6d-74cd-47e9-a675-09e2f10d2c45\\\&quot;,\\\&quot;pv_size\\\&quot;:\\\&quot;8Gi\\\&quot;,\\\&quot;storage_class\\\&quot;:\\\&quot;alibabacloud-cnfs-nas\\\&quot;,\\\&quot;pvc_name\\\&quot;:\\\&quot;data-postgresql-default-0\\\&quot;,\\\&quot;namespace\\\&quot;:\\\&quot;database\\\&quot;}\&quot;,\&quot;host\&quot;:\&quot;cn-huhehaote.192.168.13.133\&quot;,\&quot;hostPrefix\&quot;:\&quot;6f5e758e-8d35-4584-b9ce-8333adfc7547/volumes/kubernetes.io~csi/nas-670dac6d-74cd-47e9-a675-09e2f10d2c45/mount\&quot;,\&quot;pvPath\&quot;:\&quot;/\&quot;}]</p>
     */
    @NameInMap("ContainerResources")
    public String containerResources;

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
     * <p>158975xxxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The details about ECS instance backup. The value is a JSON string.</p>
     * <ul>
     * <li><p>doCopy: specifies whether to enable remote replication.</p>
     * </li>
     * <li><p>destinationRegionId: the destination region for remote replication.</p>
     * </li>
     * <li><p>destinationRetention: the retention period of the backup point for remote replication.</p>
     * </li>
     * <li><p>diskIdList: the IDs of the disks that are to be backed up. If this parameter is left empty, all disks are backed up.</p>
     * </li>
     * <li><p>snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are Enterprise SSDs (ESSDs).</p>
     * </li>
     * <li><p>appConsistent: specifies whether to use the application-consistent backup feature. This parameter must be used with the preScriptPath and postScriptPath parameters.</p>
     * </li>
     * <li><p>preScriptPath: the path to the pre-freeze scripts.</p>
     * </li>
     * <li><p>postScriptPath: the path to the post-thaw scripts.</p>
     * </li>
     * <li><p>enableWriters: This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to create application-consistent snapshots.</p>
     * <ul>
     * <li>true (default): creates application-consistent snapshots.</li>
     * <li>false: creates file system-consistent snapshots.</li>
     * </ul>
     * </li>
     * <li><p>enableFsFreeze: This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
     * </li>
     * <li><p>timeoutSeconds: This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;doCopy&quot;: false,
     *     &quot;destinationRegionId&quot;: &quot;&quot;,
     *     &quot;destinationRetention&quot;: null,
     *     &quot;diskIdList&quot;: [],
     *     &quot;snapshotGroup&quot;: false,
     *     &quot;appConsistent&quot;: false,
     *     &quot;enableWriters&quot;: true,
     *     &quot;preScriptPath&quot;: &quot;&quot;,
     *     &quot;postScriptPath&quot;: &quot;&quot;,
     *     &quot;enableFsFreeze&quot;: true,
     *     &quot;timeoutInSeconds&quot;: 60
     * }</p>
     */
    @NameInMap("Detail")
    public String detailShrink;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that are excluded from the backup job. The value must be 1 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that you want to back up. The value must be 1 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>This parameter specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitiatedByAck")
    public Boolean initiatedByAck;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>UDM_ECS</strong>. This parameter specifies the ID of the Elastic Compute Service (ECS) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1xxxxxxxxxxxxxxysm</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the backup job.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-backup-infra-20220131150046-hbr</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong>. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a source path.</p>
     * <ul>
     * <li>This parameter is available only for Windows ECS instances.</li>
     * <li>If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
     * <li>If you use VSS, you cannot back up data from multiple directories.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UseVSS&quot;:false}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The retention period of the backup data. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
     * <li><strong>UDM_ECS</strong>: ECS instances</li>
     * <li><strong>CONTAINER</strong>: containers</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTAINER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong>. This parameter specifies the throttling rules. Format: <code>{start}|{end}|{bandwidth}</code>. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
     * <ul>
     * <li><strong>start</strong>: the start hour.</li>
     * <li><strong>end</strong>: the end hour.</li>
     * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0:24:NaN</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000xxxxxxxxxxxxxxy1v</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateBackupJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupJobShrinkRequest self = new CreateBackupJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupJobShrinkRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateBackupJobShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateBackupJobShrinkRequest setContainerClusterId(String containerClusterId) {
        this.containerClusterId = containerClusterId;
        return this;
    }
    public String getContainerClusterId() {
        return this.containerClusterId;
    }

    public CreateBackupJobShrinkRequest setContainerResources(String containerResources) {
        this.containerResources = containerResources;
        return this;
    }
    public String getContainerResources() {
        return this.containerResources;
    }

    public CreateBackupJobShrinkRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateBackupJobShrinkRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateBackupJobShrinkRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateBackupJobShrinkRequest setDetailShrink(String detailShrink) {
        this.detailShrink = detailShrink;
        return this;
    }
    public String getDetailShrink() {
        return this.detailShrink;
    }

    public CreateBackupJobShrinkRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public CreateBackupJobShrinkRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public CreateBackupJobShrinkRequest setInitiatedByAck(Boolean initiatedByAck) {
        this.initiatedByAck = initiatedByAck;
        return this;
    }
    public Boolean getInitiatedByAck() {
        return this.initiatedByAck;
    }

    public CreateBackupJobShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBackupJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateBackupJobShrinkRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateBackupJobShrinkRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public CreateBackupJobShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateBackupJobShrinkRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public CreateBackupJobShrinkRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
