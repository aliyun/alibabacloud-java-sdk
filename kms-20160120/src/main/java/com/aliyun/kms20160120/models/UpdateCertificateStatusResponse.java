// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateCertificateStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCertificateStatusResponseBody body;

    public static UpdateCertificateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCertificateStatusResponse self = new UpdateCertificateStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCertificateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCertificateStatusResponse setBody(UpdateCertificateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCertificateStatusResponseBody getBody() {
        return this.body;
    }

}
