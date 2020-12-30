// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnCertificateListResponseBody body;

    public static DescribeCdnCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateListResponse self = new DescribeCdnCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnCertificateListResponse setBody(DescribeCdnCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnCertificateListResponseBody getBody() {
        return this.body;
    }

}
