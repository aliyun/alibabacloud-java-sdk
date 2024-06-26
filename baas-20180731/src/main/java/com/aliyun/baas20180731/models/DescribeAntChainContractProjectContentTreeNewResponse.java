// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainContractProjectContentTreeNewResponseBody body;

    public static DescribeAntChainContractProjectContentTreeNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeNewResponse self = new DescribeAntChainContractProjectContentTreeNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainContractProjectContentTreeNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainContractProjectContentTreeNewResponse setBody(DescribeAntChainContractProjectContentTreeNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectContentTreeNewResponseBody getBody() {
        return this.body;
    }

}
