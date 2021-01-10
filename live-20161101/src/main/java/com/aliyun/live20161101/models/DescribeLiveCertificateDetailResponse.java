// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveCertificateDetailResponseBody body;

    public static DescribeLiveCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateDetailResponse self = new DescribeLiveCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveCertificateDetailResponse setBody(DescribeLiveCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
