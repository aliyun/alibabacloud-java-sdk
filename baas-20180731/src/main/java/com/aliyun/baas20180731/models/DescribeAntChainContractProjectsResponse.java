// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainContractProjectsResponseBody body;

    public static DescribeAntChainContractProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectsResponse self = new DescribeAntChainContractProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainContractProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainContractProjectsResponse setBody(DescribeAntChainContractProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectsResponseBody getBody() {
        return this.body;
    }

}
