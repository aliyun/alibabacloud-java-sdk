// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoProvisioningGroupResponseBody body;

    public static CreateAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupResponse self = new CreateAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoProvisioningGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoProvisioningGroupResponse setBody(CreateAutoProvisioningGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoProvisioningGroupResponseBody getBody() {
        return this.body;
    }

}
