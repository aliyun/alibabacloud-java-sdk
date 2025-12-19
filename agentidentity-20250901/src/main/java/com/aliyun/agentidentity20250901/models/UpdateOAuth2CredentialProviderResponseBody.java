// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateOAuth2CredentialProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D9A9DC39-61BB-53FD-9ADC-B14884F21038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOAuth2CredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOAuth2CredentialProviderResponseBody self = new UpdateOAuth2CredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOAuth2CredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
