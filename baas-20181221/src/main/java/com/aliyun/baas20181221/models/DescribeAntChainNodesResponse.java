// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainNodesResponseBody body;

    public static DescribeAntChainNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainNodesResponse self = new DescribeAntChainNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainNodesResponse setBody(DescribeAntChainNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainNodesResponseBody getBody() {
        return this.body;
    }

}
