// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class UpgradeBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeBackupPlanResponseBody body;

    public static UpgradeBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupPlanResponse self = new UpgradeBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeBackupPlanResponse setBody(UpgradeBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeBackupPlanResponseBody getBody() {
        return this.body;
    }

}
