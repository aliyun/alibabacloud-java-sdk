// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeShardDBsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeShardDBsResponseBody body;

    public static DescribeShardDBsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardDBsResponse self = new DescribeShardDBsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardDBsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShardDBsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeShardDBsResponse setBody(DescribeShardDBsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardDBsResponseBody getBody() {
        return this.body;
    }

}
