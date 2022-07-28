// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupStrategyResponseBody body;

    public static ModifyBackupStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupStrategyResponse self = new ModifyBackupStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupStrategyResponse setBody(ModifyBackupStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupStrategyResponseBody getBody() {
        return this.body;
    }

}
