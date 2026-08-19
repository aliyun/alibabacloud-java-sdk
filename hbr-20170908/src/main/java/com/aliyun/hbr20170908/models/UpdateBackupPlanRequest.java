// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateBackupPlanRequest extends TeaModel {
    /**
     * <p>The configuration for the incremental file synchronization list. (This parameter is required only for file synchronization.)</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataSourceId&quot;: &quot;ds-123456789&quot;, &quot;path&quot;: &quot;/changelist&quot;}</p>
     */
    @NameInMap("ChangeListPath")
    public String changeListPath;

    /**
     * <p>The details of the ECS instance backup. This is a JSON string.</p>
     * <ul>
     * <li><p>snapshotGroup: Specifies whether to use a snapshot-consistent group. This feature is available only when all disks of the instance are Enhanced Solid-State Drives (ESSDs).</p>
     * </li>
     * <li><p>appConsistent: Specifies whether to enable application consistency. You must also configure the preScriptPath and postScriptPath parameters.</p>
     * </li>
     * <li><p>preScriptPath: The path to the pre-freeze script.</p>
     * </li>
     * <li><p>postScriptPath: The path to the post-thaw script.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EnableFsFreeze\&quot;:true,\&quot;appConsistent\&quot;:false,\&quot;postScriptPath\&quot;:\&quot;\&quot;,\&quot;preScriptPath\&quot;:\&quot;\&quot;,\&quot;snapshotGroup\&quot;:true,\&quot;timeoutInSeconds\&quot;:60}</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>The edition. Valid values are BASIC and STANDARD. The default value is STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files to exclude from the backup. All files in the specified paths are not backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files to back up. All files in the specified paths are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>Specifies whether to permanently retain the latest backup version.</p>
     * <ul>
     * <li><p>0: No</p>
     * </li>
     * <li><p>1: Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KeepLatestSnapshots")
    public Long keepLatestSnapshots;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies whether to use Volume Shadow Copy Service (VSS) to define the backup path.</p>
     * <ul>
     * <li><p>This feature is available only for Windows ECS instances.</p>
     * </li>
     * <li><p>If data changes occur in the backup source, set this parameter to <code>[&quot;UseVSS&quot;:true]</code> to ensure data consistency.</p>
     * </li>
     * <li><p>If you enable VSS, you cannot back up multiple file directories at the same time.</p>
     * </li>
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
     * <p>The backup paths.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-20211***735</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The name of the backup plan.</p>
     * 
     * <strong>example:</strong>
     * <p>planname</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. This parameter specifies the prefix of objects to back up. After you specify a prefix, only objects that match the prefix are backed up.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-prefix</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The number of days to retain backups. The minimum value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The rules of the backup plan.</p>
     */
    @NameInMap("Rule")
    public java.util.List<UpdateBackupPlanRequestRule> rule;

    /**
     * <p>The backup policy. Use the <code>I|{startTime}|{interval}</code> format. This specifies that a backup job runs at a recurring interval. The <code>{startTime}</code> is when the backup starts. The <code>{interval}</code> is the time between jobs. HBR does not run overdue backup jobs. If the previous backup job is not finished, the next one does not start. For example, <code>I|1631685600|P1D</code> means the backup runs once a day, starting at 14:00:00 on September 15, 2021.</p>
     * <ul>
     * <li><p><strong>startTime</strong>: The start time of the backup. This is a UNIX timestamp in seconds.</p>
     * </li>
     * <li><p><strong>interval</strong>: The time interval. Use the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
     * </li>
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
     * <li><p><strong>ECS_FILE</strong>: Backs up ECS files.</p>
     * </li>
     * <li><p><strong>OSS</strong>: Backs up Alibaba Cloud OSS.</p>
     * </li>
     * <li><p><strong>NAS</strong>: Backs up Alibaba Cloud NAS.</p>
     * </li>
     * <li><p><strong>OTS</strong>: Backs up Alibaba Cloud Tablestore.</p>
     * </li>
     * <li><p><strong>UDM_ECS</strong>: Backs up an entire ECS instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies traffic shaping for backups. Traffic shaping helps you control backup traffic during peak business hours to avoid affecting your services. The format is <code>{start}|{end}|{bandwidth}</code>. You can specify multiple traffic shaping rules. Separate them with vertical bars (|). The time ranges of the rules cannot overlap.</p>
     * <ul>
     * <li><p><strong>start</strong>: The start hour.</p>
     * </li>
     * <li><p><strong>end</strong>: The end hour.</p>
     * </li>
     * <li><p><strong>bandwidth</strong>: The maximum speed. Unit: KB/s.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    /**
     * <p>Specifies whether to update the backup paths if the Path parameter is empty.</p>
     * <ul>
     * <li><p>true: Updates the backup paths based on the paths specified in this call.</p>
     * </li>
     * <li><p>false: Does not update the backup paths. The backup paths that were configured when the backup plan was created are used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpdatePaths")
    public Boolean updatePaths;

    /**
     * <p>The ID of the backup repository.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0006******q</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UpdateBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPlanRequest self = new UpdateBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPlanRequest setChangeListPath(String changeListPath) {
        this.changeListPath = changeListPath;
        return this;
    }
    public String getChangeListPath() {
        return this.changeListPath;
    }

    public UpdateBackupPlanRequest setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public UpdateBackupPlanRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public UpdateBackupPlanRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public UpdateBackupPlanRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public UpdateBackupPlanRequest setKeepLatestSnapshots(Long keepLatestSnapshots) {
        this.keepLatestSnapshots = keepLatestSnapshots;
        return this;
    }
    public Long getKeepLatestSnapshots() {
        return this.keepLatestSnapshots;
    }

    public UpdateBackupPlanRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public UpdateBackupPlanRequest setOtsDetail(OtsDetail otsDetail) {
        this.otsDetail = otsDetail;
        return this;
    }
    public OtsDetail getOtsDetail() {
        return this.otsDetail;
    }

    public UpdateBackupPlanRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public UpdateBackupPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateBackupPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public UpdateBackupPlanRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public UpdateBackupPlanRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public UpdateBackupPlanRequest setRule(java.util.List<UpdateBackupPlanRequestRule> rule) {
        this.rule = rule;
        return this;
    }
    public java.util.List<UpdateBackupPlanRequestRule> getRule() {
        return this.rule;
    }

    public UpdateBackupPlanRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public UpdateBackupPlanRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateBackupPlanRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public UpdateBackupPlanRequest setUpdatePaths(Boolean updatePaths) {
        this.updatePaths = updatePaths;
        return this;
    }
    public Boolean getUpdatePaths() {
        return this.updatePaths;
    }

    public UpdateBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public static class UpdateBackupPlanRequestRule extends TeaModel {
        /**
         * <p>The backup type. Set the value to <strong>COMPLETE</strong>. This indicates a full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the destination region for the geo-redundant backup.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The number of days to retain the geo-redundant backup.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Specifies whether to disable the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Specifies whether to enable geo-redundant replication.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>The number of days to retain backups. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-test-name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The backup policy. Use the I|{startTime}|{interval} format. This specifies that a backup job runs at a recurring interval. The {startTime} is when the backup starts. The {interval} is the time between jobs. HBR does not run overdue backup jobs. If the previous backup job is not finished, the next one does not start. For example, I|1631685600|P1D means the backup runs once a day, starting at 14:00:00 on September 15, 2021.</p>
         * <p>startTime: The start time of the backup. This is a UNIX timestamp in seconds. interval: The time interval. Use the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
         * 
         * <strong>example:</strong>
         * <p>I|1631685600|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        public static UpdateBackupPlanRequestRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateBackupPlanRequestRule self = new UpdateBackupPlanRequestRule();
            return TeaModel.build(map, self);
        }

        public UpdateBackupPlanRequestRule setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public UpdateBackupPlanRequestRule setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public UpdateBackupPlanRequestRule setDestinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        public UpdateBackupPlanRequestRule setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public UpdateBackupPlanRequestRule setDoCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        public UpdateBackupPlanRequestRule setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public UpdateBackupPlanRequestRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateBackupPlanRequestRule setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

    }

}
