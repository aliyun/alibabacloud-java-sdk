// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateVaultRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("VaultId")
    public String vaultId;

    @NameInMap("VaultName")
    public String vaultName;

    public static UpdateVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVaultRequest self = new UpdateVaultRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVaultRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateVaultRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public UpdateVaultRequest setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }
    public String getVaultName() {
        return this.vaultName;
    }

}
