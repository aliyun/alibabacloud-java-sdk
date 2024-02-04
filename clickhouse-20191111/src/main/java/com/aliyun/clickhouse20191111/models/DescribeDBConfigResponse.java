// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBConfigResponseBody body;

    public static DescribeDBConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBConfigResponse self = new DescribeDBConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBConfigResponse setBody(DescribeDBConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBConfigResponseBody getBody() {
        return this.body;
    }

}
