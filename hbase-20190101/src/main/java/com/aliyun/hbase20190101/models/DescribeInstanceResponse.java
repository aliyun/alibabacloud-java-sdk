// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceResponseBody body;

    public static DescribeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponse self = new DescribeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceResponse setBody(DescribeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceResponseBody getBody() {
        return this.body;
    }

}
