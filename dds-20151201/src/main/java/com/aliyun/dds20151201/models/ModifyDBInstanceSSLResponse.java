// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceSSLResponseBody body;

    public static ModifyDBInstanceSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLResponse self = new ModifyDBInstanceSSLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceSSLResponse setBody(ModifyDBInstanceSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceSSLResponseBody getBody() {
        return this.body;
    }

}
