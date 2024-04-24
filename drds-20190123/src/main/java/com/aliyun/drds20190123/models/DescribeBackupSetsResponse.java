// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupSetsResponseBody body;

    public static DescribeBackupSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetsResponse self = new DescribeBackupSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupSetsResponse setBody(DescribeBackupSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetsResponseBody getBody() {
        return this.body;
    }

}
