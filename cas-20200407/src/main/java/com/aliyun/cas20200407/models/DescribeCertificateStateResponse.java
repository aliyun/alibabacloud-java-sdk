// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertificateStateResponseBody body;

    public static DescribeCertificateStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateResponse self = new DescribeCertificateStateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateStateResponse setBody(DescribeCertificateStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateStateResponseBody getBody() {
        return this.body;
    }

}
