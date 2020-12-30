// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupDbsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupDbsResponseBody body;

    public static DescribeBackupDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDbsResponse self = new DescribeBackupDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupDbsResponse setBody(DescribeBackupDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupDbsResponseBody getBody() {
        return this.body;
    }

}
