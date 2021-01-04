// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupPlanResponseBody body;

    public static ModifyBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanResponse self = new ModifyBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupPlanResponse setBody(ModifyBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPlanResponseBody getBody() {
        return this.body;
    }

}
