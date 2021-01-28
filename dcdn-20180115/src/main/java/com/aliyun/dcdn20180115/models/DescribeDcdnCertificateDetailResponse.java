// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnCertificateDetailResponseBody body;

    public static DescribeDcdnCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateDetailResponse self = new DescribeDcdnCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnCertificateDetailResponse setBody(DescribeDcdnCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
