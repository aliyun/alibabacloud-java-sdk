// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddDRMCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDRMCertificateResponseBody body;

    public static AddDRMCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDRMCertificateResponse self = new AddDRMCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AddDRMCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDRMCertificateResponse setBody(AddDRMCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDRMCertificateResponseBody getBody() {
        return this.body;
    }

}
