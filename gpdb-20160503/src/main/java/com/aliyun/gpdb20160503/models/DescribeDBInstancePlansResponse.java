// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancePlansResponseBody body;

    public static DescribeDBInstancePlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePlansResponse self = new DescribeDBInstancePlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancePlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancePlansResponse setBody(DescribeDBInstancePlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancePlansResponseBody getBody() {
        return this.body;
    }

}
