// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSSLCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSSLCertificateListResponseBody body;

    public static DescribeDcdnSSLCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSSLCertificateListResponse self = new DescribeDcdnSSLCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSSLCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSSLCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSSLCertificateListResponse setBody(DescribeDcdnSSLCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSSLCertificateListResponseBody getBody() {
        return this.body;
    }

}
