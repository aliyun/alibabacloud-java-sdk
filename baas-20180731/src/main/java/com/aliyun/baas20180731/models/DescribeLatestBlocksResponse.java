// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatestBlocksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLatestBlocksResponseBody body;

    public static DescribeLatestBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestBlocksResponse self = new DescribeLatestBlocksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatestBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatestBlocksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatestBlocksResponse setBody(DescribeLatestBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatestBlocksResponseBody getBody() {
        return this.body;
    }

}
