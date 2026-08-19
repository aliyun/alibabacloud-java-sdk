// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecuteBackupPlanRequest extends TeaModel {
    /**
     * <p>The edition. Valid values: BASIC and STANDARD. Default value: STANDARD.</p>
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
     * <p>The ID of the backup rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-0002*****ux8</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p><strong>ECS_FILE</strong>: Backs up ECS files.</p>
     * </li>
     * <li><p><strong>OSS</strong>: Backs up Alibaba Cloud OSS.</p>
     * </li>
     * <li><p><strong>NAS</strong>: Backs up Alibaba Cloud NAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static ExecuteBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBackupPlanRequest self = new ExecuteBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteBackupPlanRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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
