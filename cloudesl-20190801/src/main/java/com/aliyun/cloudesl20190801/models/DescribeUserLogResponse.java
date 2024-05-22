// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeUserLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserLogResponseBody body;

    public static DescribeUserLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogResponse self = new DescribeUserLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserLogResponse setBody(DescribeUserLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLogResponseBody getBody() {
        return this.body;
    }

}
