// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateNetworkInterfacePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkInterfacePermissionResponse setBody(CreateNetworkInterfacePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkInterfacePermissionResponseBody getBody() {
        return this.body;
    }

}
