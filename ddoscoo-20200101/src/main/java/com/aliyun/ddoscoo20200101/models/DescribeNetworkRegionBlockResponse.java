// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRegionBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeNetworkRegionBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkRegionBlockResponse setBody(DescribeNetworkRegionBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkRegionBlockResponseBody getBody() {
        return this.body;
    }

}
