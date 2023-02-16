// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DescribeSlrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlrResponseBody body;

    public static DescribeSlrResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlrResponse self = new DescribeSlrResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlrResponse setBody(DescribeSlrResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlrResponseBody getBody() {
        return this.body;
    }

}
