// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPlanMaintenanceWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPlanMaintenanceWindowResponseBody body;

    public static ModifyPlanMaintenanceWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlanMaintenanceWindowResponse self = new ModifyPlanMaintenanceWindowResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPlanMaintenanceWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPlanMaintenanceWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPlanMaintenanceWindowResponse setBody(ModifyPlanMaintenanceWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPlanMaintenanceWindowResponseBody getBody() {
        return this.body;
    }

}
