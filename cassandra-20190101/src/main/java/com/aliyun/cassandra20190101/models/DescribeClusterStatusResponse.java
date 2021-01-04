// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterStatusResponseBody body;

    public static DescribeClusterStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterStatusResponse self = new DescribeClusterStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterStatusResponse setBody(DescribeClusterStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterStatusResponseBody getBody() {
        return this.body;
    }

}
