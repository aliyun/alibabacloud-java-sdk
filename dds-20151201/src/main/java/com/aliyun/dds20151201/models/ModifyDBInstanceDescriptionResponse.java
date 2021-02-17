// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceDescriptionResponseBody body;

    public static ModifyDBInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionResponse self = new ModifyDBInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceDescriptionResponse setBody(ModifyDBInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
