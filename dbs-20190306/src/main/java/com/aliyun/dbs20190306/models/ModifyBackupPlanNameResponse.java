// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyBackupPlanNameResponse setBody(ModifyBackupPlanNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPlanNameResponseBody getBody() {
        return this.body;
    }

}
