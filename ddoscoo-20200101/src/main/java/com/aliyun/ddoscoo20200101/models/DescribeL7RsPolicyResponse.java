// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7RsPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeL7RsPolicyResponseBody body;

    public static DescribeL7RsPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7RsPolicyResponse self = new DescribeL7RsPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeL7RsPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeL7RsPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeL7RsPolicyResponse setBody(DescribeL7RsPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeL7RsPolicyResponseBody getBody() {
        return this.body;
    }

}
