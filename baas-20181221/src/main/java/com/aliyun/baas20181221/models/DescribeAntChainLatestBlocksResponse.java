// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainLatestBlocksResponseBody body;

    public static DescribeAntChainLatestBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksResponse self = new DescribeAntChainLatestBlocksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainLatestBlocksResponse setBody(DescribeAntChainLatestBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestBlocksResponseBody getBody() {
        return this.body;
    }

}
