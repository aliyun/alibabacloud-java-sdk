// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ReAddMigrationTaskInPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReAddMigrationTaskInPlanResponseBody body;

    public static ReAddMigrationTaskInPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ReAddMigrationTaskInPlanResponse self = new ReAddMigrationTaskInPlanResponse();
        return TeaModel.build(map, self);
    }

    public ReAddMigrationTaskInPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReAddMigrationTaskInPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReAddMigrationTaskInPlanResponse setBody(ReAddMigrationTaskInPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ReAddMigrationTaskInPlanResponseBody getBody() {
        return this.body;
    }

}
