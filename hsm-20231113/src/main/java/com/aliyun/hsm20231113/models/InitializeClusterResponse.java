// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class InitializeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeClusterResponseBody body;

    public static InitializeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeClusterResponse self = new InitializeClusterResponse();
        return TeaModel.build(map, self);
    }

    public InitializeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeClusterResponse setBody(InitializeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeClusterResponseBody getBody() {
        return this.body;
    }

}
