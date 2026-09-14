// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBVersionResponseBody body;

    public static DescribeDBVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBVersionResponse self = new DescribeDBVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBVersionResponse setBody(DescribeDBVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBVersionResponseBody getBody() {
        return this.body;
    }

}
