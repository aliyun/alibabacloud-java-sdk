// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupPlanConfigResponseBody body;

    public static ModifyBackupPlanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanConfigResponse self = new ModifyBackupPlanConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupPlanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupPlanConfigResponse setBody(ModifyBackupPlanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupPlanConfigResponseBody getBody() {
        return this.body;
    }

}
