// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessTokenResponseBody body;

    public static GetAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessTokenResponse self = new GetAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessTokenResponse setBody(GetAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessTokenResponseBody getBody() {
        return this.body;
    }

}
