// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCACertificateListResponseBody body;

    public static DescribeCACertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateListResponse self = new DescribeCACertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCACertificateListResponse setBody(DescribeCACertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificateListResponseBody getBody() {
        return this.body;
    }

}
