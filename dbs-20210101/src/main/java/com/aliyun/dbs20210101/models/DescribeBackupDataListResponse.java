// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBackupDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupDataListResponseBody body;

    public static DescribeBackupDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDataListResponse self = new DescribeBackupDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupDataListResponse setBody(DescribeBackupDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupDataListResponseBody getBody() {
        return this.body;
    }

}
