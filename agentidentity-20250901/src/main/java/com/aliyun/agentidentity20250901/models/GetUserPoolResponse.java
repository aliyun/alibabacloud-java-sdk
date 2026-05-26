// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserPoolResponseBody body;

    public static GetUserPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolResponse self = new GetUserPoolResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserPoolResponse setBody(GetUserPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPoolResponseBody getBody() {
        return this.body;
    }

}
