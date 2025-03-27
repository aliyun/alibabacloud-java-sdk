// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadSiteOriginClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadSiteOriginClientCertificateResponseBody body;

    public static UploadSiteOriginClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSiteOriginClientCertificateResponse self = new UploadSiteOriginClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadSiteOriginClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSiteOriginClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadSiteOriginClientCertificateResponse setBody(UploadSiteOriginClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSiteOriginClientCertificateResponseBody getBody() {
        return this.body;
    }

}
