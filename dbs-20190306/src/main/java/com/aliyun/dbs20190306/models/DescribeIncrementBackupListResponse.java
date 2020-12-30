// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeIncrementBackupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIncrementBackupListResponseBody body;

    public static DescribeIncrementBackupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIncrementBackupListResponse self = new DescribeIncrementBackupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIncrementBackupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIncrementBackupListResponse setBody(DescribeIncrementBackupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIncrementBackupListResponseBody getBody() {
        return this.body;
    }

}
