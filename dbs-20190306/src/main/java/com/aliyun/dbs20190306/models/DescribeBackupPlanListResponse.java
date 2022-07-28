// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupPlanListResponseBody body;

    public static DescribeBackupPlanListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanListResponse self = new DescribeBackupPlanListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPlanListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupPlanListResponse setBody(DescribeBackupPlanListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPlanListResponseBody getBody() {
        return this.body;
    }

}
