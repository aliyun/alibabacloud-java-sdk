// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteBackupPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupPlanResponse setBody(DeleteBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupPlanResponseBody getBody() {
        return this.body;
    }

}
