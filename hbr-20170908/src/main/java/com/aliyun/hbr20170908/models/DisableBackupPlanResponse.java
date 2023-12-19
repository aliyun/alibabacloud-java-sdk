// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DisableBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableBackupPlanResponseBody body;

    public static DisableBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableBackupPlanResponse self = new DisableBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public DisableBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableBackupPlanResponse setBody(DisableBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableBackupPlanResponseBody getBody() {
        return this.body;
    }

}
