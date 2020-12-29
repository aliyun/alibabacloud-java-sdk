// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DeleteUserCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserCertificateResponseBody body;

    public static DeleteUserCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserCertificateResponse self = new DeleteUserCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserCertificateResponse setBody(DeleteUserCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserCertificateResponseBody getBody() {
        return this.body;
    }

}
