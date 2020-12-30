// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertificateInfoByIDResponseBody body;

    public static DescribeCertificateInfoByIDResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateInfoByIDResponse self = new DescribeCertificateInfoByIDResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateInfoByIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateInfoByIDResponse setBody(DescribeCertificateInfoByIDResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateInfoByIDResponseBody getBody() {
        return this.body;
    }

}
