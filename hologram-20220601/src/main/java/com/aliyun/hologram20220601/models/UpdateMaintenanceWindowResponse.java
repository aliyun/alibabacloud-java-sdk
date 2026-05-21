// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateMaintenanceWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMaintenanceWindowResponseBody body;

    public static UpdateMaintenanceWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaintenanceWindowResponse self = new UpdateMaintenanceWindowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMaintenanceWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMaintenanceWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMaintenanceWindowResponse setBody(UpdateMaintenanceWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMaintenanceWindowResponseBody getBody() {
        return this.body;
    }

}
