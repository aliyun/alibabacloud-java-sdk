// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvocationResultsResponseBody body;

    public static DescribeInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsResponse self = new DescribeInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvocationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvocationResultsResponse setBody(DescribeInvocationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvocationResultsResponseBody getBody() {
        return this.body;
    }

}
