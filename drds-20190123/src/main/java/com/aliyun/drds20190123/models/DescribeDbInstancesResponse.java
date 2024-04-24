// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbInstancesResponseBody body;

    public static DescribeDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstancesResponse self = new DescribeDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbInstancesResponse setBody(DescribeDbInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbInstancesResponseBody getBody() {
        return this.body;
    }

}
