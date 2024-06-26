// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeNetstatURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetstatURLResponseBody body;

    public static DescribeNetstatURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetstatURLResponse self = new DescribeNetstatURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetstatURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetstatURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetstatURLResponse setBody(DescribeNetstatURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetstatURLResponseBody getBody() {
        return this.body;
    }

}
