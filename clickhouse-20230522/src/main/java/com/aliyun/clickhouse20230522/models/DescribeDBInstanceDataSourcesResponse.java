// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceDataSourcesResponseBody body;

    public static DescribeDBInstanceDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataSourcesResponse self = new DescribeDBInstanceDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceDataSourcesResponse setBody(DescribeDBInstanceDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceDataSourcesResponseBody getBody() {
        return this.body;
    }

}
