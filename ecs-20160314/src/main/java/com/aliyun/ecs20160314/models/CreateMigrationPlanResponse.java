// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateMigrationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMigrationPlanResponseBody body;

    public static CreateMigrationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationPlanResponse self = new CreateMigrationPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMigrationPlanResponse setBody(CreateMigrationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrationPlanResponseBody getBody() {
        return this.body;
    }

}
