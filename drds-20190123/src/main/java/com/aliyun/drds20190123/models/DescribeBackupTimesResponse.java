// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupTimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupTimesResponseBody body;

    public static DescribeBackupTimesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTimesResponse self = new DescribeBackupTimesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupTimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupTimesResponse setBody(DescribeBackupTimesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupTimesResponseBody getBody() {
        return this.body;
    }

}
