// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginCaCertificateResponseBody body;

    public static GetOriginCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginCaCertificateResponse self = new GetOriginCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginCaCertificateResponse setBody(GetOriginCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginCaCertificateResponseBody getBody() {
        return this.body;
    }

}
