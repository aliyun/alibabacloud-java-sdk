// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupSetsResponseBody body;

    public static DescribeBackupSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetsResponse self = new DescribeBackupSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetsResponse setBody(DescribeBackupSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetsResponseBody getBody() {
        return this.body;
    }

}
