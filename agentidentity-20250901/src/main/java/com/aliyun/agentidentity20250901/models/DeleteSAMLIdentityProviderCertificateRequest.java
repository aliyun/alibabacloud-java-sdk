// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteSAMLIdentityProviderCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteSAMLIdentityProviderCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSAMLIdentityProviderCertificateRequest self = new DeleteSAMLIdentityProviderCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSAMLIdentityProviderCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public DeleteSAMLIdentityProviderCertificateRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
