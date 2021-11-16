// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class EdgeClusterAddEdgeMachineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EdgeClusterAddEdgeMachineResponseBody body;

    public static EdgeClusterAddEdgeMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        EdgeClusterAddEdgeMachineResponse self = new EdgeClusterAddEdgeMachineResponse();
        return TeaModel.build(map, self);
    }

    public EdgeClusterAddEdgeMachineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EdgeClusterAddEdgeMachineResponse setBody(EdgeClusterAddEdgeMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public EdgeClusterAddEdgeMachineResponseBody getBody() {
        return this.body;
    }

}
