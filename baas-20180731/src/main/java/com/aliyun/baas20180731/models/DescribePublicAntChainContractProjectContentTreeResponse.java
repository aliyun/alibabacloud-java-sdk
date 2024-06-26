// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicAntChainContractProjectContentTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePublicAntChainContractProjectContentTreeResponseBody body;

    public static DescribePublicAntChainContractProjectContentTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicAntChainContractProjectContentTreeResponse self = new DescribePublicAntChainContractProjectContentTreeResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublicAntChainContractProjectContentTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePublicAntChainContractProjectContentTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePublicAntChainContractProjectContentTreeResponse setBody(DescribePublicAntChainContractProjectContentTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePublicAntChainContractProjectContentTreeResponseBody getBody() {
        return this.body;
    }

}
