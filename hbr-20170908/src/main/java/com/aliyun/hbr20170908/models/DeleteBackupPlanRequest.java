// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    @NameInMap("RequireNoRunningJobs")
    public Boolean requireNoRunningJobs;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: Apsara File Storage NAS file systems</p>
     * <p>*   **UDM_ECS**: ECS instances</p>
     * <p>*   **OTS**: Tablestore instances</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the backup vault.</p>
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
