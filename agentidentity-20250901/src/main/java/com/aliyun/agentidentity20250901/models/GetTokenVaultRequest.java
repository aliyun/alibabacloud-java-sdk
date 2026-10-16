// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetTokenVaultRequest extends TeaModel {
    /**
     * <p>The name of the token vault. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static GetTokenVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenVaultRequest self = new GetTokenVaultRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenVaultRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
