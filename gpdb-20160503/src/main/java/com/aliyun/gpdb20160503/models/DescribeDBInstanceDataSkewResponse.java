// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataSkewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceDataSkewResponseBody body;

    public static DescribeDBInstanceDataSkewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataSkewResponse self = new DescribeDBInstanceDataSkewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataSkewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceDataSkewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceDataSkewResponse setBody(DescribeDBInstanceDataSkewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceDataSkewResponseBody getBody() {
        return this.body;
    }

}
