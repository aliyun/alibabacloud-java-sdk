// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeFullBackupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFullBackupListResponseBody body;

    public static DescribeFullBackupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullBackupListResponse self = new DescribeFullBackupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFullBackupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFullBackupListResponse setBody(DescribeFullBackupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFullBackupListResponseBody getBody() {
        return this.body;
    }

}
