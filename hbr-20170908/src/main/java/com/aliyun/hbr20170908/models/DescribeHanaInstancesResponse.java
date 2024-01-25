// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHanaInstancesResponseBody body;

    public static DescribeHanaInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaInstancesResponse self = new DescribeHanaInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaInstancesResponse setBody(DescribeHanaInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaInstancesResponseBody getBody() {
        return this.body;
    }

}
