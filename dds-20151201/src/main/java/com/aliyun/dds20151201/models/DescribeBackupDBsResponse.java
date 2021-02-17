// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupDBsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupDBsResponseBody body;

    public static DescribeBackupDBsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDBsResponse self = new DescribeBackupDBsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDBsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupDBsResponse setBody(DescribeBackupDBsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupDBsResponseBody getBody() {
        return this.body;
    }

}
