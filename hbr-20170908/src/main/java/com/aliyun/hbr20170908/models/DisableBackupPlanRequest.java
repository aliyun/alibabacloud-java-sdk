// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DisableBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: The system backs up data from Elastic Compute Service (ECS) instances.</p>
     * <p>*   **OSS**: The system backs up data from Object Storage Service (OSS) buckets.</p>
     * <p>*   **NAS**: The system backs up data from Apsara File Storage NAS file systems.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DisableBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableBackupPlanRequest self = new DisableBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public DisableBackupPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public DisableBackupPlanRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DisableBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
