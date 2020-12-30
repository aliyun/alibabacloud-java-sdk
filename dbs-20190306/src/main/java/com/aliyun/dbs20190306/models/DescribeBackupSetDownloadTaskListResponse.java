// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupSetDownloadTaskListResponseBody body;

    public static DescribeBackupSetDownloadTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadTaskListResponse self = new DescribeBackupSetDownloadTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetDownloadTaskListResponse setBody(DescribeBackupSetDownloadTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetDownloadTaskListResponseBody getBody() {
        return this.body;
    }

}
