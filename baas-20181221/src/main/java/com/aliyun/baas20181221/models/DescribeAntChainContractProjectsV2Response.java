// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainContractProjectsV2ResponseBody body;

    public static DescribeAntChainContractProjectsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectsV2Response self = new DescribeAntChainContractProjectsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainContractProjectsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainContractProjectsV2Response setBody(DescribeAntChainContractProjectsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectsV2ResponseBody getBody() {
        return this.body;
    }

}
