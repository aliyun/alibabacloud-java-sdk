// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceNetInfoResponseBody body;

    public static DescribeDBInstanceNetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponse self = new DescribeDBInstanceNetInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceNetInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceNetInfoResponse setBody(DescribeDBInstanceNetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceNetInfoResponseBody getBody() {
        return this.body;
    }

}
