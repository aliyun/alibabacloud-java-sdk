// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDBTablesRecoveryBackupSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBTablesRecoveryBackupSetResponseBody body;

    public static DescribeDBTablesRecoveryBackupSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBTablesRecoveryBackupSetResponse self = new DescribeDBTablesRecoveryBackupSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBTablesRecoveryBackupSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBTablesRecoveryBackupSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBTablesRecoveryBackupSetResponse setBody(DescribeDBTablesRecoveryBackupSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBTablesRecoveryBackupSetResponseBody getBody() {
        return this.body;
    }

}
