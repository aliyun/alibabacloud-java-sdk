// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserErStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserErStatusResponseBody body;

    public static DescribeUserErStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserErStatusResponse self = new DescribeUserErStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserErStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserErStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserErStatusResponse setBody(DescribeUserErStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserErStatusResponseBody getBody() {
        return this.body;
    }

}
