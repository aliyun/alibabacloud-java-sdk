// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupStorageResponseBody body;

    public static DescribeBackupStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStorageResponse self = new DescribeBackupStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupStorageResponse setBody(DescribeBackupStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupStorageResponseBody getBody() {
        return this.body;
    }

}
