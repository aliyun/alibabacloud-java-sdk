// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCertificatePrivateKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCertificatePrivateKeyResponse setBody(DescribeCertificatePrivateKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificatePrivateKeyResponseBody getBody() {
        return this.body;
    }

}
