// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderResponseBody self = new DeleteIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
