// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceSpecResponseBody body;

    public static ModifyDBInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecResponse self = new ModifyDBInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceSpecResponse setBody(ModifyDBInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
