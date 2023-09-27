// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiQpsResponseBody body;

    public static DescribeApiQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiQpsResponse self = new DescribeApiQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiQpsResponse setBody(DescribeApiQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiQpsResponseBody getBody() {
        return this.body;
    }

}
