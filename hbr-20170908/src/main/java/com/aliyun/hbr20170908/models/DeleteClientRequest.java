// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteClientRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("VaultId")
    public String vaultId;

    public static DeleteClientRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientRequest self = new DeleteClientRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DeleteClientRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteClientRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
