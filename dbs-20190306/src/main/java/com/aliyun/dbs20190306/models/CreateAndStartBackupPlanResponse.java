// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateAndStartBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAndStartBackupPlanResponseBody body;

    public static CreateAndStartBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndStartBackupPlanResponse self = new CreateAndStartBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndStartBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndStartBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndStartBackupPlanResponse setBody(CreateAndStartBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndStartBackupPlanResponseBody getBody() {
        return this.body;
    }

}
