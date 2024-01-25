// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **OSS**. This parameter specifies the name of the OSS bucket.</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The configurations of the incremental file synchronization. This parameter is required for data synchronization only.</p>
     */
    @NameInMap("ChangeListPath")
    public String changeListPath;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **NAS**. This parameter specifies the time to create the file system. The value must be a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</p>
     * <p>*   CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    @NameInMap("DestDataSourceDetail")
    public java.util.Map<String, ?> destDataSourceDetail;

    @NameInMap("DestDataSourceId")
    public String destDataSourceId;

    @NameInMap("DestSourceType")
    public String destSourceType;

    /**
     * <p>The details about ECS instance backup. The value is a JSON string.</p>
     * <br>
     * <p>*   snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are enhanced SSDs (ESSDs).</p>
     * <p>*   appConsistent: specifies whether to enable application consistency. If you set this parameter to true, you must also specify the preScriptPath and postScriptPath parameters.</p>
     * <p>*   preScriptPath: the path to the prescript file.</p>
     * <p>*   postScriptPath: the path to the postscript file.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the paths to the files that are excluded from the backup job. The value can be up to 255 characters in length.</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **NAS**. This parameter specifies the ID of the NAS file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the paths to the files that you want to back up. The value can be up to 255 characters in length.</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the ID of the ECS instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the Tablestore instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Specifies whether to enable the "Keep at least one backup version" feature. Valid values:</p>
     * <br>
     * <p>*   0: The feature is disabled.</p>
     * <p>*   1: The feature is enabled.</p>
     */
    @NameInMap("KeepLatestSnapshots")
    public Long keepLatestSnapshots;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a backup path.</p>
     * <br>
     * <p>*   This parameter is available only for Windows ECS instances.</p>
     * <p>*   If data changes occur in the backup source, the source data must be the same as the data to be backed up before the system sets this parameter to `["UseVSS":true]`.</p>
     * <p>*   If you use VSS, you cannot back up data from multiple directories.</p>
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
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **OSS**. This parameter specifies the prefix of objects that you want to back up. After a prefix is specified, only objects whose names start with the prefix are backed up.</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The retention period of backup data. Minimum value: 1. Unit: days.</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The rules of the backup schedule.</p>
     */
    @NameInMap("Rule")
    public java.util.List<CreateBackupPlanRequestRule> rule;

    /**
     * <p>The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the `{startTime}` parameter and the subsequent backup jobs at an interval that is specified in the `{interval}` parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
     * <br>
     * <p>*   **startTime**: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</p>
     * <p>*   **interval**: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: backs up Elastic Compute Service (ECS) files.</p>
     * <p>*   **OSS**: backs up Object Storage Service (OSS) buckets.</p>
     * <p>*   **NAS**: backs up Apsara File Storage NAS file systems.</p>
     * <p>*   **OTS**: backs up Tablestore instances.</p>
     * <p>*   **UDM_ECS**: backs up ECS instances.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the throttling rules. Format: `{start}|{end}|{bandwidth}`. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
     * <br>
     * <p>*   **start**: the start hour.</p>
     * <p>*   **end**: the end hour.</p>
     * <p>*   **bandwidth**: the bandwidth. Unit: KB/s.</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>The region in which the ECS instance that you want to back up resides.</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    /**
     * <p>The ID of the backup vault.</p>
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
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the region to which data is replicated.</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The retention period of the backup data in geo-redundancy mode. Unit: days.</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Specifies whether to enable the rule.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Specifies whether to enable cross-region replication.</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>The retention period of the backup data. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The backup policy. Format: I|{startTime}|{interval}. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds. interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
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
