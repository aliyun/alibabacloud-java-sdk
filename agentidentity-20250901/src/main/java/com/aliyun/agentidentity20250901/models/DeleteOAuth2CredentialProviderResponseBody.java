// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteOAuth2CredentialProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>679B5D1D-F2A2-5D8F-BB56-B62C28CDA9D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOAuth2CredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOAuth2CredentialProviderResponseBody self = new DeleteOAuth2CredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOAuth2CredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
