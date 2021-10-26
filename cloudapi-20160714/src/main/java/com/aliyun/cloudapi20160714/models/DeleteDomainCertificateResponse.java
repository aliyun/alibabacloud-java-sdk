// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainCertificateResponseBody body;

    public static DeleteDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainCertificateResponse self = new DeleteDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainCertificateResponse setBody(DeleteDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
