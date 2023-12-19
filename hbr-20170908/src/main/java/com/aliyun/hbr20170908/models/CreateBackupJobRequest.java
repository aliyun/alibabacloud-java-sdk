// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupJobRequest extends TeaModel {
    /**
     * <p>The backup type. Valid values:</p>
     * <br>
     * <p>*   **COMPLETE**: full backup</p>
     * <p>*   **INCREMENTAL**: incremental backup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the cluster. This parameter is required only if you set the **SourceType** parameter to **CONTAINER**.</p>
     */
    @NameInMap("ContainerClusterId")
    public String containerClusterId;

    /**
     * <p>The cluster resources. This parameter is required only if you set the **SourceType** parameter to **CONTAINER**.</p>
     */
    @NameInMap("ContainerResources")
    public String containerResources;

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
     * <p>This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies the paths to the files that are excluded from the backup job. The value must be 1 to 255 characters in length.</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies the paths to the files that you want to back up. The value must be 1 to 255 characters in length.</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>This parameter specifies whether to initiate the request by using Container Service for Kubernetes (ACK). Default value: false.</p>
     */
    @NameInMap("InitiatedByAck")
    public Boolean initiatedByAck;

    /**
     * <p>This parameter is required only if you set the **SourceType** parameter to **UDM_ECS**. This parameter specifies the ID of the ECS instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the backup job.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a source path.</p>
     * <br>
     * <p>*   This parameter is available only for Windows ECS instances.</p>
     * <p>*   If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to `["UseVSS":true]`.</p>
     * <p>*   If you use VSS, you cannot back up data from multiple directories.</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The retention period of the backup data. Unit: days.</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **UDM_ECS**: ECS instances</p>
     * <p>*   **CONTAINER**: containers</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if you set the **SourceType** parameter to **ECS_FILE**. This parameter specifies the throttling rules. Format: `{start}|{end}|{bandwidth}`. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
     * <br>
     * <p>*   **start**: the start hour.</p>
     * <p>*   **end**: the end hour.</p>
     * <p>*   **bandwidth**: the bandwidth. Unit: KB/s.</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateBackupJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupJobRequest self = new CreateBackupJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupJobRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateBackupJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateBackupJobRequest setContainerClusterId(String containerClusterId) {
        this.containerClusterId = containerClusterId;
        return this;
    }
    public String getContainerClusterId() {
        return this.containerClusterId;
    }

    public CreateBackupJobRequest setContainerResources(String containerResources) {
        this.containerResources = containerResources;
        return this;
    }
    public String getContainerResources() {
        return this.containerResources;
    }

    public CreateBackupJobRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateBackupJobRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateBackupJobRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateBackupJobRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public CreateBackupJobRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public CreateBackupJobRequest setInitiatedByAck(Boolean initiatedByAck) {
        this.initiatedByAck = initiatedByAck;
        return this;
    }
    public Boolean getInitiatedByAck() {
        return this.initiatedByAck;
    }

    public CreateBackupJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBackupJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateBackupJobRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateBackupJobRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public CreateBackupJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateBackupJobRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public CreateBackupJobRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
