// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCACertificateCountResponseBody body;

    public static DescribeCACertificateCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateCountResponse self = new DescribeCACertificateCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCACertificateCountResponse setBody(DescribeCACertificateCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificateCountResponseBody getBody() {
        return this.body;
    }

}
