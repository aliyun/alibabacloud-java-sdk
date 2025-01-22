// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBackupJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupJobResponseBody body;

    public static DescribeBackupJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupJobResponse self = new DescribeBackupJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupJobResponse setBody(DescribeBackupJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupJobResponseBody getBody() {
        return this.body;
    }

}
