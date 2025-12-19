// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EE854F60-E275-534A-B102-F75346B6DA38</p>
     */
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
