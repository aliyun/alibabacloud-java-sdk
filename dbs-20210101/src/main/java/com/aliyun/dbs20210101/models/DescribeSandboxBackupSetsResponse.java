// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxBackupSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSandboxBackupSetsResponseBody body;

    public static DescribeSandboxBackupSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxBackupSetsResponse self = new DescribeSandboxBackupSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxBackupSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSandboxBackupSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSandboxBackupSetsResponse setBody(DescribeSandboxBackupSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSandboxBackupSetsResponseBody getBody() {
        return this.body;
    }

}
