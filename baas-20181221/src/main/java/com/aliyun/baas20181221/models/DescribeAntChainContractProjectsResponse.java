// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAntChainContractProjectsResponse setBody(DescribeAntChainContractProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainContractProjectsResponseBody getBody() {
        return this.body;
    }

}
