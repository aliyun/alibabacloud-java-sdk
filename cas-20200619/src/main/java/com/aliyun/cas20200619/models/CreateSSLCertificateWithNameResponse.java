// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class CreateSSLCertificateWithNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSSLCertificateWithNameResponseBody body;

    public static CreateSSLCertificateWithNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSSLCertificateWithNameResponse self = new CreateSSLCertificateWithNameResponse();
        return TeaModel.build(map, self);
    }

    public CreateSSLCertificateWithNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSSLCertificateWithNameResponse setBody(CreateSSLCertificateWithNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSSLCertificateWithNameResponseBody getBody() {
        return this.body;
    }

}
