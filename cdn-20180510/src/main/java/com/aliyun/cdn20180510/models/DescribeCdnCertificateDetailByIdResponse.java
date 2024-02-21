// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnCertificateDetailByIdResponseBody body;

    public static DescribeCdnCertificateDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailByIdResponse self = new DescribeCdnCertificateDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnCertificateDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnCertificateDetailByIdResponse setBody(DescribeCdnCertificateDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnCertificateDetailByIdResponseBody getBody() {
        return this.body;
    }

}
