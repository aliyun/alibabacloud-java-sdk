// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCACertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCACertificateListResponse setBody(DescribeCACertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificateListResponseBody getBody() {
        return this.body;
    }

}
