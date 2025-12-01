// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackupPlanNameResponseBody body;

    public static ModifyBackupPlanNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanNameResponse self = new ModifyBackupPlanNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupPlanNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupPlanNameResponse setBody(ModifyBackupPlanNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPlanNameResponseBody getBody() {
        return this.body;
    }

}
