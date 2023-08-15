// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackupPlanResponseBody body;

    public static CreateBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPlanResponse self = new CreateBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackupPlanResponse setBody(CreateBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupPlanResponseBody getBody() {
        return this.body;
    }

}
