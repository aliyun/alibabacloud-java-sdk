// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCertificateResponseBody body;

    public static DeleteCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateResponse self = new DeleteCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCertificateResponse setBody(DeleteCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCertificateResponseBody getBody() {
        return this.body;
    }

}
