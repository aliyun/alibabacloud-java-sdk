// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DisableHanaBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableHanaBackupPlanResponseBody body;

    public static DisableHanaBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableHanaBackupPlanResponse self = new DisableHanaBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public DisableHanaBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableHanaBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableHanaBackupPlanResponse setBody(DisableHanaBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableHanaBackupPlanResponseBody getBody() {
        return this.body;
    }

}
