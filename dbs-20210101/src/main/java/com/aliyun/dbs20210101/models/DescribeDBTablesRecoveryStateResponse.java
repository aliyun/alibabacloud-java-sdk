// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDBTablesRecoveryStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBTablesRecoveryStateResponseBody body;

    public static DescribeDBTablesRecoveryStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBTablesRecoveryStateResponse self = new DescribeDBTablesRecoveryStateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBTablesRecoveryStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBTablesRecoveryStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBTablesRecoveryStateResponse setBody(DescribeDBTablesRecoveryStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBTablesRecoveryStateResponseBody getBody() {
        return this.body;
    }

}
