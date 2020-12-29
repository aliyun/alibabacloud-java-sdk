// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAntChainBlockResponse setBody(DescribeAntChainBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainBlockResponseBody getBody() {
        return this.body;
    }

}
