// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataBloatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceDataBloatResponseBody body;

    public static DescribeDBInstanceDataBloatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataBloatResponse self = new DescribeDBInstanceDataBloatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataBloatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceDataBloatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceDataBloatResponse setBody(DescribeDBInstanceDataBloatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceDataBloatResponseBody getBody() {
        return this.body;
    }

}
