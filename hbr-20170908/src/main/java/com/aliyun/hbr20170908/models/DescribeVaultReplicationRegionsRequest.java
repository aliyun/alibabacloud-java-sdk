// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultReplicationRegionsRequest extends TeaModel {
    /**
     * <p>The access token.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    @Deprecated
    public String vaultId;

    public static DescribeVaultReplicationRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVaultReplicationRegionsRequest self = new DescribeVaultReplicationRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVaultReplicationRegionsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DescribeVaultReplicationRegionsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
