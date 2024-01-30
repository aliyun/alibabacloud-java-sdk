// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceNetExpireTimeResponseBody body;

    public static ModifyDBInstanceNetExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetExpireTimeResponse self = new ModifyDBInstanceNetExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceNetExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceNetExpireTimeResponse setBody(ModifyDBInstanceNetExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceNetExpireTimeResponseBody getBody() {
        return this.body;
    }

}
