// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLIdentityProviderRequest extends TeaModel {
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetSAMLIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLIdentityProviderRequest self = new GetSAMLIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetSAMLIdentityProviderRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
