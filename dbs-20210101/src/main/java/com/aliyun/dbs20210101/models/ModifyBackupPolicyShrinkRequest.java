// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The details of data backup policies.</p>
     */
    @NameInMap("AdvanceDataPolicies")
    public String advanceDataPoliciesShrink;

    @NameInMap("AdvanceIncPolicies")
    public String advanceIncPoliciesShrink;

    @NameInMap("AdvanceLogPolicies")
    public String advanceLogPoliciesShrink;

    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupPriority")
    public Integer backupPriority;

    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    @NameInMap("Category")
    public String category;

    @NameInMap("EnableIncBackup")
    public Boolean enableIncBackup;

    /**
     * <p>The ID of the PolarDB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze3nrr64c5****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The start time of a basic backup.</p>
     * 
     * <strong>example:</strong>
     * <p>17:00Z</p>
     */
    @NameInMap("PreferredBackupWindowBegin")
    public String preferredBackupWindowBegin;

    /**
     * <p>The region in which backup sets reside.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    public static ModifyBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyShrinkRequest self = new ModifyBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyShrinkRequest setAdvanceDataPoliciesShrink(String advanceDataPoliciesShrink) {
        this.advanceDataPoliciesShrink = advanceDataPoliciesShrink;
        return this;
    }
    public String getAdvanceDataPoliciesShrink() {
        return this.advanceDataPoliciesShrink;
    }

    public ModifyBackupPolicyShrinkRequest setAdvanceIncPoliciesShrink(String advanceIncPoliciesShrink) {
        this.advanceIncPoliciesShrink = advanceIncPoliciesShrink;
        return this;
    }
    public String getAdvanceIncPoliciesShrink() {
        return this.advanceIncPoliciesShrink;
    }

    public ModifyBackupPolicyShrinkRequest setAdvanceLogPoliciesShrink(String advanceLogPoliciesShrink) {
        this.advanceLogPoliciesShrink = advanceLogPoliciesShrink;
        return this;
    }
    public String getAdvanceLogPoliciesShrink() {
        return this.advanceLogPoliciesShrink;
    }

    public ModifyBackupPolicyShrinkRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public ModifyBackupPolicyShrinkRequest setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
        return this;
    }
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    public ModifyBackupPolicyShrinkRequest setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyBackupPolicyShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyBackupPolicyShrinkRequest setEnableIncBackup(Boolean enableIncBackup) {
        this.enableIncBackup = enableIncBackup;
        return this;
    }
    public Boolean getEnableIncBackup() {
        return this.enableIncBackup;
    }

    public ModifyBackupPolicyShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyBackupPolicyShrinkRequest setPreferredBackupWindowBegin(String preferredBackupWindowBegin) {
        this.preferredBackupWindowBegin = preferredBackupWindowBegin;
        return this;
    }
    public String getPreferredBackupWindowBegin() {
        return this.preferredBackupWindowBegin;
    }

    public ModifyBackupPolicyShrinkRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
