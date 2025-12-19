// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class TokenReqeust extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    public static TokenReqeust build(java.util.Map<String, ?> map) throws Exception {
        TokenReqeust self = new TokenReqeust();
        return TeaModel.build(map, self);
    }

    public TokenReqeust setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
