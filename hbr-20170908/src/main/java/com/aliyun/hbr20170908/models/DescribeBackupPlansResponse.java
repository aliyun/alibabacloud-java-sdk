// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupPlansResponseBody body;

    public static DescribeBackupPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlansResponse self = new DescribeBackupPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupPlansResponse setBody(DescribeBackupPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPlansResponseBody getBody() {
        return this.body;
    }

}
