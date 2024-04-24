// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupLocalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupLocalResponseBody body;

    public static DescribeBackupLocalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLocalResponse self = new DescribeBackupLocalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLocalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupLocalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupLocalResponse setBody(DescribeBackupLocalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupLocalResponseBody getBody() {
        return this.body;
    }

}
