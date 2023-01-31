// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class RpcNoDefaultErrorCodeApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RpcNoDefaultErrorCodeApiResponseBody body;

    public static RpcNoDefaultErrorCodeApiResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcNoDefaultErrorCodeApiResponse self = new RpcNoDefaultErrorCodeApiResponse();
        return TeaModel.build(map, self);
    }

    public RpcNoDefaultErrorCodeApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcNoDefaultErrorCodeApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RpcNoDefaultErrorCodeApiResponse setBody(RpcNoDefaultErrorCodeApiResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcNoDefaultErrorCodeApiResponseBody getBody() {
        return this.body;
    }

}
