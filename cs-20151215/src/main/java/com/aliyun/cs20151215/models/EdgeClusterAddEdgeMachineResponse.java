// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class EdgeClusterAddEdgeMachineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EdgeClusterAddEdgeMachineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EdgeClusterAddEdgeMachineResponse setBody(EdgeClusterAddEdgeMachineResponseBody body) {
        this.body = body;
        return this;
    }
    public EdgeClusterAddEdgeMachineResponseBody getBody() {
        return this.body;
    }

}
