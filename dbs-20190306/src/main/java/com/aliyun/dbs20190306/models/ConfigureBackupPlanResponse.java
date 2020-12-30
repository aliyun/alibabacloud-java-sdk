// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ConfigureBackupPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureBackupPlanResponseBody body;

    public static ConfigureBackupPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureBackupPlanResponse self = new ConfigureBackupPlanResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureBackupPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureBackupPlanResponse setBody(ConfigureBackupPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureBackupPlanResponseBody getBody() {
        return this.body;
    }

}
