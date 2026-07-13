// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAtiCertificateResponseBody body;

    public static DescribeAtiCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiCertificateResponse self = new DescribeAtiCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAtiCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAtiCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAtiCertificateResponse setBody(DescribeAtiCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAtiCertificateResponseBody getBody() {
        return this.body;
    }

}
