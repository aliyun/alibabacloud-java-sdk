// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStreamLocationBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamLocationBlockResponseBody body;

    public static DescribeStreamLocationBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamLocationBlockResponse self = new DescribeStreamLocationBlockResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamLocationBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamLocationBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamLocationBlockResponse setBody(DescribeStreamLocationBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamLocationBlockResponseBody getBody() {
        return this.body;
    }

}
