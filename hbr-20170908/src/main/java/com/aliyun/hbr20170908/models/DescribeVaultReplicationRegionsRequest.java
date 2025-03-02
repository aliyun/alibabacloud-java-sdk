// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultReplicationRegionsRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>01W3ZZOQ</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>v-00030j3c******sn</p>
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

    @Deprecated
    public DescribeVaultReplicationRegionsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
