// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The configurations of the incremental file synchronization. This parameter is required for data synchronization only.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataSourceId&quot;: &quot;ds-123456789&quot;, &quot;path&quot;: &quot;/changelist&quot;}</p>
     */
    @NameInMap("ChangeListPath")
    public String changeListPath;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the time to create the file system. The value must be a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1607436917</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li>SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</li>
     * <li>CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>15897534xxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;prefix\&quot;:\&quot;/\&quot;}</p>
     */
    @NameInMap("DestDataSourceDetail")
    public java.util.Map<String, ?> destDataSourceDetail;

    /**
     * <strong>example:</strong>
     * <p>ds-*********************</p>
     */
    @NameInMap("DestDataSourceId")
    public String destDataSourceId;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DestSourceType")
    public String destSourceType;

    /**
     * <p>The details about ECS instance backup. The value is a JSON string.</p>
     * <ul>
     * <li>snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are enhanced SSDs (ESSDs).</li>
     * <li>appConsistent: specifies whether to enable application consistency. If you set this parameter to true, you must also specify the preScriptPath and postScriptPath parameters.</li>
     * <li>preScriptPath: the path to the prescript file.</li>
     * <li>postScriptPath: the path to the postscript file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EnableFsFreeze\&quot;:true,\&quot;appConsistent\&quot;:false,\&quot;postScriptPath\&quot;:\&quot;\&quot;,\&quot;preScriptPath\&quot;:\&quot;\&quot;,\&quot;snapshotGroup\&quot;:true,\&quot;timeoutInSeconds\&quot;:60}</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>Specifies whether to disable the plan by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that are excluded from the backup job. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the ID of the NAS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that you want to back up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the ID of the ECS instance.</p>
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
     * <p>Specifies whether to enable the &quot;Keep at least one backup version&quot; feature. Valid values:</p>
     * <ul>
     * <li>0: The feature is disabled.</li>
     * <li>1: The feature is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KeepLatestSnapshots")
    public Long keepLatestSnapshots;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a backup path.</p>
     * <ul>
     * <li>This parameter is available only for Windows ECS instances.</li>
     * <li>If data changes occur in the backup source, the source data must be the same as the data to be backed up before the system sets this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
     * <li>If you use VSS, you cannot back up data from multiple directories.</li>
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
     * <p>The backup paths.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>The name of the backup schedule. The name must be 1 to 64 characters in length. The name of a backup schedule for each type of data source must be unique within a backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>planname</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the prefix of objects that you want to back up. After a prefix is specified, only objects whose names start with the prefix are backed up.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-prefix</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The retention period of backup data. Minimum value: 1. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The rules of the backup schedule.</p>
     */
    @NameInMap("Rule")
    public java.util.List<CreateBackupPlanRequestRule> rule;

    /**
     * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the <code>{startTime}</code> parameter and the subsequent backup jobs at an interval that is specified in the <code>{interval}</code> parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, <code>I|1631685600|P1D</code> specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
     * <ul>
     * <li><strong>startTime</strong>: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
     * <li><strong>interval</strong>: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</li>
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
     * <li><strong>ECS_FILE</strong>: backs up Elastic Compute Service (ECS) files.</li>
     * <li><strong>OSS</strong>: backs up Object Storage Service (OSS) buckets.</li>
     * <li><strong>NAS</strong>: backs up Apsara File Storage NAS file systems.</li>
     * <li><strong>OTS</strong>: backs up Tablestore instances.</li>
     * <li><strong>UDM_ECS</strong>: backs up ECS instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the throttling rules. Format: <code>{start}|{end}|{bandwidth}</code>. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
     * <ul>
     * <li><strong>start</strong>: the start hour.</li>
     * <li><strong>end</strong>: the end hour.</li>
     * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>The region in which the ECS instance that you want to back up resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>The ID of the backup vault.</p>
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
         * <p>The backup type.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the region to which data is replicated.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The retention period of the backup data in geo-redundancy mode. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Specifies whether to enable the rule.</p>
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
         * <p>The retention period of the backup data. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-test-name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The backup policy. Format: I|{startTime}|{interval}. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <p>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds. interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
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
