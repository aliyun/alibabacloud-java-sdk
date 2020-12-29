// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAntChainCertificateApplicationsResponse setBody(DescribeAntChainCertificateApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainCertificateApplicationsResponseBody getBody() {
        return this.body;
    }

}
