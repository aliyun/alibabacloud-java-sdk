// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginClientCertificateResponseBody body;

    public static GetOriginClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginClientCertificateResponse self = new GetOriginClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginClientCertificateResponse setBody(GetOriginClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginClientCertificateResponseBody getBody() {
        return this.body;
    }

}
