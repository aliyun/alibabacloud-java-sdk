// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class RenewBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewBackupPlanResponseBody body;

    public static RenewBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewBackupPlanResponse self = new RenewBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public RenewBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewBackupPlanResponse setBody(RenewBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewBackupPlanResponseBody getBody() {
        return this.body;
    }

}
