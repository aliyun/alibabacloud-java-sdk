// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ClearExternalSAMLIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96D1E5FF-0301-5636-8D33-071E033CFB82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearExternalSAMLIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearExternalSAMLIdentityProviderResponseBody self = new ClearExternalSAMLIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearExternalSAMLIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
