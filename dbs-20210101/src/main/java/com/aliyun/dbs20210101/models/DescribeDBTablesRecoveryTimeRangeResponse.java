// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDBTablesRecoveryTimeRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBTablesRecoveryTimeRangeResponseBody body;

    public static DescribeDBTablesRecoveryTimeRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBTablesRecoveryTimeRangeResponse self = new DescribeDBTablesRecoveryTimeRangeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBTablesRecoveryTimeRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBTablesRecoveryTimeRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBTablesRecoveryTimeRangeResponse setBody(DescribeDBTablesRecoveryTimeRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBTablesRecoveryTimeRangeResponseBody getBody() {
        return this.body;
    }

}
