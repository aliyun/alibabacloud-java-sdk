// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class EnableBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableBackupPlanResponseBody body;

    public static EnableBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupPlanResponse self = new EnableBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public EnableBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableBackupPlanResponse setBody(EnableBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBackupPlanResponseBody getBody() {
        return this.body;
    }

}
