// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRegionBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkRegionBlockResponseBody body;

    public static DescribeNetworkRegionBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRegionBlockResponse self = new DescribeNetworkRegionBlockResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRegionBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkRegionBlockResponse setBody(DescribeNetworkRegionBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkRegionBlockResponseBody getBody() {
        return this.body;
    }

}
