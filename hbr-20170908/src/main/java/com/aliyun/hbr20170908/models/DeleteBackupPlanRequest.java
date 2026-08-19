// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanRequest extends TeaModel {
    /**
     * <p>The edition type. Valid values are BASIC and STANDARD. The default value is STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

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
     * <p>Specifies whether to prevent the deletion of the backup plan if backup jobs are running.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequireNoRunningJobs")
    public Boolean requireNoRunningJobs;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p><strong>ECS_FILE</strong>: Backs up Elastic Compute Service (ECS) files.</p>
     * </li>
     * <li><p><strong>OSS</strong>: Backs up Object Storage Service (OSS) buckets.</p>
     * </li>
     * <li><p><strong>NAS</strong>: Backs up Network Attached Storage (NAS) file systems.</p>
     * </li>
     * <li><p><strong>UDM_ECS</strong>: Backs up entire ECS instances.</p>
     * </li>
     * <li><p><strong>OTS</strong>: Backs up Tablestore instances.</p>
     * </li>
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

    public DeleteBackupPlanRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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
