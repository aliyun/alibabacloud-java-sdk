// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkInterfacePermissionResponseBody body;

    public static DeleteNetworkInterfacePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacePermissionResponse self = new DeleteNetworkInterfacePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkInterfacePermissionResponse setBody(DeleteNetworkInterfacePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkInterfacePermissionResponseBody getBody() {
        return this.body;
    }

}
