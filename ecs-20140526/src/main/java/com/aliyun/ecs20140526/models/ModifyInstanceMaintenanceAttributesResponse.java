// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyInstanceMaintenanceAttributesResponse setBody(ModifyInstanceMaintenanceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMaintenanceAttributesResponseBody getBody() {
        return this.body;
    }

}
