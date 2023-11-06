// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceDbsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDbInstanceDbsResponseBody body;

    public static DescribeDbInstanceDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceDbsResponse self = new DescribeDbInstanceDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbInstanceDbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbInstanceDbsResponse setBody(DescribeDbInstanceDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbInstanceDbsResponseBody getBody() {
        return this.body;
    }

}
