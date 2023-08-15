// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupStatusResponseBody body;

    public static DescribeBackupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStatusResponse self = new DescribeBackupStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupStatusResponse setBody(DescribeBackupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupStatusResponseBody getBody() {
        return this.body;
    }

}
