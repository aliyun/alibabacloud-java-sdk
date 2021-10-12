// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDBInstanceSecurityIpsResponse setBody(ModifyDBInstanceSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
