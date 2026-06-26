// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AddSAMLIdentityProviderCertificateRequest extends TeaModel {
    @NameInMap("UserPoolName")
    public String userPoolName;

    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static AddSAMLIdentityProviderCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSAMLIdentityProviderCertificateRequest self = new AddSAMLIdentityProviderCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AddSAMLIdentityProviderCertificateRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public AddSAMLIdentityProviderCertificateRequest setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
