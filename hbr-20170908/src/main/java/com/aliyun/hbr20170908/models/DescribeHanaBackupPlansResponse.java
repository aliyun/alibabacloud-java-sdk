// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHanaBackupPlansResponseBody body;

    public static DescribeHanaBackupPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaBackupPlansResponse self = new DescribeHanaBackupPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaBackupPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaBackupPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaBackupPlansResponse setBody(DescribeHanaBackupPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaBackupPlansResponseBody getBody() {
        return this.body;
    }

}
