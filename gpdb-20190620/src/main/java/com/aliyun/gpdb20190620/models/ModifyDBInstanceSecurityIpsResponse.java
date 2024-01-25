// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceSecurityIpsResponseBody body;

    public static ModifyDBInstanceSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSecurityIpsResponse self = new ModifyDBInstanceSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceSecurityIpsResponse setBody(ModifyDBInstanceSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
