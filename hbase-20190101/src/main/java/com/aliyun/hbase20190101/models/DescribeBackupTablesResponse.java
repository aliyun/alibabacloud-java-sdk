// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupTablesResponseBody body;

    public static DescribeBackupTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTablesResponse self = new DescribeBackupTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupTablesResponse setBody(DescribeBackupTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupTablesResponseBody getBody() {
        return this.body;
    }

}
