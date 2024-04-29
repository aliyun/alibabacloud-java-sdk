// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ModifyDBTablesRecoveryStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBTablesRecoveryStateResponseBody body;

    public static ModifyDBTablesRecoveryStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBTablesRecoveryStateResponse self = new ModifyDBTablesRecoveryStateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBTablesRecoveryStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBTablesRecoveryStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBTablesRecoveryStateResponse setBody(ModifyDBTablesRecoveryStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBTablesRecoveryStateResponseBody getBody() {
        return this.body;
    }

}
