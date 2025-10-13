// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetRootCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRootCertificateResponseBody body;

    public static GetRootCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRootCertificateResponse self = new GetRootCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetRootCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRootCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRootCertificateResponse setBody(GetRootCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRootCertificateResponseBody getBody() {
        return this.body;
    }

}
