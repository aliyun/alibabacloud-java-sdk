// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup type. Set the value to <strong>COMPLETE</strong>, which indicates full backup.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The configuration of the incremental file synchronization list. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataSourceId&quot;: &quot;ds-123456789&quot;, &quot;path&quot;: &quot;/changelist&quot;}</p>
     */
    @NameInMap("ChangeListPath")
    public String changeListPath;

    /**
     * <p>The ID of the client group that executes the data synchronization plan. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-***************</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The time when the file system was created. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1607436917</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The name of the RAM role created in the source account for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The cross-account backup type. Valid values: </p>
     * <ul>
     * <li>SELF_ACCOUNT: backup within the same account.</li>
     * <li>CROSS_ACCOUNT: cross-account backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source account for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>15897534xxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The ID of the source data source. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-****************</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The details of the destination data source. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;prefix\&quot;:\&quot;/\&quot;}</p>
     */
    @NameInMap("DestDataSourceDetail")
    public java.util.Map<String, ?> destDataSourceDetail;

    /**
     * <p>The ID of the destination data source. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-*********************</p>
     */
    @NameInMap("DestDataSourceId")
    public String destDataSourceId;

    /**
     * <p>The type of the destination data source. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DestSourceType")
    public String destSourceType;

    /**
     * <p>The details of the full-copy backup. The value is a JSON string.</p>
     * <ul>
     * <li>snapshotGroup: specifies whether to use a consistent snapshot group. This parameter is valid only when all cloud disks of the instance are ESSDs.</li>
     * <li>appConsistent: specifies whether to use application consistency. This parameter must be used together with the preScriptPath and postScriptPath parameters.</li>
     * <li>preScriptPath: the path of the pre-freeze script.</li>
     * <li>postScriptPath: the path of the post-thaw script.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EnableFsFreeze\&quot;:true,\&quot;appConsistent\&quot;:false,\&quot;postScriptPath\&quot;:\&quot;\&quot;,\&quot;preScriptPath\&quot;:\&quot;\&quot;,\&quot;snapshotGroup\&quot;:true,\&quot;timeoutInSeconds\&quot;:60}</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>Specifies whether the plan is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>The edition type. Valid values: BASIC and STANDARD. Default value: STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The path to exclude from the backup. All files in this path are not backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The file system ID.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The path to include in the backup. All files in this path are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The ECS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-m5e*****6q</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the Tablestore instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instancename</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Specifies whether to retain at least one backup version. Valid values:</p>
     * <ul>
     * <li>0: does not retain.</li>
     * <li>1: retains.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KeepLatestSnapshots")
    public Long keepLatestSnapshots;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. Specifies whether to use Windows Volume Shadow Copy Service (VSS) to define the source path.</p>
     * <ul>
     * <li>This feature is supported only for Windows ECS instances.</li>
     * <li>If the backup source contains data changes and you need to ensure consistency between the backup data and the source data, set this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
     * <li>After VSS is enabled, multiple file folders cannot be backed up simultaneously.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UseVSS&quot;:false}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The details of the Tablestore instance.</p>
     */
    @NameInMap("OtsDetail")
    public OtsDetail otsDetail;

    /**
     * <p>The source paths.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>The name of the backup plan. The name must be 1 to 64 characters in length. The backup plan name must be unique for each data source type within a single vault.</p>
     * 
     * <strong>example:</strong>
     * <p>planname</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. The backup prefix. If specified, only objects that match the prefix are backed up.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-prefix</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The backup plan rules.</p>
     */
    @NameInMap("Rule")
    public java.util.List<CreateBackupPlanRequestRule> rule;

    /**
     * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. This indicates that a backup job is executed at every <code>{interval}</code> starting from <code>{startTime}</code>. Backup jobs for past time periods are not compensated. If the previous backup job is not completed, the next backup job is not triggered. Example: <code>I|1631685600|P1D</code> indicates that a backup is performed once a day starting from 2021-09-15 14:00:00.</p>
     * <ul>
     * <li><strong>startTime</strong>: the start time of the backup. The value is a UNIX timestamp. Unit: seconds.</li>
     * <li><strong>interval</strong>: the ISO 8601 time interval. Example: PT1H indicates an interval of one hour. P1D indicates an interval of one day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>I|1602673264|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: backs up ECS files.</li>
     * <li><strong>OSS</strong>: backs up Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: backs up Alibaba Cloud NAS.</li>
     * <li><strong>OTS</strong>: backs up Alibaba Cloud OTS.</li>
     * <li><strong>UDM_ECS</strong>: backs up an entire ECS instance.</li>
     * <li><strong>SYNC</strong>: data synchronization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The backup traffic control. Format: <code>{start}:{end}:{bandwidth}</code>. Separate multiple traffic control configurations with vertical bars (|). The time ranges of the configurations cannot overlap.</p>
     * <ul>
     * <li><strong>start</strong>: the start hour.</li>
     * <li><strong>end</strong>: the end hour.</li>
     * <li><strong>bandwidth</strong>: the rate limit. Unit: KB/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>The region where the ECS instance for full-copy backup resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>The vault ID.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0006******q</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPlanRequest self = new CreateBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupPlanRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateBackupPlanRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public CreateBackupPlanRequest setChangeListPath(String changeListPath) {
        this.changeListPath = changeListPath;
        return this;
    }
    public String getChangeListPath() {
        return this.changeListPath;
    }

    public CreateBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateBackupPlanRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateBackupPlanRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateBackupPlanRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateBackupPlanRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateBackupPlanRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateBackupPlanRequest setDestDataSourceDetail(java.util.Map<String, ?> destDataSourceDetail) {
        this.destDataSourceDetail = destDataSourceDetail;
        return this;
    }
    public java.util.Map<String, ?> getDestDataSourceDetail() {
        return this.destDataSourceDetail;
    }

    public CreateBackupPlanRequest setDestDataSourceId(String destDataSourceId) {
        this.destDataSourceId = destDataSourceId;
        return this;
    }
    public String getDestDataSourceId() {
        return this.destDataSourceId;
    }

    public CreateBackupPlanRequest setDestSourceType(String destSourceType) {
        this.destSourceType = destSourceType;
        return this;
    }
    public String getDestSourceType() {
        return this.destSourceType;
    }

    public CreateBackupPlanRequest setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public CreateBackupPlanRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public CreateBackupPlanRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public CreateBackupPlanRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public CreateBackupPlanRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateBackupPlanRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public CreateBackupPlanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBackupPlanRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateBackupPlanRequest setKeepLatestSnapshots(Long keepLatestSnapshots) {
        this.keepLatestSnapshots = keepLatestSnapshots;
        return this;
    }
    public Long getKeepLatestSnapshots() {
        return this.keepLatestSnapshots;
    }

    public CreateBackupPlanRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateBackupPlanRequest setOtsDetail(OtsDetail otsDetail) {
        this.otsDetail = otsDetail;
        return this;
    }
    public OtsDetail getOtsDetail() {
        return this.otsDetail;
    }

    public CreateBackupPlanRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public CreateBackupPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public CreateBackupPlanRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public CreateBackupPlanRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public CreateBackupPlanRequest setRule(java.util.List<CreateBackupPlanRequestRule> rule) {
        this.rule = rule;
        return this;
    }
    public java.util.List<CreateBackupPlanRequestRule> getRule() {
        return this.rule;
    }

    public CreateBackupPlanRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public CreateBackupPlanRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateBackupPlanRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public CreateBackupPlanRequest setUdmRegionId(String udmRegionId) {
        this.udmRegionId = udmRegionId;
        return this;
    }
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

    public CreateBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public static class CreateBackupPlanRequestRule extends TeaModel {
        /**
         * <p>The backup type.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the destination region for cross-region replication.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The retention period of the geo-redundancy backup. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Specifies whether the rule is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Specifies whether to enable cross-region replication.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>The retention period of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-test-name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The backup policy. Format: I|{startTime}|{interval}. This indicates that a backup job is executed at every {interval} starting from {startTime}. Backup jobs for past time periods are not executed. If the previous backup job is not completed, the next backup job is not triggered. Example: I|1631685600|P1D indicates that a backup is performed once a day starting from 2021-09-15 14:00:00.</p>
         * <p>startTime: the start time of the backup. The value is a UNIX timestamp. Unit: seconds.
         * interval: the ISO 8601 time interval. Example: PT1H indicates an interval of one hour. P1D indicates an interval of one day.</p>
         * 
         * <strong>example:</strong>
         * <p>I|1602673264|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        public static CreateBackupPlanRequestRule build(java.util.Map<String, ?> map) throws Exception {
            CreateBackupPlanRequestRule self = new CreateBackupPlanRequestRule();
            return TeaModel.build(map, self);
        }

        public CreateBackupPlanRequestRule setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public CreateBackupPlanRequestRule setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public CreateBackupPlanRequestRule setDestinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        public CreateBackupPlanRequestRule setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public CreateBackupPlanRequestRule setDoCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        public CreateBackupPlanRequestRule setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public CreateBackupPlanRequestRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateBackupPlanRequestRule setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

    }

}
