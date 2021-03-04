// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertificateResponseBody body;

    public static DescribeCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateResponse self = new DescribeCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateResponse setBody(DescribeCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateResponseBody getBody() {
        return this.body;
    }

}
