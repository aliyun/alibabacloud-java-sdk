// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTemplatesResponseBody body;

    public static DescribeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponse self = new DescribeTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplatesResponse setBody(DescribeTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplatesResponseBody getBody() {
        return this.body;
    }

}
