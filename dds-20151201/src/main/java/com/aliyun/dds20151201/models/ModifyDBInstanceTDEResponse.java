// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceTDEResponseBody body;

    public static ModifyDBInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceTDEResponse self = new ModifyDBInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceTDEResponse setBody(ModifyDBInstanceTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceTDEResponseBody getBody() {
        return this.body;
    }

}
