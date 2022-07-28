// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanBillingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupPlanBillingResponseBody body;

    public static DescribeBackupPlanBillingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanBillingResponse self = new DescribeBackupPlanBillingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanBillingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPlanBillingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupPlanBillingResponse setBody(DescribeBackupPlanBillingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPlanBillingResponseBody getBody() {
        return this.body;
    }

}
