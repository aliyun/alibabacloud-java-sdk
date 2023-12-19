// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBackupPlanResponseBody body;

    public static UpdateBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPlanResponse self = new UpdateBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBackupPlanResponse setBody(UpdateBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBackupPlanResponseBody getBody() {
        return this.body;
    }

}
