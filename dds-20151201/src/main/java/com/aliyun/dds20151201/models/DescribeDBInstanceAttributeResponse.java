// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceAttributeResponseBody body;

    public static DescribeDBInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponse self = new DescribeDBInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceAttributeResponse setBody(DescribeDBInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
