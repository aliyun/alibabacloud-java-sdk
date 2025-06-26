// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceConfigResponseBody body;

    public static DescribeDBInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigResponse self = new DescribeDBInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceConfigResponse setBody(DescribeDBInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
