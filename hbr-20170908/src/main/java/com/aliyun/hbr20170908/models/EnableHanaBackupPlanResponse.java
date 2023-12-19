// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class EnableHanaBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableHanaBackupPlanResponseBody body;

    public static EnableHanaBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHanaBackupPlanResponse self = new EnableHanaBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public EnableHanaBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHanaBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHanaBackupPlanResponse setBody(EnableHanaBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHanaBackupPlanResponseBody getBody() {
        return this.body;
    }

}
