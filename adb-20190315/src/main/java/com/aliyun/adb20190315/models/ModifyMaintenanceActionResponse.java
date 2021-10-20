// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyMaintenanceActionResponse setBody(ModifyMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
