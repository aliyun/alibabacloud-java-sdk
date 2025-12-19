// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateAPIKeyCredentialProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A0FD8DC1-2E36-50F4-97D4-6494F96F7FB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAPIKeyCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAPIKeyCredentialProviderResponseBody self = new UpdateAPIKeyCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAPIKeyCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
