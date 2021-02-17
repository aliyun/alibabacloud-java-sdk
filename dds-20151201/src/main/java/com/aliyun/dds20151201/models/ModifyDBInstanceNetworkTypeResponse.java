// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceNetworkTypeResponseBody body;

    public static ModifyDBInstanceNetworkTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeResponse self = new ModifyDBInstanceNetworkTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceNetworkTypeResponse setBody(ModifyDBInstanceNetworkTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceNetworkTypeResponseBody getBody() {
        return this.body;
    }

}
