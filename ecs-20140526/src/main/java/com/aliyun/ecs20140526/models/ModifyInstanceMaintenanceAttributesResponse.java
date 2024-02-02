// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceMaintenanceAttributesResponseBody body;

    public static ModifyInstanceMaintenanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintenanceAttributesResponse self = new ModifyInstanceMaintenanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintenanceAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMaintenanceAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMaintenanceAttributesResponse setBody(ModifyInstanceMaintenanceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMaintenanceAttributesResponseBody getBody() {
        return this.body;
    }

}
