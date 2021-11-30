// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCertificateWithExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCertificateWithExtensionResponseBody body;

    public static CreateCertificateWithExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithExtensionResponse self = new CreateCertificateWithExtensionResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateWithExtensionResponse setBody(CreateCertificateWithExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateWithExtensionResponseBody getBody() {
        return this.body;
    }

}
