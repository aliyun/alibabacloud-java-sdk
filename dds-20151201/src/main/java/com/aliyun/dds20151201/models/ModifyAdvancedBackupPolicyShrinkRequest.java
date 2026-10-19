// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The list of backup policies.</p>
     */
    @NameInMap("AdvancedBackupDataPolicies")
    public String advancedBackupDataPoliciesShrink;

    /**
     * <p>The list of log backup policies.</p>
     */
    @NameInMap("AdvancedBackupLogPolicies")
    public String advancedBackupLogPoliciesShrink;

    /**
     * <p>The backup retention policy. Valid values:</p>
     * <ul>
     * <li>0: All backup sets of the instance are deleted immediately when the instance is released.</li>
     * <li>1: The last backup set is retained for long-term retention (LTR) when the instance is released.</li>
     * <li>2: All backup sets are retained for long-term retention (LTR) when the instance is released.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public Integer backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-2zeb2d64cb46xxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The time period during which the backup is performed. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
     * <blockquote>
     * <p>The time range is limited to 1 hour.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>09:00Z-10:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The snapshot backup type. Valid values:</p>
     * <ul>
     * <li><strong>Flash</strong>: backup within seconds.</li>
     * <li><strong>Standard</strong>: standard backup. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("SnapshotBackupType")
    public String snapshotBackupType;

    public static ModifyAdvancedBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupPolicyShrinkRequest self = new ModifyAdvancedBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupPolicyShrinkRequest setAdvancedBackupDataPoliciesShrink(String advancedBackupDataPoliciesShrink) {
        this.advancedBackupDataPoliciesShrink = advancedBackupDataPoliciesShrink;
        return this;
    }
    public String getAdvancedBackupDataPoliciesShrink() {
        return this.advancedBackupDataPoliciesShrink;
    }

    public ModifyAdvancedBackupPolicyShrinkRequest setAdvancedBackupLogPoliciesShrink(String advancedBackupLogPoliciesShrink) {
        this.advancedBackupLogPoliciesShrink = advancedBackupLogPoliciesShrink;
        return this;
    }
    public String getAdvancedBackupLogPoliciesShrink() {
        return this.advancedBackupLogPoliciesShrink;
    }

    public ModifyAdvancedBackupPolicyShrinkRequest setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyAdvancedBackupPolicyShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAdvancedBackupPolicyShrinkRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyAdvancedBackupPolicyShrinkRequest setSnapshotBackupType(String snapshotBackupType) {
        this.snapshotBackupType = snapshotBackupType;
        return this;
    }
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

}
