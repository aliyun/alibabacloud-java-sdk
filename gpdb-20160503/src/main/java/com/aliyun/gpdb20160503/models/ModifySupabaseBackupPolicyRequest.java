// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseBackupPolicyRequest extends TeaModel {
    /**
     * <p>The data backup retention period. Unit: days. Valid values: 1 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>Specifies whether to enable automatic recovery points. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.
     * If this parameter is not specified, false is used.</li>
     * </ul>
     */
    @NameInMap("EnableRecoveryPoint")
    public Boolean enableRecoveryPoint;

    /**
     * <p>The data backup cycle. Separate multiple values with commas (,). Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Wednesday,Friday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The start time of the data backup. The time is in UTC and follows the HH:mmZ format, such as 01:00Z. The HH:mmZ-HH:mmZ time range format is also supported, and the server uses the start time of the range.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>Instance ID of the Supabase instance. You can obtain instance ID on the Supabase page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-263****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The interval for the automatic creation of recovery points. Unit: hours. Valid values: 1/6 (10 minutes), 1/2 (30 minutes), 1, 2, 4, and 8. This parameter takes effect only when EnableRecoveryPoint is set to true. If this parameter is not specified, the default value 1 is used. If EnableRecoveryPoint is set to false, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecoveryPointPeriod")
    public String recoveryPointPeriod;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifySupabaseBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseBackupPolicyRequest self = new ModifySupabaseBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseBackupPolicyRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifySupabaseBackupPolicyRequest setEnableRecoveryPoint(Boolean enableRecoveryPoint) {
        this.enableRecoveryPoint = enableRecoveryPoint;
        return this;
    }
    public Boolean getEnableRecoveryPoint() {
        return this.enableRecoveryPoint;
    }

    public ModifySupabaseBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifySupabaseBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifySupabaseBackupPolicyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifySupabaseBackupPolicyRequest setRecoveryPointPeriod(String recoveryPointPeriod) {
        this.recoveryPointPeriod = recoveryPointPeriod;
        return this;
    }
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

    public ModifySupabaseBackupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
