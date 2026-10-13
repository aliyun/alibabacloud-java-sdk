// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetProductRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductRefResponseBody body;

    public static GetProductRefResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductRefResponse self = new GetProductRefResponse();
        return TeaModel.build(map, self);
    }

    public GetProductRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductRefResponse setBody(GetProductRefResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductRefResponseBody getBody() {
        return this.body;
    }

}
