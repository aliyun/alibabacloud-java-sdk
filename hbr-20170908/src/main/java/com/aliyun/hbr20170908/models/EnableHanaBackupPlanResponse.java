// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class EnableHanaBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
