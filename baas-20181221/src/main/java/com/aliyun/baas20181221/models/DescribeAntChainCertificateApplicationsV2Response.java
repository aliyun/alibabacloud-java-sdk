// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainCertificateApplicationsV2ResponseBody body;

    public static DescribeAntChainCertificateApplicationsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsV2Response self = new DescribeAntChainCertificateApplicationsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainCertificateApplicationsV2Response setBody(DescribeAntChainCertificateApplicationsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainCertificateApplicationsV2ResponseBody getBody() {
        return this.body;
    }

}
