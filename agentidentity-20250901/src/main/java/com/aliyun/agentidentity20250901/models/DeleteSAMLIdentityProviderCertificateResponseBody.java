// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteSAMLIdentityProviderCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSAMLIdentityProviderCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSAMLIdentityProviderCertificateResponseBody self = new DeleteSAMLIdentityProviderCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSAMLIdentityProviderCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
