// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceClassResponseBody body;

    public static ModifyDBInstanceClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassResponse self = new ModifyDBInstanceClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceClassResponse setBody(ModifyDBInstanceClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceClassResponseBody getBody() {
        return this.body;
    }

}
