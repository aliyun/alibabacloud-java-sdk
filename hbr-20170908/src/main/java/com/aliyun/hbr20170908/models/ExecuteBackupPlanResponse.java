// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecuteBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteBackupPlanResponseBody body;

    public static ExecuteBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBackupPlanResponse self = new ExecuteBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteBackupPlanResponse setBody(ExecuteBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteBackupPlanResponseBody getBody() {
        return this.body;
    }

}
