// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscriptionsResponseBody body;

    public static DescribeSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionsResponse self = new DescribeSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionsResponse setBody(DescribeSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
