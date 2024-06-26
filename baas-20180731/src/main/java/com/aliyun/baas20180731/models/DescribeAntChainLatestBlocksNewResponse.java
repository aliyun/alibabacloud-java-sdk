// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainLatestBlocksNewResponseBody body;

    public static DescribeAntChainLatestBlocksNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksNewResponse self = new DescribeAntChainLatestBlocksNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainLatestBlocksNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainLatestBlocksNewResponse setBody(DescribeAntChainLatestBlocksNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainLatestBlocksNewResponseBody getBody() {
        return this.body;
    }

}
