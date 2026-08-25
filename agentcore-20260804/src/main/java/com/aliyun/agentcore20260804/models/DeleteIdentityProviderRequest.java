// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderRequest extends TeaModel {
    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderRequest self = new DeleteIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
