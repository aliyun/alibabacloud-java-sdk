// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class CreateBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateBackupPlanResponse setBody(CreateBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupPlanResponseBody getBody() {
        return this.body;
    }

}
