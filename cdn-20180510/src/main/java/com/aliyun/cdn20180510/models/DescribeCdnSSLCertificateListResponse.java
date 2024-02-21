// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSSLCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnSSLCertificateListResponseBody body;

    public static DescribeCdnSSLCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSSLCertificateListResponse self = new DescribeCdnSSLCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSSLCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnSSLCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnSSLCertificateListResponse setBody(DescribeCdnSSLCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnSSLCertificateListResponseBody getBody() {
        return this.body;
    }

}
