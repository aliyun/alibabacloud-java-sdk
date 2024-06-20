// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAntChainNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainNodesResponse setBody(DescribeAntChainNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainNodesResponseBody getBody() {
        return this.body;
    }

}
