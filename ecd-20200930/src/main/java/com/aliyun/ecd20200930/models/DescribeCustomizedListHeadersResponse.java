// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCustomizedListHeadersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizedListHeadersResponseBody body;

    public static DescribeCustomizedListHeadersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedListHeadersResponse self = new DescribeCustomizedListHeadersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedListHeadersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizedListHeadersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizedListHeadersResponse setBody(DescribeCustomizedListHeadersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizedListHeadersResponseBody getBody() {
        return this.body;
    }

}
