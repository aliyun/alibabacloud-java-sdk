// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWebHostingCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebHostingCertificateResponseBody body;

    public static DeleteWebHostingCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebHostingCertificateResponse self = new DeleteWebHostingCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebHostingCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebHostingCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebHostingCertificateResponse setBody(DeleteWebHostingCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebHostingCertificateResponseBody getBody() {
        return this.body;
    }

}
