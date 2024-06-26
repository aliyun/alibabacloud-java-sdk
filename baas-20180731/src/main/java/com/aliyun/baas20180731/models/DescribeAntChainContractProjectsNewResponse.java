// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainContractProjectsNewResponseBody body;

    public static DescribeAntChainContractProjectsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectsNewResponse self = new DescribeAntChainContractProjectsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainContractProjectsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainContractProjectsNewResponse setBody(DescribeAntChainContractProjectsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectsNewResponseBody getBody() {
        return this.body;
    }

}
