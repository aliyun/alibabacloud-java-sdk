// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaintenanceActionResponseBody body;

    public static ModifyMaintenanceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaintenanceActionResponse self = new ModifyMaintenanceActionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaintenanceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaintenanceActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaintenanceActionResponse setBody(ModifyMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
