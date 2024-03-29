// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHanaBackupPlanResponseBody body;

    public static UpdateHanaBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaBackupPlanResponse self = new UpdateHanaBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHanaBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHanaBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHanaBackupPlanResponse setBody(UpdateHanaBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHanaBackupPlanResponseBody getBody() {
        return this.body;
    }

}
