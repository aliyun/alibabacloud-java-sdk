// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceForDmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceForDmsResponseBody body;

    public static DescribeDBInstanceForDmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceForDmsResponse self = new DescribeDBInstanceForDmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceForDmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceForDmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceForDmsResponse setBody(DescribeDBInstanceForDmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceForDmsResponseBody getBody() {
        return this.body;
    }

}
