// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class EnableHanaBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the backup plan.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static EnableHanaBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHanaBackupPlanRequest self = new EnableHanaBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public EnableHanaBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public EnableHanaBackupPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public EnableHanaBackupPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public EnableHanaBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
