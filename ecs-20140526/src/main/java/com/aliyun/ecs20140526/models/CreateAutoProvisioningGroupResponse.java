// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAutoProvisioningGroupResponse setBody(CreateAutoProvisioningGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoProvisioningGroupResponseBody getBody() {
        return this.body;
    }

}
