// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserPoolClientResponseBody body;

    public static GetUserPoolClientResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolClientResponse self = new GetUserPoolClientResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPoolClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPoolClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserPoolClientResponse setBody(GetUserPoolClientResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPoolClientResponseBody getBody() {
        return this.body;
    }

}
