// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AddSAMLIdentityProviderCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddSAMLIdentityProviderCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSAMLIdentityProviderCertificateResponseBody self = new AddSAMLIdentityProviderCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSAMLIdentityProviderCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
