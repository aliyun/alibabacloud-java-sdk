// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateOAuth2CredentialProviderResponseBody extends TeaModel {
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
