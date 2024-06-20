// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainNodesV2ResponseBody body;

    public static DescribeAntChainNodesV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainNodesV2Response self = new DescribeAntChainNodesV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainNodesV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainNodesV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainNodesV2Response setBody(DescribeAntChainNodesV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainNodesV2ResponseBody getBody() {
        return this.body;
    }

}
