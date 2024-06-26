// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupDbsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupDbsResponseBody body;

    public static DescribeBackupDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDbsResponse self = new DescribeBackupDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupDbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupDbsResponse setBody(DescribeBackupDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupDbsResponseBody getBody() {
        return this.body;
    }

}
