// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainBlockResponseBody body;

    public static DescribeAntChainBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockResponse self = new DescribeAntChainBlockResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainBlockResponse setBody(DescribeAntChainBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainBlockResponseBody getBody() {
        return this.body;
    }

}
