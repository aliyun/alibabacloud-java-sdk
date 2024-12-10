// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-*********************</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>Specifies whether no running jobs are required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequireNoRunningJobs")
    public Boolean requireNoRunningJobs;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
     * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
     * <li><strong>NAS</strong>: Apsara File Storage NAS file systems</li>
     * <li><strong>UDM_ECS</strong>: ECS instances</li>
     * <li><strong>OTS</strong>: Tablestore instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the backup vault. This parameter is required if the SourceType parameter is not set to UDM_ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DeleteBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPlanRequest self = new DeleteBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public DeleteBackupPlanRequest setRequireNoRunningJobs(Boolean requireNoRunningJobs) {
        this.requireNoRunningJobs = requireNoRunningJobs;
        return this;
    }
    public Boolean getRequireNoRunningJobs() {
        return this.requireNoRunningJobs;
    }

    public DeleteBackupPlanRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DeleteBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
