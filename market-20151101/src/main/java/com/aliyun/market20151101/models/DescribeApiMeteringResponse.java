// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeApiMeteringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiMeteringResponseBody body;

    public static DescribeApiMeteringResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMeteringResponse self = new DescribeApiMeteringResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiMeteringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiMeteringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiMeteringResponse setBody(DescribeApiMeteringResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiMeteringResponseBody getBody() {
        return this.body;
    }

}
