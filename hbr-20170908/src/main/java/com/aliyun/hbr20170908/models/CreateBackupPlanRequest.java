// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
    /**
     * <p>Backup type. Value: <strong>COMPLETE</strong>, indicating a full backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>OSS</strong>. It represents the OSS bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>Configuration for the incremental file synchronization list. (Required only for synchronization)</p>
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
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>NAS</strong>. It represents the creation time of the file system, in UNIX timestamp, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1607436917</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The role name created in the RAM of the original account for cross-account backup.</p>
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
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The original account ID used for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>15897534xxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The ID of the data source. This parameter is required only for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-****************</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Destination data source details. (Required only for synchronization)</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;prefix\&quot;:\&quot;/\&quot;}</p>
     */
    @NameInMap("DestDataSourceDetail")
    public java.util.Map<String, ?> destDataSourceDetail;

    /**
     * <p>Destination data source ID. (Required only for synchronization)</p>
     * 
     * <strong>example:</strong>
     * <p>ds-*********************</p>
     */
    @NameInMap("DestDataSourceId")
    public String destDataSourceId;

    /**
     * <p>Destination data source type. (Required only for synchronization)</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DestSourceType")
    public String destSourceType;

    /**
     * <p>Details of the whole machine backup, in JSON string format.</p>
     * <ul>
     * <li>snapshotGroup: Whether to use a consistent snapshot group (only valid if all instance disks are ESSD).</li>
     * <li>appConsistent: Whether to use application consistency (requires the use of preScriptPath and postScriptPath parameters).</li>
     * <li>preScriptPath: Path to the freeze script.</li>
     * <li>postScriptPath: Path to the thaw script.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EnableFsFreeze\&quot;:true,\&quot;appConsistent\&quot;:false,\&quot;postScriptPath\&quot;:\&quot;\&quot;,\&quot;preScriptPath\&quot;:\&quot;\&quot;,\&quot;snapshotGroup\&quot;:true,\&quot;timeoutInSeconds\&quot;:60}</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>Is the plan disabled by default</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. It specifies the path that should not be backed up, meaning all files under this path will not be included in the backup. The maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>NAS</strong>. It represents the file system ID.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. It represents the path to be backed up, and all files under this path will be backed up. Supports up to 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. It represents the ECS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-m5e*****6q</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Table store instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>instancename</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Whether to enable retaining at least one backup version.</p>
     * <ul>
     * <li>0 - Do not retain</li>
     * <li>1 - Retain</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KeepLatestSnapshots")
    public Long keepLatestSnapshots;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. It indicates whether to use the Windows system VSS to define the backup path.</p>
     * <ul>
     * <li>This feature only supports Windows type ECS instances.</li>
     * <li>If there are data changes in the backup source and you need to ensure consistency between the backup data and the source data, you can configure it as <code>[&quot;UseVSS&quot;:true]</code>.</li>
     * <li>After choosing to use VSS, multiple file directories cannot be backed up simultaneously.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UseVSS&quot;:false}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The details about the Tablestore instance.</p>
     */
    @NameInMap("OtsDetail")
    public OtsDetail otsDetail;

    /**
     * <p>Backup paths.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>Name of the backup plan. 1 to 64 characters. The name must be unique for each data source type within a single backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>planname</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>OSS</strong>. It represents the backup prefix. When specified, only objects matching the prefix are backed up.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-prefix</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>Number of days to retain the backup, with a minimum value of 1, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>Backup plan rules.</p>
     */
    @NameInMap("Rule")
    public java.util.List<CreateBackupPlanRequestRule> rule;

    /**
     * <p>Backup policy. Optional format: <code>I|{startTime}|{interval}</code>. This indicates that a backup task will be executed every <code>{interval}</code> starting from <code>{startTime}</code>. It does not compensate for missed backup tasks due to past time. If the previous backup task has not been completed, the next backup task will not be triggered. For example, <code>I|1631685600|P1D</code> means a backup is performed every day starting from 2021-09-15 14:00:00.</p>
     * <ul>
     * <li><strong>startTime</strong>: Start time of the backup, in UNIX timestamp, in seconds.</li>
     * <li><strong>interval</strong>: ISO8601 time interval. For example, PT1H indicates an interval of one hour, and P1D indicates an interval of one day.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I|1602673264|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
     * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
     * <li><strong>NAS</strong>: File Storage NAS (NAS) file systems</li>
     * <li><strong>OTS</strong>: Tablestore instances</li>
     * <li><strong>UDM_ECS</strong>: ECS instances</li>
     * <li><strong>SYNC</strong>: data synchronization</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. It represents the backup traffic control. Format: <code>{start}:{end}:{bandwidth}</code>. Multiple traffic control configurations are separated by |, and the configured times should not overlap.</p>
     * <ul>
     * <li><strong>start</strong>: Start hour.</li>
     * <li><strong>end</strong>: End hour.</li>
     * <li><strong>bandwidth</strong>: Limit rate, in KB/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>Region where the whole machine backup instance is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>Backup vault ID.</p>
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
         * <p>Backup type.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>ID of the region for offsite replication.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>Number of days to retain offsite backups.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Whether to enable offsite replication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>Backup retention period.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-test-name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Backup strategy. Optional format: I|{startTime}|{interval}. This means that a backup task is executed every {interval} starting from {startTime}. Backup tasks for past times will not be executed. If the previous backup task has not been completed, the next backup task will not be triggered. For example, I|1631685600|P1D means a backup is performed every day starting from 2021-09-15 14:00:00.</p>
         * <ul>
         * <li>startTime: The start time of the backup, in UNIX time, in seconds.</li>
         * <li>interval: ISO8601 time interval. For example, PT1H means an interval of one hour. P1D means an interval of one day.</li>
         * </ul>
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
