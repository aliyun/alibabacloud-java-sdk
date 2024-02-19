// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBInstanceSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceSSLResponse setBody(ModifyDBInstanceSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceSSLResponseBody getBody() {
        return this.body;
    }

}
