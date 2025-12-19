// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AuthorizationRequest extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    public static AuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationRequest self = new AuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizationRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
