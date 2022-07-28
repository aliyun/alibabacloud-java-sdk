// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StopBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopBackupPlanResponseBody body;

    public static StopBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBackupPlanResponse self = new StopBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public StopBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopBackupPlanResponse setBody(StopBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBackupPlanResponseBody getBody() {
        return this.body;
    }

}
