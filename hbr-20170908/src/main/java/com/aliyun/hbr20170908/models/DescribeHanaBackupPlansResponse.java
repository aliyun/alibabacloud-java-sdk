// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
