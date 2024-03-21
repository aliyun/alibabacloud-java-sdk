// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSMCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSMCertificateListResponseBody body;

    public static DescribeDcdnSMCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSMCertificateListResponse self = new DescribeDcdnSMCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSMCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSMCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSMCertificateListResponse setBody(DescribeDcdnSMCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSMCertificateListResponseBody getBody() {
        return this.body;
    }

}
