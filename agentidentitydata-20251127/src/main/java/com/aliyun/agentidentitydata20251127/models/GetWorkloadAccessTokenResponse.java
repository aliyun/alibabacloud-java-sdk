// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetWorkloadAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkloadAccessTokenResponseBody body;

    public static GetWorkloadAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadAccessTokenResponse self = new GetWorkloadAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkloadAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkloadAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkloadAccessTokenResponse setBody(GetWorkloadAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkloadAccessTokenResponseBody getBody() {
        return this.body;
    }

}
