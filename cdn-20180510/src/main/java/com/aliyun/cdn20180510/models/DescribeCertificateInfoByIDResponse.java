// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCertificateInfoByIDResponseBody body;

    public static DescribeCertificateInfoByIDResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateInfoByIDResponse self = new DescribeCertificateInfoByIDResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateInfoByIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateInfoByIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCertificateInfoByIDResponse setBody(DescribeCertificateInfoByIDResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateInfoByIDResponseBody getBody() {
        return this.body;
    }

}
