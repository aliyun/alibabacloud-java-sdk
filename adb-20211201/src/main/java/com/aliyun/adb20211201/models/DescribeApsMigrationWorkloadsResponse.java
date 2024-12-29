// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsMigrationWorkloadsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsMigrationWorkloadsResponseBody body;

    public static DescribeApsMigrationWorkloadsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsMigrationWorkloadsResponse self = new DescribeApsMigrationWorkloadsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsMigrationWorkloadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsMigrationWorkloadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsMigrationWorkloadsResponse setBody(DescribeApsMigrationWorkloadsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsMigrationWorkloadsResponseBody getBody() {
        return this.body;
    }

}
