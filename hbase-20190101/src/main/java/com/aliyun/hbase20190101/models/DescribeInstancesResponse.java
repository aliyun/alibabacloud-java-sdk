// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancesResponseBody body;

    public static DescribeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponse self = new DescribeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstancesResponse setBody(DescribeInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancesResponseBody getBody() {
        return this.body;
    }

}
