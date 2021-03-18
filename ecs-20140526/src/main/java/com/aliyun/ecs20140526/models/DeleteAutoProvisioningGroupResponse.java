// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAutoProvisioningGroupResponseBody body;

    public static DeleteAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoProvisioningGroupResponse self = new DeleteAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoProvisioningGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoProvisioningGroupResponse setBody(DeleteAutoProvisioningGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoProvisioningGroupResponseBody getBody() {
        return this.body;
    }

}
