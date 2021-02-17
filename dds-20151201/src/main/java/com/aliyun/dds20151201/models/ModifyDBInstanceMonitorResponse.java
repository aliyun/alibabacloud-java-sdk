// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceMonitorResponseBody body;

    public static ModifyDBInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMonitorResponse self = new ModifyDBInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceMonitorResponse setBody(ModifyDBInstanceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceMonitorResponseBody getBody() {
        return this.body;
    }

}
