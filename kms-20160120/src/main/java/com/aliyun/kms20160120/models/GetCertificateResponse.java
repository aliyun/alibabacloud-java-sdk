// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCertificateResponseBody body;

    public static GetCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateResponse self = new GetCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertificateResponse setBody(GetCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertificateResponseBody getBody() {
        return this.body;
    }

}
