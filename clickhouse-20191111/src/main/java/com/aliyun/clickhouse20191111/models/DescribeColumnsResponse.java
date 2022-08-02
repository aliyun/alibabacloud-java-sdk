// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeColumnsResponseBody body;

    public static DescribeColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsResponse self = new DescribeColumnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColumnsResponse setBody(DescribeColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColumnsResponseBody getBody() {
        return this.body;
    }

}
