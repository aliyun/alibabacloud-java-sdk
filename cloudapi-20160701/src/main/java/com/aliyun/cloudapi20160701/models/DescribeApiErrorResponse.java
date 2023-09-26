// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiErrorResponseBody body;

    public static DescribeApiErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiErrorResponse self = new DescribeApiErrorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiErrorResponse setBody(DescribeApiErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiErrorResponseBody getBody() {
        return this.body;
    }

}
