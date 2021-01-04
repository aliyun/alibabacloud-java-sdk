// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupResponseBody body;

    public static DescribeBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupResponse self = new DescribeBackupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupResponse setBody(DescribeBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupResponseBody getBody() {
        return this.body;
    }

}
