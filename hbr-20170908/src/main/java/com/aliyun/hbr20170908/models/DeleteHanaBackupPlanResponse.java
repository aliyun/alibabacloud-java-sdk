// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteHanaBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHanaBackupPlanResponseBody body;

    public static DeleteHanaBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHanaBackupPlanResponse self = new DeleteHanaBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHanaBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHanaBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHanaBackupPlanResponse setBody(DeleteHanaBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHanaBackupPlanResponseBody getBody() {
        return this.body;
    }

}
