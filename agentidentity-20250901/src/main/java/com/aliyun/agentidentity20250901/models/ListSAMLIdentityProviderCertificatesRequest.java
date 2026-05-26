// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListSAMLIdentityProviderCertificatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static ListSAMLIdentityProviderCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLIdentityProviderCertificatesRequest self = new ListSAMLIdentityProviderCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListSAMLIdentityProviderCertificatesRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
