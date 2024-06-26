// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainNodesNewResponseBody body;

    public static DescribeAntChainNodesNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainNodesNewResponse self = new DescribeAntChainNodesNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainNodesNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainNodesNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainNodesNewResponse setBody(DescribeAntChainNodesNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainNodesNewResponseBody getBody() {
        return this.body;
    }

}
