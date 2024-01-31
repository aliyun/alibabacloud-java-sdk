// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterEventsResponseBody body;

    public static DescribeClusterEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterEventsResponse self = new DescribeClusterEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterEventsResponse setBody(DescribeClusterEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterEventsResponseBody getBody() {
        return this.body;
    }

}
