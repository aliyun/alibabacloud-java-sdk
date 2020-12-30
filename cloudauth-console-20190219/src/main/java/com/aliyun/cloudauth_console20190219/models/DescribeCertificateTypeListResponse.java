// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeCertificateTypeListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertificateTypeListResponseBody body;

    public static DescribeCertificateTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateTypeListResponse self = new DescribeCertificateTypeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateTypeListResponse setBody(DescribeCertificateTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateTypeListResponseBody getBody() {
        return this.body;
    }

}
