// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachWebHostingCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachWebHostingCertificateResponseBody body;

    public static AttachWebHostingCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachWebHostingCertificateResponse self = new AttachWebHostingCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AttachWebHostingCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachWebHostingCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachWebHostingCertificateResponse setBody(AttachWebHostingCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachWebHostingCertificateResponseBody getBody() {
        return this.body;
    }

}
