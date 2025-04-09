// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSpecInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceSpecInfoResponseBody body;

    public static DescribeDBInstanceSpecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSpecInfoResponse self = new DescribeDBInstanceSpecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSpecInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSpecInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceSpecInfoResponse setBody(DescribeDBInstanceSpecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSpecInfoResponseBody getBody() {
        return this.body;
    }

}
