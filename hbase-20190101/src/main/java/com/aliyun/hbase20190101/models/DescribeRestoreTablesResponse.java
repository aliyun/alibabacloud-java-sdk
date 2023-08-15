// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreTablesResponseBody body;

    public static DescribeRestoreTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTablesResponse self = new DescribeRestoreTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreTablesResponse setBody(DescribeRestoreTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreTablesResponseBody getBody() {
        return this.body;
    }

}
