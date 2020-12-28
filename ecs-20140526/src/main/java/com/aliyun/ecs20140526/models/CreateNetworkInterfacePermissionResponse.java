// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkInterfacePermissionResponseBody body;

    public static CreateNetworkInterfacePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfacePermissionResponse self = new CreateNetworkInterfacePermissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfacePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkInterfacePermissionResponse setBody(CreateNetworkInterfacePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkInterfacePermissionResponseBody getBody() {
        return this.body;
    }

}
