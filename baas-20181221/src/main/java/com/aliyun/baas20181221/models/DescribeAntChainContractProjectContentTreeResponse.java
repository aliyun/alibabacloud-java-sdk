// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainContractProjectContentTreeResponseBody body;

    public static DescribeAntChainContractProjectContentTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeResponse self = new DescribeAntChainContractProjectContentTreeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainContractProjectContentTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainContractProjectContentTreeResponse setBody(DescribeAntChainContractProjectContentTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectContentTreeResponseBody getBody() {
        return this.body;
    }

}
