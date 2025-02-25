// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetErrorResponseBody body;

    public static GetErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErrorResponse self = new GetErrorResponse();
        return TeaModel.build(map, self);
    }

    public GetErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErrorResponse setBody(GetErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErrorResponseBody getBody() {
        return this.body;
    }

}
