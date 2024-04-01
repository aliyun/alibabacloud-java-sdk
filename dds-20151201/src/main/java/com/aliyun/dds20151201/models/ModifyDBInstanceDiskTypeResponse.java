// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDiskTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceDiskTypeResponseBody body;

    public static ModifyDBInstanceDiskTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDiskTypeResponse self = new ModifyDBInstanceDiskTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDiskTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceDiskTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceDiskTypeResponse setBody(ModifyDBInstanceDiskTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceDiskTypeResponseBody getBody() {
        return this.body;
    }

}
