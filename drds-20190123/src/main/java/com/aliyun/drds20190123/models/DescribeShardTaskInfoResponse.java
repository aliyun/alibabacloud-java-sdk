// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeShardTaskInfoResponseBody body;

    public static DescribeShardTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskInfoResponse self = new DescribeShardTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShardTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeShardTaskInfoResponse setBody(DescribeShardTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShardTaskInfoResponseBody getBody() {
        return this.body;
    }

}
