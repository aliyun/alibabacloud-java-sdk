// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadBackupSetStorageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadBackupSetStorageInfoResponseBody body;

    public static DescribeDownloadBackupSetStorageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadBackupSetStorageInfoResponse self = new DescribeDownloadBackupSetStorageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadBackupSetStorageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadBackupSetStorageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadBackupSetStorageInfoResponse setBody(DescribeDownloadBackupSetStorageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadBackupSetStorageInfoResponseBody getBody() {
        return this.body;
    }

}
