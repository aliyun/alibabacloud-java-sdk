// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteOAuth2CredentialProviderResponseBody extends TeaModel {
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
