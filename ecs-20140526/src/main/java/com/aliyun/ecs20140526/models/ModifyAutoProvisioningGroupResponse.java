// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoProvisioningGroupResponseBody body;

    public static ModifyAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoProvisioningGroupResponse self = new ModifyAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoProvisioningGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoProvisioningGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoProvisioningGroupResponse setBody(ModifyAutoProvisioningGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoProvisioningGroupResponseBody getBody() {
        return this.body;
    }

}
