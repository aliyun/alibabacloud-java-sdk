// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainCertificateApplicationsResponseBody body;

    public static DescribeAntChainCertificateApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsResponse self = new DescribeAntChainCertificateApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainCertificateApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainCertificateApplicationsResponse setBody(DescribeAntChainCertificateApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainCertificateApplicationsResponseBody getBody() {
        return this.body;
    }

}
