// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSMCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnSMCertificateListResponseBody body;

    public static DescribeCdnSMCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSMCertificateListResponse self = new DescribeCdnSMCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSMCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnSMCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnSMCertificateListResponse setBody(DescribeCdnSMCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnSMCertificateListResponseBody getBody() {
        return this.body;
    }

}
