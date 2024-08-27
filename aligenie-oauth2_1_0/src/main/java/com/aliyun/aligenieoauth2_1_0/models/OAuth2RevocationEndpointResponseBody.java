// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class OAuth2RevocationEndpointResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4070039E-5822-1F32-9295-1D2883E48BA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OAuth2RevocationEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OAuth2RevocationEndpointResponseBody self = new OAuth2RevocationEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public OAuth2RevocationEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
