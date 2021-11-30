// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCACertificateStatusResponseBody body;

    public static UpdateCACertificateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCACertificateStatusResponse self = new UpdateCACertificateStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCACertificateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCACertificateStatusResponse setBody(UpdateCACertificateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCACertificateStatusResponseBody getBody() {
        return this.body;
    }

}
