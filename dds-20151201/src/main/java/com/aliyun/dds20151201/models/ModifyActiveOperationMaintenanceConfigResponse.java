// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintenanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyActiveOperationMaintenanceConfigResponseBody body;

    public static ModifyActiveOperationMaintenanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintenanceConfigResponse self = new ModifyActiveOperationMaintenanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintenanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActiveOperationMaintenanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyActiveOperationMaintenanceConfigResponse setBody(ModifyActiveOperationMaintenanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActiveOperationMaintenanceConfigResponseBody getBody() {
        return this.body;
    }

}
