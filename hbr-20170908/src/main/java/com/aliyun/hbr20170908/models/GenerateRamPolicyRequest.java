// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GenerateRamPolicyRequest extends TeaModel {
    /**
     * <p>The type of the policy that you want to generate. Valid values:</p>
     * <br>
     * <p>*   custom: custom policy</p>
     * <p>*   system: system policy</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>Specifies whether to generate the policy based on an existing instance-specific rule. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("RequireBasePolicy")
    public Boolean requireBasePolicy;

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

    public static GenerateRamPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateRamPolicyRequest self = new GenerateRamPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateRamPolicyRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public GenerateRamPolicyRequest setRequireBasePolicy(Boolean requireBasePolicy) {
        this.requireBasePolicy = requireBasePolicy;
        return this;
    }
    public Boolean getRequireBasePolicy() {
        return this.requireBasePolicy;
    }

    public GenerateRamPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GenerateRamPolicyRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
