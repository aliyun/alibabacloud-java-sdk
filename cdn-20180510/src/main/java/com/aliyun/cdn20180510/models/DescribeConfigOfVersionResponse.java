// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigOfVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigOfVersionResponseBody body;

    public static DescribeConfigOfVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOfVersionResponse self = new DescribeConfigOfVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOfVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigOfVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfigOfVersionResponse setBody(DescribeConfigOfVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigOfVersionResponseBody getBody() {
        return this.body;
    }

}
