// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWebHostingCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteWebHostingCertificateResponse setBody(DeleteWebHostingCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebHostingCertificateResponseBody getBody() {
        return this.body;
    }

}
