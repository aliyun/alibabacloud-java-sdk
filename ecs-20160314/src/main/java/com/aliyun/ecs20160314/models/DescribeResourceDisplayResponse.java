// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceDisplayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceDisplayResponseBody body;

    public static DescribeResourceDisplayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDisplayResponse self = new DescribeResourceDisplayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDisplayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceDisplayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceDisplayResponse setBody(DescribeResourceDisplayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceDisplayResponseBody getBody() {
        return this.body;
    }

}
