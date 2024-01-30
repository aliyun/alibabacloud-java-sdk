// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBInstanceNetworkTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceNetworkTypeResponse setBody(ModifyDBInstanceNetworkTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceNetworkTypeResponseBody getBody() {
        return this.body;
    }

}
