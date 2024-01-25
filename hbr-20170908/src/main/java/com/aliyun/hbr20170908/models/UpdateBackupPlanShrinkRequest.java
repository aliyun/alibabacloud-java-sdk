// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateBackupPlanShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of the incremental file synchronization. This parameter is required for data synchronization only.</p>
     */
    @NameInMap("ChangeListPath")
    public String changeListPath;

    /**
     * <p>The details about ECS instance backup. The value is a JSON string.</p>
     * <br>
     * <p>*   snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are enhanced SSDs (ESSDs).</p>
     * <p>*   appConsistent: specifies whether to enable application consistency. If you set this parameter to true, you must also specify the preScriptPath and postScriptPath parameters.</p>
     * <p>*   preScriptPath: the path to the pre-freeze scripts.</p>
     * <p>*   postScriptPath: the path to the post-thaw scripts.</p>
     */
    @NameInMap("Detail")
    public String detailShrink;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the paths to the files that are excluded from the backup job. The value must be 1 to 255 characters in length.</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the paths to the files that you want to back up. The value must be 1 to 255 characters in length.</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>Specifies whether to enable the feature of keeping at least one backup version. Valid values:</p>
     * <br>
     * <p>*   0: The feature is disabled.</p>
     * <p>*   1: The feature is enabled.</p>
     */
    @NameInMap("KeepLatestSnapshots")
    public Long keepLatestSnapshots;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a source path.</p>
     * <br>
     * <p>*   This parameter is available only for Windows ECS instances.</p>
     * <p>*   If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to `["UseVSS":true]`.</p>
     * <p>*   If you use VSS, you cannot back up data from multiple directories.</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The details about the Tablestore instance.</p>
     */
    @NameInMap("OtsDetail")
    public String otsDetailShrink;

    /**
     * <p>The source paths.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>The ID of the backup plan.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The name of the backup plan.</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **OSS**. This parameter specifies the prefix of objects that you want to back up. After a prefix is specified, only objects whose names start with the prefix are backed up.</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The rule of the backup plan.</p>
     */
    @NameInMap("Rule")
    public java.util.List<UpdateBackupPlanShrinkRequestRule> rule;

    /**
     * <p>The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the `{startTime}` parameter and the subsequent backup jobs at an interval that is specified in the `{interval}` parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
     * <br>
     * <p>*   **startTime**: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</p>
     * <p>*   **interval**: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: Apsara File Storage NAS file systems</p>
     * <p>*   **OTS**: Tablestore instances</p>
     * <p>*   **UDM_ECS**: ECS instances</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the throttling rules. To ensure business continuity, you can limit the bandwidth that is used for file backup during peak hours. Format: `{start}|{end}|{bandwidth}`. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
     * <br>
     * <p>*   **start**: the start hour</p>
     * <p>*   **end**: the end hour.</p>
     * <p>*   **bandwidth**: the bandwidth. Unit: KB/s.</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>Specifies whether to update the source path if the backup source is empty. Valid values:</p>
     * <br>
     * <p>*   true: The system replaces the original source path with the specified source path.</p>
     * <p>*   false: The system does not update the original source path. The system backs up data based on the source path that you specified when you created the backup plan.</p>
     */
    @NameInMap("UpdatePaths")
    public Boolean updatePaths;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UpdateBackupPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPlanShrinkRequest self = new UpdateBackupPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPlanShrinkRequest setChangeListPath(String changeListPath) {
        this.changeListPath = changeListPath;
        return this;
    }
    public String getChangeListPath() {
        return this.changeListPath;
    }

    public UpdateBackupPlanShrinkRequest setDetailShrink(String detailShrink) {
        this.detailShrink = detailShrink;
        return this;
    }
    public String getDetailShrink() {
        return this.detailShrink;
    }

    public UpdateBackupPlanShrinkRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public UpdateBackupPlanShrinkRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public UpdateBackupPlanShrinkRequest setKeepLatestSnapshots(Long keepLatestSnapshots) {
        this.keepLatestSnapshots = keepLatestSnapshots;
        return this;
    }
    public Long getKeepLatestSnapshots() {
        return this.keepLatestSnapshots;
    }

    public UpdateBackupPlanShrinkRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public UpdateBackupPlanShrinkRequest setOtsDetailShrink(String otsDetailShrink) {
        this.otsDetailShrink = otsDetailShrink;
        return this;
    }
    public String getOtsDetailShrink() {
        return this.otsDetailShrink;
    }

    public UpdateBackupPlanShrinkRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public UpdateBackupPlanShrinkRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateBackupPlanShrinkRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public UpdateBackupPlanShrinkRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public UpdateBackupPlanShrinkRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public UpdateBackupPlanShrinkRequest setRule(java.util.List<UpdateBackupPlanShrinkRequestRule> rule) {
        this.rule = rule;
        return this;
    }
    public java.util.List<UpdateBackupPlanShrinkRequestRule> getRule() {
        return this.rule;
    }

    public UpdateBackupPlanShrinkRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public UpdateBackupPlanShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateBackupPlanShrinkRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public UpdateBackupPlanShrinkRequest setUpdatePaths(Boolean updatePaths) {
        this.updatePaths = updatePaths;
        return this;
    }
    public Boolean getUpdatePaths() {
        return this.updatePaths;
    }

    public UpdateBackupPlanShrinkRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public static class UpdateBackupPlanShrinkRequestRule extends TeaModel {
        /**
         * <p>The backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the region where the remote backup vault resides.</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The retention period of the backup data. Unit: days.</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Specifies whether to disable the policy.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Specifies whether to enable remote replication.</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The name of the backup policy.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The backup policy. Format: I|{startTime}|{interval}. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds. interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        public static UpdateBackupPlanShrinkRequestRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateBackupPlanShrinkRequestRule self = new UpdateBackupPlanShrinkRequestRule();
            return TeaModel.build(map, self);
        }

        public UpdateBackupPlanShrinkRequestRule setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public UpdateBackupPlanShrinkRequestRule setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public UpdateBackupPlanShrinkRequestRule setDestinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        public UpdateBackupPlanShrinkRequestRule setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public UpdateBackupPlanShrinkRequestRule setDoCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        public UpdateBackupPlanShrinkRequestRule setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public UpdateBackupPlanShrinkRequestRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateBackupPlanShrinkRequestRule setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

    }

}
