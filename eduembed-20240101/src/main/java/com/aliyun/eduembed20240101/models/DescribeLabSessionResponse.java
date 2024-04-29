// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLabSessionResponseBody body;

    public static DescribeLabSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabSessionResponse self = new DescribeLabSessionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLabSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLabSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLabSessionResponse setBody(DescribeLabSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLabSessionResponseBody getBody() {
        return this.body;
    }

}
