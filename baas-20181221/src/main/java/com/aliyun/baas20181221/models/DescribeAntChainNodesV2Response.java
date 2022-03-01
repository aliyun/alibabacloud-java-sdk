// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAntChainNodesV2Response setBody(DescribeAntChainNodesV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainNodesV2ResponseBody getBody() {
        return this.body;
    }

}
