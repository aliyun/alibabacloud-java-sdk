// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UninstallClientRequest extends TeaModel {
    /**
     * <p>The ID of the HBR client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-000iuqo******zi3rn</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3erpwweavki</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0008n2q******ax3</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UninstallClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallClientRequest self = new UninstallClientRequest();
        return TeaModel.build(map, self);
    }

    public UninstallClientRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UninstallClientRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UninstallClientRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
