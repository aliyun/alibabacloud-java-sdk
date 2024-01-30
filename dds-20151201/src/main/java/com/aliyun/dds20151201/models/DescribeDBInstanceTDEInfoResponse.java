// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceTDEInfoResponseBody body;

    public static DescribeDBInstanceTDEInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEInfoResponse self = new DescribeDBInstanceTDEInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceTDEInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceTDEInfoResponse setBody(DescribeDBInstanceTDEInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceTDEInfoResponseBody getBody() {
        return this.body;
    }

}
