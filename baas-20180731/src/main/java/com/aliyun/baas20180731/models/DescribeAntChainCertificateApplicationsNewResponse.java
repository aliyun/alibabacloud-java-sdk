// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainCertificateApplicationsNewResponseBody body;

    public static DescribeAntChainCertificateApplicationsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsNewResponse self = new DescribeAntChainCertificateApplicationsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainCertificateApplicationsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainCertificateApplicationsNewResponse setBody(DescribeAntChainCertificateApplicationsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainCertificateApplicationsNewResponseBody getBody() {
        return this.body;
    }

}
