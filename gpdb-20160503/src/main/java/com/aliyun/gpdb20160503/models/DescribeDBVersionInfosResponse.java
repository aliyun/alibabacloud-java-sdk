// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBVersionInfosResponseBody body;

    public static DescribeDBVersionInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBVersionInfosResponse self = new DescribeDBVersionInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBVersionInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBVersionInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBVersionInfosResponse setBody(DescribeDBVersionInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBVersionInfosResponseBody getBody() {
        return this.body;
    }

}
