// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHCertificateWithExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWHCertificateWithExtensionResponseBody body;

    public static CreateWHCertificateWithExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWHCertificateWithExtensionResponse self = new CreateWHCertificateWithExtensionResponse();
        return TeaModel.build(map, self);
    }

    public CreateWHCertificateWithExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWHCertificateWithExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWHCertificateWithExtensionResponse setBody(CreateWHCertificateWithExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWHCertificateWithExtensionResponseBody getBody() {
        return this.body;
    }

}
