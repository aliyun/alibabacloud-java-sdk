// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertificatePrivateKeyResponseBody body;

    public static DescribeCertificatePrivateKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatePrivateKeyResponse self = new DescribeCertificatePrivateKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatePrivateKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificatePrivateKeyResponse setBody(DescribeCertificatePrivateKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificatePrivateKeyResponseBody getBody() {
        return this.body;
    }

}
