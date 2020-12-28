// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkInterfaceResponseBody body;

    public static CreateNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponse self = new CreateNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkInterfaceResponse setBody(CreateNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
