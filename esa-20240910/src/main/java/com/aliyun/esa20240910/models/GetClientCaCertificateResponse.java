// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetClientCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientCaCertificateResponseBody body;

    public static GetClientCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientCaCertificateResponse self = new GetClientCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetClientCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientCaCertificateResponse setBody(GetClientCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientCaCertificateResponseBody getBody() {
        return this.body;
    }

}
