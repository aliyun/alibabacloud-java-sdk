// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePlanMaintenanceWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePlanMaintenanceWindowResponseBody body;

    public static DeletePlanMaintenanceWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePlanMaintenanceWindowResponse self = new DeletePlanMaintenanceWindowResponse();
        return TeaModel.build(map, self);
    }

    public DeletePlanMaintenanceWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePlanMaintenanceWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePlanMaintenanceWindowResponse setBody(DeletePlanMaintenanceWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePlanMaintenanceWindowResponseBody getBody() {
        return this.body;
    }

}
