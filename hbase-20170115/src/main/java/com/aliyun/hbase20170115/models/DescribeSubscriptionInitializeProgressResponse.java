// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInitializeProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscriptionInitializeProgressResponseBody body;

    public static DescribeSubscriptionInitializeProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInitializeProgressResponse self = new DescribeSubscriptionInitializeProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInitializeProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionInitializeProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionInitializeProgressResponse setBody(DescribeSubscriptionInitializeProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionInitializeProgressResponseBody getBody() {
        return this.body;
    }

}
