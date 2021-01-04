// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBackupPlanResponseBody body;

    public static DeleteBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPlanResponse self = new DeleteBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupPlanResponse setBody(DeleteBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupPlanResponseBody getBody() {
        return this.body;
    }

}
