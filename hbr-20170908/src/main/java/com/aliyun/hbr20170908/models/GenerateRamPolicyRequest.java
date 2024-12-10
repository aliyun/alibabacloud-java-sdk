// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GenerateRamPolicyRequest extends TeaModel {
    /**
     * <p>The type of policy that you want to generate. Valid values:</p>
     * <ul>
     * <li>BACKUP: the permission to back up data to a backup vault</li>
     * <li>RESTORE: the permission to restore data from a backup vault</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>Specifies whether to generate the policy based on an existing instance-specific rule. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequireBasePolicy")
    public Boolean requireBasePolicy;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-*********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0007al3m******7ao</p>
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
