// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenForJWTResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkloadAccessTokenForJWTResponseBody body;

    public static GetWorkloadAccessTokenForJWTResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenForJWTResponse self = new GetWorkloadAccessTokenForJWTResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenForJWTResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkloadAccessTokenForJWTResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkloadAccessTokenForJWTResponse setBody(GetWorkloadAccessTokenForJWTResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkloadAccessTokenForJWTResponseBody getBody() {
        return this.body;
    }

}
