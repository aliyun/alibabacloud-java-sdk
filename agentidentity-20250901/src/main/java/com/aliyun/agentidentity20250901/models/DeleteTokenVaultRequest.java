// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteTokenVaultRequest extends TeaModel {
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static DeleteTokenVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTokenVaultRequest self = new DeleteTokenVaultRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTokenVaultRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
