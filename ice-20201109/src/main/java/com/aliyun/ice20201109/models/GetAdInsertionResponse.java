// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAdInsertionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdInsertionResponseBody body;

    public static GetAdInsertionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdInsertionResponse self = new GetAdInsertionResponse();
        return TeaModel.build(map, self);
    }

    public GetAdInsertionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdInsertionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdInsertionResponse setBody(GetAdInsertionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdInsertionResponseBody getBody() {
        return this.body;
    }

}
