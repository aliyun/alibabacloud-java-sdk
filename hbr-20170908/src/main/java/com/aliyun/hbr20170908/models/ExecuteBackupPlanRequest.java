// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecuteBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the backup rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: Apsara File Storage NAS file systems</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static ExecuteBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBackupPlanRequest self = new ExecuteBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteBackupPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ExecuteBackupPlanRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ExecuteBackupPlanRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ExecuteBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
