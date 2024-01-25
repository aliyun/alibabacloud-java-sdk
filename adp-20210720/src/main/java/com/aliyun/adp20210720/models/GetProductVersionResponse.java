// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductVersionResponseBody body;

    public static GetProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResponse self = new GetProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductVersionResponse setBody(GetProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionResponseBody getBody() {
        return this.body;
    }

}
