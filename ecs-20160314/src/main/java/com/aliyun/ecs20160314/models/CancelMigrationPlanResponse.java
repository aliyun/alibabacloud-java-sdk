// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CancelMigrationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelMigrationPlanResponseBody body;

    public static CancelMigrationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrationPlanResponse self = new CancelMigrationPlanResponse();
        return TeaModel.build(map, self);
    }

    public CancelMigrationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMigrationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMigrationPlanResponse setBody(CancelMigrationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMigrationPlanResponseBody getBody() {
        return this.body;
    }

}
