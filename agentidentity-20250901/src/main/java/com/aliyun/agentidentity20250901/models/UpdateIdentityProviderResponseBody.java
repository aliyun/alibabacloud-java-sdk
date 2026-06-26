// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderResponseBody self = new UpdateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
