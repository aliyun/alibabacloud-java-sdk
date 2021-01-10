// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveCertificateListResponseBody body;

    public static DescribeLiveCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListResponse self = new DescribeLiveCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveCertificateListResponse setBody(DescribeLiveCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveCertificateListResponseBody getBody() {
        return this.body;
    }

}
