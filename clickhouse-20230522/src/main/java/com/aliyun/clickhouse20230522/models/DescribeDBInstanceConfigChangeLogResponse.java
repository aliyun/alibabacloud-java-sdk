// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigChangeLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceConfigChangeLogResponseBody body;

    public static DescribeDBInstanceConfigChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigChangeLogResponse self = new DescribeDBInstanceConfigChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigChangeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceConfigChangeLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceConfigChangeLogResponse setBody(DescribeDBInstanceConfigChangeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceConfigChangeLogResponseBody getBody() {
        return this.body;
    }

}
