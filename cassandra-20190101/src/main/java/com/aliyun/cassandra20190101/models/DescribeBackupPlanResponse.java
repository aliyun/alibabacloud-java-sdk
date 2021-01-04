// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupPlanResponseBody body;

    public static DescribeBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanResponse self = new DescribeBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPlanResponse setBody(DescribeBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPlanResponseBody getBody() {
        return this.body;
    }

}
