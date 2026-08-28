// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ShareCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShareCertificateResponseBody body;

    public static ShareCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ShareCertificateResponse self = new ShareCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ShareCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShareCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShareCertificateResponse setBody(ShareCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ShareCertificateResponseBody getBody() {
        return this.body;
    }

}
