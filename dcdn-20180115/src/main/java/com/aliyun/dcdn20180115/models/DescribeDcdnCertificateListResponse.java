// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnCertificateListResponseBody body;

    public static DescribeDcdnCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateListResponse self = new DescribeDcdnCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnCertificateListResponse setBody(DescribeDcdnCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnCertificateListResponseBody getBody() {
        return this.body;
    }

}
