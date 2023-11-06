// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackMenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackMenuResponseBody body;

    public static DescribeBackMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackMenuResponse self = new DescribeBackMenuResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackMenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackMenuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackMenuResponse setBody(DescribeBackMenuResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackMenuResponseBody getBody() {
        return this.body;
    }

}
