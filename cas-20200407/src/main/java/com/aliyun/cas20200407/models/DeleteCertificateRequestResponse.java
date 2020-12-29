// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCertificateRequestResponseBody body;

    public static DeleteCertificateRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequestResponse self = new DeleteCertificateRequestResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCertificateRequestResponse setBody(DeleteCertificateRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCertificateRequestResponseBody getBody() {
        return this.body;
    }

}
