// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteOriginClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteOriginClientCertificateResponseBody body;

    public static GetSiteOriginClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteOriginClientCertificateResponse self = new GetSiteOriginClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteOriginClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteOriginClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteOriginClientCertificateResponse setBody(GetSiteOriginClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteOriginClientCertificateResponseBody getBody() {
        return this.body;
    }

}
